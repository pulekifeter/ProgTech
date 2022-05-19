package com.konyvallomany;

import com.osztalyok.Conn;
import com.osztalyok.Kiadok;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class KiadoHozzaad {
    public JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTable table1;
    private JButton button1;
    private JButton button2;
    private JButton button3;


    DefaultTableModel model = new DefaultTableModel();

    public KiadoHozzaad(){

        table1 = new JTable(KiadoHozzaadLekerdezes());


    }

    public DefaultTableModel KiadoHozzaadLekerdezes()  {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.addColumn("Col1");
        model.addColumn("Col2");
        Conn con = new Conn();
        String query = "select KiadoID, Kiadonev from Kiadok";

        try (Statement stmt = con.Con().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
               Kiadok kiadok = new Kiadok();
               kiadok.setKiadoID(rs.getInt("KiadoID"));
               kiadok.setKiadoNev(rs.getString("KiadoNev"));
               model.addRow(new Object[]{kiadok.getKiadoID(), kiadok.getKiadoNev()});
               System.out.println(kiadok.getKiadoID());

            }

        } catch (SQLException e) {

        }
        System.out.println(model);
        return model;
    }
    }




