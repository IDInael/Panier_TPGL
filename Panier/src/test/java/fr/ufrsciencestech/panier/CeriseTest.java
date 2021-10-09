/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import fr.ufrsciencestech.panier.Modele.Cerise;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author di322945
 */
public class CeriseTest {
    
    public CeriseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPrix method, of class Cerise.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Cerise instance = new Cerise(3.3, "Maroc");
        double expResult = 3.3;

        assertTrue(instance.getPrix() == expResult);
    }

    /**
     * Test of setPrix method, of class Cerise.
     */
    @Test
    public void testSetPrix() {
        double prix = 5.0;
        Cerise instance = new Cerise();
        instance.setPrix(prix);

        assertTrue(instance.getPrix() == prix);
    }

    /**
     * Test of getOrigine method, of class Cerise.
     */
    @Test
    public void testGetOrigine() {
        Cerise instance = new Cerise(2.4, "Espagne");
        String expResult = "Espagne";
        
        assertEquals(instance.getOrigine(), expResult);
    }

    /**
     * Test of setOrigine method, of class Cerise.
     */
    @Test
    public void testSetOrigine() {
        String origine = "France";
        Cerise instance = new Cerise();
        instance.setOrigine(origine);
        
        assertEquals(instance.getOrigine(), origine);
    }

    /**
     * Test of toString method, of class Cerise.
     */
    @Test
    public void testToString() {
        Cerise instance = new Cerise();
        String expResult = "Cerise de " + instance.getOrigine() + " a " + instance.getPrix() + " euros";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Cerise.
     */
    @Test
    public void testEquals() {
        Object o = null;
        Cerise instance = new Cerise();
        boolean expResult = false;
        boolean result = instance.equals(o);

        assertEquals(expResult, result);
    }

    /**
     * Test of isSeedless method, of class Cerise.
     */
    @Test
    public void testIsSeedless() {
        Cerise instance = new Cerise();
        boolean expResult = true;
        boolean result = instance.isSeedless();
        
        assertEquals(expResult, result);
    }
    
}
