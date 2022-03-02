import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleLoginServlet", value = "/login")
public class SimpleLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        if ("admin".equals(userName) && "admin".equals(passWord)) {
            printWriter.println("<h1>Welcome " + userName + " to website</h1>");
        } else {
            printWriter.println("<h1>Login Error</h1>");
        }
        printWriter.println("</html>");
    }
}
