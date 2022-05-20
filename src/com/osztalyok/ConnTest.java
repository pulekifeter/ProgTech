package com.osztalyok;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class ConnTest {

    @Test
    void con() {
        Conn con = new Conn();
        assertNotNull(con);
    }

    @Test
    void con2() {
        Conn con = new Conn();
        Conn con1 = new Conn();
        assertNotEquals(con,con1);

    }
}