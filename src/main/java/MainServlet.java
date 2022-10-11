
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(name = "MainServlet", urlPatterns = "/test")
public class MainServlet  implements Servlet {

    private static Logger logger = LoggerFactory.getLogger(MainServlet.class);
    private transient ServletConfig servletConfig;

    @Override
    public void init(ServletConfig config) throws ServletException {
    this.servletConfig = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
    logger.info("new owr request");
    response.getWriter().println("<h1>Hello geeks!!!</h1>");
    logger.info("it's worked");
    }

    @Override
    public String getServletInfo() {
        return "MainServlet";
    }

    @Override
    public void destroy() {
        logger.info("Servlet {} destroyed",getServletInfo());
    }
}
