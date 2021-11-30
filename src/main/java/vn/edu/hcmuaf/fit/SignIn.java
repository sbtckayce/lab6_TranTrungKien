package vn.edu.hcmuaf.fit;

import vn.edu.hcmuaf.fit.services.UserServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "SignIn", value = "/doSignIn")
public class SignIn extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (UserServices.getInstance().checkSignIn(username, password)) {
            response.sendRedirect("/lab6/index.jsp");
        } else {
            request.setAttribute("error","Username or Password is incorrect");
            request.getRequestDispatcher("signin.jsp").forward(request, response);
        }
    }
}
