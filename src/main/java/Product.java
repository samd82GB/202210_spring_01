import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "Product", urlPatterns = "/product")
public class Product extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ContextPath = "+req.getContextPath());
        System.out.println("Header = "+req.getHeader("application-type"));
        System.out.println("Method = "+req.getMethod());
    }
}
