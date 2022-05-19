package com.osztalyok;

import java.sql.*;
import com.osztalyok.Conn;

public class Login_certs {
    private int ID;
    private String username;
    private String password;

    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    public void setUsername(String Username){
        this.username=Username;
    }

    public void setPassword(String Password){
        this.password=Password;
    }

    static Login_certs user = null;
   

    public static Login_certs getAuthenticated(String username, String password){
        try{

            Conn conn = new Conn();
            String sql = "SELECT * FROM login_certs WHERE username=? AND password=?";
            PreparedStatement preparedStatement = conn.Con().prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                user = new Login_certs();
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));

            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return user;


    }
}
