package com.konyvallomany;

import com.osztalyok.Conn;
import com.osztalyok.Kiadok;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class KiadoHozzaad extends Component {
    public JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTable table1;
    private JButton törlésButton;
    private JButton bevitelButton;
    private JButton button3;
    private void KiadoDeleterows(){
        textField1.setText("");
        textField2.setText("");
    }
    public KiadoHozzaad(){
        table1 = new JTable(KiadoHozzaadLekerdezes());
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                KiadoDeleterows();
            }
        });
        bevitelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField2.getText().equals("")){JOptionPane.showMessageDialog(KiadoHozzaad.this,
                        "Hibás adatkitöltés",
                        "Próbáld újra",
                        JOptionPane.ERROR_MESSAGE);}
                else{
                    Conn con = new Conn();
                    String sql = "INSERT INTO `Kiadok`(`KiadoNev`) VALUES (?)";
                    PreparedStatement stmt = null;
                    try {
                        stmt = con.Con().prepareStatement(sql);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        stmt.setString(1,
                                textField2.getText());
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    try {
                        stmt.executeUpdate();
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    } finally {
                        JOptionPane.showMessageDialog(KiadoHozzaad.this,
                                "Sikerült hozzáadni a kiadót",
                                "Sikeres adatbevitel",
                                JOptionPane.OK_OPTION);
                        DefaultTableModel model = (DefaultTableModel) table1.getModel();
                        int rowct = model.getRowCount();
                        for (int i = rowct - 1; i >= 0; i--) {
                            model.removeRow(i);
                        }
                        table1 = new JTable(KiadoHozzaadLekerdezes());
                        KiadoDeleterows();
                    }
                }
            }
        });
    }

    private DefaultTableModel KiadoHozzaadLekerdezes()  {
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
            }

        } catch (SQLException e) {

        }
        return model;
    }
}




