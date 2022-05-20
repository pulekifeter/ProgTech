package com.konyvallomany;

import javax.swing.*;

public class KonyvTorles {
    public JPanel konyvTorlesPanel;
    private JTable table1;
    private JButton törlésButton;
    public KonyvTorles(){
        table1 = new JTable(KonyvKereses.KonyvKeresesLekerdezes(table1));
    }
}
