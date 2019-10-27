import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet("/tomcat3")
public class ServletDemo02 implements Servlet {
    //初始化执行或第一次启动时候执行,只执行一次
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    //现实servlet的方法,多次执行
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet部署好了吗?");
    }

    @Override
    public String getServletInfo() {
        return null;
    }
    //销毁的方法
    @Override
    public void destroy() {

    }
}
