package com.konyvallomany;

import javax.swing.*;

public class KonyvModositas {
    public JPanel konyvModositasPanel;
    private JTable table1;
    private JButton szerkesztésButton;
    private JButton mégsemButton;

    public KonyvModositas(){
        table1 = new JTable(KonyvKereses.KonyvKeresesLekerdezes(table1));
    }
}
