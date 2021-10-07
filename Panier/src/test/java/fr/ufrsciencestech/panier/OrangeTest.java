/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import fr.ufrsciencestech.panier.Modele.Fruit;
import fr.ufrsciencestech.panier.Modele.Orange;
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
public class OrangeTest {
    
    public OrangeTest() {
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
     * Test of getPrix method, of class Orange.
     */
    @Test
    public void testGetPrix() {
        Orange o = new Orange(5.0,"france");
        double expResult = 5.0;
        
        assertTrue(o.getPrix()==expResult);
        
    }

    /**
     * Test of setPrix method, of class Orange.
     */
    @Test
    public void testSetPrix() {
        double prix = 5.0;
        Orange instance = new Orange();
        instance.setPrix(prix);
        assertTrue(instance.getPrix()==prix);
    }

    /**
     * Test of getOrigine method, of class Orange.
     */
    @Test
    public void testGetOrigine() {
        Orange instance = new Orange();
        String expResult = "Espagne";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of setOrigine method, of class Orange.
     */
    @Test
    public void testSetOrigine() {
        String origine = "France";
        Orange instance = new Orange();
        instance.setOrigine(origine);
        assertEquals(instance.getOrigine(),origine);
    }

    /**
     * Test of toString method, of class Orange.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Orange instance = new Orange();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Orange.
     */
    @Test
    public void testEquals() {
        Fruit f=new Orange();
        Orange instance = new Orange();
        boolean expResult = true;
        boolean result = instance.equals(f);
        assertEquals(expResult, result);

    }
    
    @Test
    public void testEqualsFailed() {
        Fruit f=new Orange(5.0,"France");
        Orange instance = new Orange();
        boolean expResult = false;
        boolean result = instance.equals(f);
        assertEquals(expResult, result);

    }

    /**
     * Test of isSeedless method, of class Orange.
     */
    @Test
    public void testIsSeedless() {
        Orange instance = new Orange();
        boolean expResult = false;
        boolean result = instance.isSeedless();
        assertEquals(expResult, result);
    }
    
}
