package com.osztalyok;

import com.konyvallomany.KonyvKereses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Konyvek {
    private int KonyvID;
    private String Cim;
    private int KiadoID;
    private String Besorolas;
    private String Iro;
    private String Nyelv;
    private int Ar;

    public int getKonyvID() {
        return KonyvID;
    }

    public void setKonyvID(int konyvID) {
        KonyvID = konyvID;
    }

    public String getCim() {
        return Cim;
    }

    public void setCim(String cim) {
        Cim = cim;
    }

    public int getKiadoID() {
        return KiadoID;
    }

    public void setKiadoID(int kiadoID) {
        KiadoID = kiadoID;
    }

    public String getBesorolas() {
        return Besorolas;
    }

    public void setBesorolas(String besorolas) {
        Besorolas = besorolas;
    }

    public String getIro() {
        return Iro;
    }

    public void setIro(String iro) {
        Iro = iro;
    }

    public String getNyelv() {
        return Nyelv;
    }

    public void setNyelv(String nyelv) {
        Nyelv = nyelv;
    }

    public int getAr() {
        return Ar;
    }

    public void setAr(int ar) {
        Ar = ar;
    }


}