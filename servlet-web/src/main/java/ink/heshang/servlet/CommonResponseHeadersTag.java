package ink.heshang.servlet;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * diy 返回请求头
 *
 * @Author 微信公众号《和尚的破功之路》
 * @Date 2021/7/7 08:45
 */
//public class CommonResponseHeadersTag extends SimpleTagSupport {
public class CommonResponseHeadersTag {
    //@Override
    public void doTag() throws JspException, IOException {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletResponse response = attributes.getResponse();
        response.setHeader("Cache-Control", "no-cache");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", -1);
    }
}
