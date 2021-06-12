package ink.heshang.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * servlet实现
 *
 * @Author 微信公众号《和尚的破功之路》
 * @Date 2021/6/12 17:36
 */
@WebServlet(name = "MyServlet",urlPatterns = {"/my"})
public class MyServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("myServlet.jsp").forward(req, resp);
    }
}
