package vn.edu.hcmuaf.fit;

import vn.edu.hcmuaf.fit.services.UserServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SignUp", value = "/doSignUp")
public class SignUp extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirm = request.getParameter("confirm");
        String rule = request.getParameter("rules");

        if (UserServices.getInstance().checkSignUp(username, email, password, confirm, rule)  &&
                password.equals(confirm)) {
            response.sendRedirect("/lab6/signin.jsp");
        }
        else if (UserServices.getInstance().checkSignUp(username, email, password, confirm, rule) &&
                !password.equals(confirm)) {
            request.setAttribute("duplicate", "Password and Confirm not equals");
            request.getRequestDispatcher("/signup.jsp").forward(request, response);
        }
       else {
            request.setAttribute("error", "Username exists");
            request.getRequestDispatcher("/signup.jsp").forward(request, response);
        }
    }
}
