package vn.edu.hcmuaf.fit.dao;

import vn.edu.hcmuaf.fit.bean.User;
import vn.edu.hcmuaf.fit.db.DBConnect;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private static UserDAO instance;

    public static UserDAO getInstance() {
        if (instance == null) {
            instance = new UserDAO();
        }
        return instance;
    }

    private UserDAO() {

    }

    public User checkSignIn(String username, String password) {
        try {
            ResultSet resultSet = DBConnect.connect().executeQuery("SELECT * FROM user WHERE username='" + username + "'AND password='" + password + "'");
            //   ResultSet resultSet =DBConnect.connect().executeQuery("SELECT * FROM user WHERE username='"+username+"'AND password='"+password+"'");
            User user = null;
            if (resultSet.next()) {
                user = new User();
                user.setUsername(resultSet.getString("username"));
                user.setFullname(resultSet.getString("name"));

            }
            if (user != null && user.getUsername().equals(username) && !resultSet.next()) {
                return user;
            }
            return null;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean checkSignUp(String username, String password, String name) {
        try {
            int i = DBConnect.connect().executeUpdate("INSERT INTO user(username,password,name) VALUE ('" + username + "','" + password + "','" + name + "')");
            return i == 1;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}
