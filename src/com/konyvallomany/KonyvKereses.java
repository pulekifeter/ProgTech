package com.konyvallomany;

import com.osztalyok.Conn;
import com.osztalyok.Konyvek;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class KonyvKereses {
    public JPanel konyvKeresesPanel;
    private JTextField textField1;
    private JTable table1;


    public KonyvKereses(){
        table1 = new JTable(KonyvKeresesLekerdezes(table1));

    }

    public static DefaultTableModel KonyvKeresesLekerdezes(JTable table1) {
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.addColumn("Col1");
        model.addColumn("Col2");
        model.addColumn("Col3");
        model.addColumn("Col4");
        model.addColumn("Col5");
        model.addColumn("Col6");
        model.addColumn("Col7");
        String query = "select KonyvID, Cim, KiadoID, Besorolas, Iro, Nyelv, Ar from Konyvek";
        Conn con = new Conn();
        try (Statement stmt = con.Con().createStatement()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Konyvek konyvek = new Konyvek();
                konyvek.setKonyvID(rs.getInt("KonyvID"));
                konyvek.setCim(rs.getString("Cim"));
                konyvek.setKiadoID(rs.getInt("KiadoID"));
                konyvek.setBesorolas(rs.getString("Besorolas"));
                konyvek.setIro(rs.getString("Iro"));
                konyvek.setNyelv(rs.getString("Nyelv"));
                konyvek.setAr(rs.getInt("Ar"));
                model.addRow(new Object[]{
                        konyvek.getKonyvID(),
                        konyvek.getCim(),
                        konyvek.getKiadoID(),
                        konyvek.getBesorolas(),
                        konyvek.getIro(),
                        konyvek.getNyelv(),
                        konyvek.getAr()
                });
            }

        } catch (SQLException e) {

        }

        return model;

    }}
