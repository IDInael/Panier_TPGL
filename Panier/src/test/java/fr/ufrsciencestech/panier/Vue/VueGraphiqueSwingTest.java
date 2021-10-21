/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Vue;

import fr.ufrsciencestech.panier.Controleur.Controleur;
import fr.ufrsciencestech.panier.Modele.Orange;
import fr.ufrsciencestech.panier.Modele.Panier;
import fr.ufrsciencestech.panier.Modele.PanierPleinException;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JLabel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 *
 * @author di322945
 */
public class VueGraphiqueSwingTest {
    
    public VueGraphiqueSwingTest() {
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
     * Test of addControleur method, of class VueGraphiqueSwing.
     */
    @Test
    public void testAddControleur() {
        System.out.println("addControleur");
        Controleur c = new Controleur();
        
        Panier p = new Panier(2);
        
        c.setPanier(p);
        
        VueGraphiqueSwing instance = new VueGraphiqueSwing();
        instance.addControleur(c);
        
        assertEquals(c,instance.Plus.getActionListeners()[0]);
    }

    /**
     * Test of update method, of class VueGraphiqueSwing.
     */
    @Test
    public void testUpdate() throws PanierPleinException {
        System.out.println("update");
        VueGraphiqueSwing instance = new VueGraphiqueSwing();
        
        Panier p=new Panier(2);
        p.addObserver(instance);
        
        p.ajout(new Orange());
        
        String expec= p.getTaillePanier()+"";
        
        assertEquals(expec, instance.getAffiche().getText());
        
    }

    /**
     * Test of getPlus method, of class VueGraphiqueSwing.
     */
    @Test
    public void testGetPlus() {
        System.out.println("getPlus");
        VueGraphiqueSwing instance = new VueGraphiqueSwing();
        JButton expResult = instance.getPlus();
        JButton result = instance.getPlus();
        assertEquals(expResult, result);

    }

    /**
     * Test of getMoins method, of class VueGraphiqueSwing.
     */
    @Test
    public void testGetMoins() {
        System.out.println("getMoins");
        VueGraphiqueSwing instance = new VueGraphiqueSwing();
        JButton expResult = instance.getMoins();
        JButton result = instance.getMoins();
        assertEquals(expResult, result);

    }

    /**
     * Test of getAffiche method, of class VueGraphiqueSwing.
     */
    @Test
    public void testGetAffiche() {
        System.out.println("getAffiche");
        VueGraphiqueSwing instance = new VueGraphiqueSwing();
        JLabel expResult = instance.getAffiche();
        JLabel result = instance.getAffiche();
        assertEquals(expResult, result);

    }
    
}
