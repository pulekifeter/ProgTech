package com.konyvallomany;

import com.loginpage.LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UjKonyv extends Container {
    private JButton okButton;
    private JButton mégsemButton;
    private JTextField textField1;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JComboBox comboBox1;
    private JButton újKiadóFelvételeButton;
    public JPanel ujKonyvPanel;

    public UjKonyv() {
        újKiadóFelvételeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage.Keret.frame.setContentPane(new KiadoHozzaad().panel1);
                LoginPage.Keret.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                LoginPage.Keret.frame.pack();
                LoginPage.Keret.frame.setVisible(true);
            }
        });
    }
}
