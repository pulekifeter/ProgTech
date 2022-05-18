package com.loginpage;

import com.osztalyok.Login_certs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class LoginPage extends Component {
    private JPanel panel1;
    private JTextField tf_username;
    private JPasswordField tf_password;
    private JButton OKButton;

    public LoginPage() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            login_certs = getAuthenticated(tf_username.getText(),String.valueOf(tf_password.getPassword()));
            if(login_certs!=null){

            }
            else{
                JOptionPane.showMessageDialog(LoginPage.this,
                        "Nem megfelelő felhasználónév jelszó páros",
                        "Próbáld újra",
                        JOptionPane.ERROR_MESSAGE);
            }

            }
        });
    }

    private Login_certs login_certs;
    private Login_certs getAuthenticated(String username, String password){
        Login_certs user = null;
        final String DB_URL = "jdbc:mysql://localhost/konyvtar_db?";
        final String USERNAME = "root";
        final String PASSWORD ="";

        try{
            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM login_certs WHERE username=? AND password=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
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

    public static void main(String[] args) {
        JFrame frame = new JFrame(("LoginPage"));
        frame.setContentPane(new LoginPage().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
