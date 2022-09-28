package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.AccountService;
import models.User;

/**
 *
 * @author Khanh Nguyen
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        String logout = request.getParameter("logout");

        if (username != null) {
            if (logout != null) {
                request.setAttribute("message", "You have successfully logged out.");
                session.invalidate();
                session = request.getSession();
            } else {
                response.sendRedirect("home");
                return;
            }

        }

        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || password == null) {
            request.setAttribute("message", "Please do not empty the field.");
        } else {
            AccountService userAccount = new AccountService();
            User user = userAccount.login(username, password);

            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                response.sendRedirect("home");
                return;
            } else {
                request.setAttribute("username", username);
                request.setAttribute("password", password);
                request.setAttribute("message", "Failed authentication");
            }
        }
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

}
