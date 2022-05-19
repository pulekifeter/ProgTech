package com.fooldal;

import com.kolcsonzes.Kolcsonzes;
import com.konyvallomany.KonyvKereses;
import com.konyvallomany.KonyvModositas;
import com.konyvallomany.KonyvTorles;
import com.konyvallomany.UjKonyv;
import com.leltar.LeltarHozzaad;
import com.leltar.LeltarKereses;
import com.leltar.LeltarModositas;
import com.leltar.LeltarTorles;
import com.loginpage.LoginPage;
import com.tagokkezelese.TagHozzaadas;
import com.tagokkezelese.TagKereses;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class FoOldal {


    public JMenuBar createMenuBar(){
        JMenuBar menuBar;
        JMenu menu;
        JMenuItem menuItem;

        menuBar = new JMenuBar();

        menu = new JMenu("Katalógus");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        //TODO: Valamit kellene írni ide, hogy a következő ablak megnyíljon.
        menuBar.add(menu);



        menuItem = new JMenuItem("Könyv hozzáadása",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage.Keret.frame.setContentPane(new UjKonyv().ujKonyvPanel);
                LoginPage.Keret.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                LoginPage.Keret.frame.pack();
                LoginPage.Keret.frame.setVisible(true);
            }
        });

        menu.add(menuItem);

        menuItem = new JMenuItem("Könyv módosítása",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage.Keret.frame.setContentPane(new KonyvModositas().konyvModositasPanel);
                LoginPage.Keret.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                LoginPage.Keret.frame.pack();
                LoginPage.Keret.frame.setVisible(true);           }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Könyv keresése",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage.Keret.frame.setContentPane(new KonyvKereses().konyvKeresesPanel);
                LoginPage.Keret.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                LoginPage.Keret.frame.pack();
                LoginPage.Keret.frame.setVisible(true);
            }
        });

        menu.add(menuItem);

        menuItem = new JMenuItem("Könyv törlése",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage.Keret.frame.setContentPane(new KonyvTorles().konyvTorlesPanel);
                LoginPage.Keret.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                LoginPage.Keret.frame.pack();
                LoginPage.Keret.frame.setVisible(true);
            }
        });
        menu.add(menuItem);


        menu = new JMenu("Tagok kezelése");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
        menuBar.add(menu);

        menuItem = new JMenuItem("Tag hozzáadása",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage.Keret.frame.setContentPane(new TagHozzaadas().tagHozzadasPanel);
                LoginPage.Keret.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                LoginPage.Keret.frame.pack();
                LoginPage.Keret.frame.setVisible(true);
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Tag keresése",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage.Keret.frame.setContentPane(new TagKereses().tagKeresesePanel);
                LoginPage.Keret.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                LoginPage.Keret.frame.pack();
                LoginPage.Keret.frame.setVisible(true);
            }
        });
        menu.add(menuItem);

        menu = new JMenu("Leltár kezelése");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
        menuBar.add(menu);
        menuItem = new JMenuItem("Könyv hozzáadása a leltárhoz",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage.Keret.frame.setContentPane(new LeltarHozzaad().leltarHozzaadPanel);
                LoginPage.Keret.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                LoginPage.Keret.frame.pack();
                LoginPage.Keret.frame.setVisible(true);
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Leltáron lévő könyv módosítása",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage.Keret.frame.setContentPane(new LeltarModositas().leltarModositasPanel);
                LoginPage.Keret.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                LoginPage.Keret.frame.pack();
                LoginPage.Keret.frame.setVisible(true);
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Leltáron lévő könyv törlése",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage.Keret.frame.setContentPane(new LeltarTorles().leltarTorlesPanel);
                LoginPage.Keret.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                LoginPage.Keret.frame.pack();
                LoginPage.Keret.frame.setVisible(true);
            }
        });
        menu.add(menuItem);

        menuItem = new JMenuItem("Leltáron lévő könyv keresése",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage.Keret.frame.setContentPane(new LeltarKereses().leltarKeresesPanel);
                LoginPage.Keret.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                LoginPage.Keret.frame.pack();
                LoginPage.Keret.frame.setVisible(true);
            }
        });
        menu.add(menuItem);

        menu = new JMenu("Könyv kölcsönzése");
        menu.setMnemonic(KeyEvent.VK_N);
        menuItem = new JMenuItem("Kölcsönzés",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginPage.Keret.frame.setContentPane(new Kolcsonzes().kolcsonzesPanel);
                LoginPage.Keret.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                LoginPage.Keret.frame.pack();
                LoginPage.Keret.frame.setVisible(true);
            }
        });
        menu.add(menuItem);
        menuBar.add(menu);

        return menuBar;
    }

    public static Container createAndShowGUI() {
        LoginPage.Keret.frame.setContentPane(new JPanel());
        LoginPage.Keret.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FoOldal demo = new FoOldal();
        LoginPage.Keret.frame.setJMenuBar(demo.createMenuBar());
        LoginPage.Keret.frame.setSize(450, 260);
        LoginPage.Keret.frame.setVisible(true);
        return null;
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }



}
