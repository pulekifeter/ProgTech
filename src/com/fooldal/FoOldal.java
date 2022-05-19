package com.fooldal;

import com.konyvallomany.UjKonyv;
import com.loginpage.LoginPage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class FoOldal {
    private static LoginPage.Keret Container1;

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
                //JFrame frame = new JFrame(("UjKonyv"));

                FoOldal.Container1.frame.setContentPane(new UjKonyv().ujKonyvPanel);
                FoOldal.Container1.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                FoOldal.Container1.frame.pack();
                FoOldal.Container1.frame.setVisible(true);
            }
        });

        menu.add(menuItem);

        menuItem = new JMenuItem("Könyv módosítása",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
        menu.add(menuItem);

        menuItem = new JMenuItem("Könyv keresése",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
//        menu.addActionListener();
        menu.add(menuItem);

        menuItem = new JMenuItem("Könyv törlése",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
 //       menu.addActionListener();
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
//        menu.addActionListener();
        menu.add(menuItem);

        menuItem = new JMenuItem("Tag keresése",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
 //       menu.addActionListener();
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
//        menu.addActionListener();
        menu.add(menuItem);

        menuItem = new JMenuItem("Leltáron lévő könyv módosítása",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
//        menu.addActionListener();
        menu.add(menuItem);

        menuItem = new JMenuItem("Leltáron lévő könyv törlése",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
//        menu.addActionListener();
        menu.add(menuItem);

        menuItem = new JMenuItem("Leltáron lévő könyv keresése",
                KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menuItem.getAccessibleContext().setAccessibleDescription(
                "This doesn't really do anything");
//        menu.addActionListener();
        menu.add(menuItem);

        menu = new JMenu("Könyv kölcsönzése");
        menu.setMnemonic(KeyEvent.VK_N);
        menu.getAccessibleContext().setAccessibleDescription(
                "This menu does nothing");
//        menu.addActionListener();
        menuBar.add(menu);

        return menuBar;
    }

    public static Container createAndShowGUI() {

        FoOldal.Container1.frame.setContentPane(new JPanel());
        FoOldal.Container1.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        FoOldal demo = new FoOldal();
        FoOldal.Container1.frame.setJMenuBar(demo.createMenuBar());

        //Display the window.
        FoOldal.Container1.frame.setSize(450, 260);
        FoOldal.Container1.frame.setVisible(true);
        return null;
    }
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }



}
