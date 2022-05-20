package com.loginpage;

import com.osztalyok.Login_certs;
import org.apache.log4j.Logger;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static com.fooldal.FoOldal.createAndShowGUI;
import static com.loginpage.LoginPage.Keret.frame;

public class LoginPage extends Component {
    private JPanel panel1;
    private JTextField tf_username;
    private JPasswordField tf_password;
    private JButton OKButton;
    static Logger logger = Logger.getLogger(LoginPage.class);
    public LoginPage() {
        frame.getRootPane().setDefaultButton(OKButton);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            login_certs = Login_certs.getAuthenticated(tf_username.getText(),String.valueOf(tf_password.getPassword()));
            if(login_certs!=null){
                try{
                    SwingUtilities.invokeLater(new Runnable() {
                        public void run() {
                            createAndShowGUI();
                            logger.info("Sikeres bejelentkezés");
                        }
                    });
                }
                catch (Exception exception){
                    logger.warn(exception);
                }
            }
            else{
                JOptionPane.showMessageDialog(LoginPage.this,
                        "Nem megfelelő felhasználónév jelszó páros",
                        "Próbáld újra",
                        JOptionPane.ERROR_MESSAGE);
                logger.warn("Hibás felhasználónév vagy jelszó");
                }
            }
        });
    }

    private Login_certs login_certs;
    public class Keret {
        public static JFrame frame = new JFrame(("LoginPage"));
    }
    public static void main(String[] args) {
        frame.setContentPane(new LoginPage().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
