/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectomaquinabebidaselena;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author dammdcd-a
 */
public class TarxetaMoedeiroTest {
    
    public TarxetaMoedeiroTest() {
    }

    /**
     * Test of getSaldo method, of class TarxetaMoedeiro.
     */
//    @Test
//    public void testGetSaldo() {
//        System.out.println("getSaldo");
//        TarxetaMoedeiro instance = null;
//        int expResult = 0;
//        int result = instance.getSaldo();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setSaldo method, of class TarxetaMoedeiro.
     */
//    @Test
//    public void testSetSaldo() {
//        System.out.println("setSaldo");
//        int saldo = 0;
//        TarxetaMoedeiro instance = null;
//        instance.setSaldo(saldo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of pagarCafe method, of class TarxetaMoedeiro.
     */
    @Test
    public void testPagarCafe5() {
        System.out.println("pagarCafe saldo 5");
        TarxetaMoedeiro instance = new TarxetaMoedeiro(5);
        int expResult = 4;
        int result = instance.pagarCafe();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of pagarCafe method, of class TarxetaMoedeiro.
     */
    @Test
    public void testPagarCafe0() {
        System.out.println("pagarCafe saldo 0");
        TarxetaMoedeiro instance = new TarxetaMoedeiro(0);
        int expResult = -1;
        int result = instance.pagarCafe();
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testPagarRefresco1() {
        System.out.println("pagarRefresco saldo 1");
        TarxetaMoedeiro instance = new TarxetaMoedeiro(1);
        int expResult = -1;
        int result = instance.pagarRefresco();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEngadirCartos() {
        System.out.println("Engadir cartos");
        TarxetaMoedeiro instance = new TarxetaMoedeiro(Integer.MAX_VALUE);
        int expResult = Integer.MAX_VALUE + 10;
        int result = instance.engadirCartos(10);
        assertEquals(expResult, result);
    }
    
       
}
