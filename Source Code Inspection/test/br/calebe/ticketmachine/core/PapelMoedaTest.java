/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.calebe.ticketmachine.core;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31754880
 */
public class PapelMoedaTest {
    
    public PapelMoedaTest() {
    }
    
    @BeforeClass


    /**
     * Test of getValor method, of class PapelMoeda.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        PapelMoeda instance = null;
        int expResult = 0;
        int result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class PapelMoeda.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        PapelMoeda instance = null;
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
