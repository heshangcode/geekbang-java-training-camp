package ink.heshang.servlet;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * TODO
 *
 * @Author 微信公众号《和尚的破功之路》
 * @Date 2021/7/7 23:09
 */
public class CommonResponseHeadersTag extends SimpleTagSupport {

    private String cacheControl;

    public String getCacheControl() {
        return cacheControl;
    }

    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    @Override
    public void doTag() throws JspException, IOException {
        System.out.println(cacheControl);
        //ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        //HttpServletResponse response = attributes.getResponse();
        //response.setHeader("Cache-Control", cacheControl);
    }


}
