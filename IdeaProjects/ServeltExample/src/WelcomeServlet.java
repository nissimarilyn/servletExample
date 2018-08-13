import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class WelcomeServlet implements Servlet {


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("Inside getServletConfig method");
        return null;

    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
System.out.println("inside service method");
        PrintWriter printWriter= servletResponse.getWriter();
        printWriter.print("<html><body>");
        printWriter.print("<h1> Welcome to servlet programming </h1>");
        printWriter.print("</body></html>");

    }

    @Override
    public String getServletInfo() {
        System.out.println("Inside getServlet info method ");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("Inside Destroy Method");

    }
}
