package com.konyvallomany;

import com.mysql.cj.protocol.Resultset;
import com.osztalyok.Conn;


import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class KiadoHozzaad {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTable table1;
    private JButton button1;
    private JButton button2;
    private JButton button3;

    Conn con = new Conn();


    public void KiadoHozzaadLekerdezes(){
        String query = "select KiadoID, Kiadonev from Kiadok";
        try (Statement stmt = con.Con().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {

                ArrayList<String> list = new ArrayList<String>();
                list.add(rs.getString("Kiadonev"));
                list.add(rs.getString("KiadoID"));
                

            }
        } catch (SQLException e) {

        }
    }
    }




