import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

//webServlet配置资源路径
@WebServlet({"/tomcat","/tomcat1"})
public class ServletDemo01 implements Servlet {
    //初始化的方法init 只执行一次
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    //service方法提供服务的方法,执行多次
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("tomcat部署了吗?");
        System.out.println("=============");

    }

    @Override
    public String getServletInfo() {
        return null;
    }
    //destroy()方法,执行销毁,只执行一次
    //destroy()方法在servlet被执行销毁前执行,一般释放资源
    @Override
    public void destroy() {

    }
}
