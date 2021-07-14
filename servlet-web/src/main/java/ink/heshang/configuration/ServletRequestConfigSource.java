package ink.heshang.configuration;

import org.apache.commons.configuration.web.ServletRequestConfiguration;
import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/**
 * 用 MicroProfile Config 重写{@link ServletRequestConfiguration}
 *
 * @Author 微信公众号《和尚的破功之路》
 * @Date 2021/7/14 22:16
 */
public class ServletRequestConfigSource extends MapBasedConfigSource{

    private ServletRequest request;

    protected ServletRequestConfigSource(ServletRequest request) {
        super("ServletRequest init",500);
        this.request = request;
    }

    @Override
    protected void prepareConfigData(Map configData) throws Throwable {
        Enumeration<String> parameterNames = this.request.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String parameterName = parameterNames.nextElement();
            String[] values = request.getParameterValues(parameterName);
            if (values != null && values.length!=0) {
                if (values.length == 1) {
                    configData.put(parameterName, values[0]);
                } else {
                    List<Object> result = new ArrayList<>(values.length);
                    for (String value : values) {
                        result.add(value);
                    }
                    configData.put(parameterName, result);
                }
            }
        }
    }
}
