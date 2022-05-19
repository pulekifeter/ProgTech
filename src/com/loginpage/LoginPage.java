package com.loginpage;

import com.fooldal.*;
import com.osztalyok.Login_certs;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import static com.fooldal.FoOldal.createAndShowGUI;


public class LoginPage extends Component {
    private JPanel panel1;
    private JTextField tf_username;
    private JPasswordField tf_password;
    private JButton OKButton;

    public LoginPage() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            login_certs = Login_certs.getAuthenticated(tf_username.getText(),String.valueOf(tf_password.getPassword()));
            if(login_certs!=null){
                try{
                    javax.swing.SwingUtilities.invokeLater(new Runnable() {
                        public void run() {

                            createAndShowGUI();
                        }
                    });

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
    public class Keret {
        public static JFrame frame = new JFrame(("LoginPage"));
    }
    public static void main(String[] args) {

        Keret.frame.setContentPane(new LoginPage().panel1);
        Keret.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Keret.frame.pack();
        Keret.frame.setVisible(true);



    }
}
