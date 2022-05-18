package com.loginpage;

import com.osztalyok.Login_certs;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    private JPanel panel1;
    private JTextField tf_username;
    private JPasswordField tf_password;
    private JButton OKButton;

    public LoginPage() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            getAuthenticated(tf_username.getText(),String.valueOf(tf_password.getPassword()));


            }
        });
    }

    private Login_certs getAuthenticated(String username, String password){
        Login_certs user = null;
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
