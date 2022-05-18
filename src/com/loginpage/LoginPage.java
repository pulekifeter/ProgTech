package com.loginpage;

import com.fooldal.FoOldal;
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
    private static Boolean b_fooldal = false;

    public LoginPage() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            login_certs = Login_certs.getAuthenticated(tf_username.getText(),String.valueOf(tf_password.getPassword()));
            if(login_certs!=null){
                    //TODO: átírányítás a főoldalra.

                try{
                    JFrame foOldal = new JFrame(("FoOldal"));
                    foOldal.setContentPane(new FoOldal().mainPanel);
                    foOldal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    foOldal.pack();
                    foOldal.setVisible(true);
                    b_fooldal = true;

                }
                catch (Exception exception){}


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


    public static void main(String[] args) {
        JFrame frame = new JFrame(("LoginPage"));
        frame.setContentPane(new LoginPage().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}
