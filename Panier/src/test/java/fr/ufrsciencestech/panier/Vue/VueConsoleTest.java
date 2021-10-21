/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Vue;

import fr.ufrsciencestech.panier.Modele.Cerise;
import fr.ufrsciencestech.panier.Modele.Panier;
import fr.ufrsciencestech.panier.Modele.PanierPleinException;
import java.util.Observable;
import java.util.Observer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.mockito.Mockito.*;


/**
 *
 * @author di322945
 */
public class VueConsoleTest {
    
    public VueConsoleTest() {
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
     * Test of getTrace method, of class VueConsole.
     */
    @Test
    public void testGetTrace() {
        System.out.println("getTrace");
        VueConsole instance = new VueConsole();
        String expResult = "";
        String result = instance.getTrace();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setTrace method, of class VueConsole.
     */
    @Test
    public void testSetTrace() {
        System.out.println("setTrace");
        String s = "ma trace";
        VueConsole instance = new VueConsole();
        instance.setTrace(s);
        assertEquals(instance.getTrace(),s);
    }

    /**
     * Test of update method, of class VueConsole.
     */
    @Test
    public void testUpdate() throws PanierPleinException {
        System.out.println("update");
        
        
        
        VueConsole instance = new VueConsole();
        
        Panier p=new Panier(3);
        p.addObserver(instance);
        p.ajout(new Cerise());
        
        String expres = "Nombre de fruit dans le panier "+(p).getTaillePanier();
        
        
        assertEquals(expres,instance.getTrace());
    }
    
}
