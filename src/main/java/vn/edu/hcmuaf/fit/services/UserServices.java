package vn.edu.hcmuaf.fit.services;

import vn.edu.hcmuaf.fit.bean.User;
import vn.edu.hcmuaf.fit.dao.UserDAO;

import java.util.HashMap;
import java.util.Map;

public class UserServices {
    private static UserServices instance;


    private UserServices() {

    }

    public static UserServices getInstance() {
        if (instance == null) {
            instance = new UserServices();
        }
        return instance;
    }

    public boolean checkSignIn(String username, String password) {

        User user = UserDAO.getInstance().checkSignIn(username, password);
        return user != null;
    }

    public boolean checkSignUp(String username, String email, String password, String confirm, String rule) {
        return UserDAO.getInstance().checkSignUp(username, password, "");
    }
}
