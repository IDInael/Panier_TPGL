/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import fr.ufrsciencestech.panier.Modele.Cerise;
import fr.ufrsciencestech.panier.Modele.Panier;
import fr.ufrsciencestech.panier.Modele.Fruit;
import fr.ufrsciencestech.panier.Modele.Orange;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import fr.ufrsciencestech.panier.Modele.PanierPleinException;
import fr.ufrsciencestech.panier.Modele.PanierVideException;
import static org.mockito.Mockito.*;

/**
 *
 * @author di322945
 */
public class PanierTest {
    
    private Panier panier;
    
    public PanierTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
        panier=new Panier(2);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Panier.
     */
    @Test
    public void testToString() throws PanierPleinException {
        Panier instance = new Panier(2);
        Fruit o = new Orange();  
        instance.ajout(o);
        
        String expResult = o.toString()+" | ";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFruits method, of class Panier.
     */
    @Test
    public void testGetFruits() {
        Panier instance = new Panier(2);
        ArrayList<Fruit> fruits =  new ArrayList<Fruit>();
        fruits.add(new Orange());
        instance.setFruits(fruits);
        
        ArrayList<Fruit> expResult = fruits ;
        ArrayList<Fruit> result = instance.getFruits();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFruits method, of class Panier.
     */
    @Test
    public void testSetFruits() {
        ArrayList<Fruit> fruits = new ArrayList<Fruit>();
        fruits.add(new Orange());
        
        Panier instance = new Panier(1);
        instance.setFruits(fruits);
        
        ArrayList<Fruit> res = instance.getFruits();
        
        assertEquals(res,fruits);
    }

    /**
     * Test of getTaillePanier method, of class Panier.
     */
    @Test
    public void testGetTaillePanier() {
        Panier instance = new Panier(3);
        
        try{instance.ajout(new Orange());}
        catch(PanierPleinException pp){System.err.println(pp.getMessage());}
        
        int expResult = 1;
        int result = instance.getTaillePanier();
        assertTrue(expResult == result);
    }

    /**
     * Test of getContenanceMax method, of class Panier.
     */
    @Test
    public void testGetContenanceMax() {
        Panier instance = new Panier(10);
        int expResult = 10;
        int result = instance.getContenanceMax();
        assertTrue(expResult == result);
    }

    /**
     * Test of getFruit method, of class Panier.
     */
    @Test
    public void testGetFruit() throws PanierPleinException, PanierVideException {
        int i = 0;
        Panier instance = new Panier(2);
        
        Fruit expResult = new Orange();
        
        instance.ajout(new Orange());
        Fruit result = instance.getFruit(i);
        
        assertEquals(expResult, result);

    }

    /**
     * Test of setFruit method, of class Panier.
     */
    @Test
    public void testSetFruit() throws PanierVideException, PanierPleinException {
        int i = 0;
        Fruit f = new Orange();
        Panier instance = new Panier(3);
        instance.ajout(new Cerise());
        instance.setFruit(i, f);
        
        Fruit res = instance.getFruit(0);
        
        assertEquals(res,f);
    }

    /**
     * Test of estVide method, of class Panier.
     */
    @Test
    public void testEstVide() {
        Panier instance = new Panier(1);
        boolean expResult = true;
        boolean result = instance.estVide();
        assertEquals(expResult, result);
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    @Test
    public void testEstPlein() throws PanierPleinException {
        Panier instance = new Panier(1);
        instance.ajout(new Cerise());
        
        boolean expResult = true;
        boolean result = instance.estPlein();
        assertEquals(expResult, result);
    }

    /**
     * Test of ajout method, of class Panier.
     */
    @Test
    public void testAjout() throws Exception {
        Fruit o = mock(Fruit.class);
        
        panier.ajout(o);
        assertTrue(panier.getTaillePanier()==1);
        panier.ajout(o);
        assertTrue(panier.getTaillePanier()==2);
    }
    
    @Test(expected=PanierPleinException.class)
    public void testAjoutInvalide() throws Exception
    {
        Fruit o=mock(Fruit.class);
        panier.ajout(o);
        panier.ajout(o);
        panier.ajout(o);
    }
    

    /**
     * Test of retrait method, of class Panier.
     */
    @Test
    public void testRetrait() throws PanierVideException, PanierPleinException {
        Panier instance = new Panier(2);
        instance.ajout(new Cerise());
        instance.ajout(new Orange());
        
        instance.retrait();
        
        int expResult = 1;
        
        assertTrue(expResult == instance.getTaillePanier() );
    }

    /**
     * Test of getPrix method, of class Panier.
     */
    @Test
    public void testGetPrix() throws PanierPleinException {
        Panier instance = new Panier(3);
        instance.ajout(new Orange());
        instance.ajout(new Orange());
        
        double expResult = 1;
        double result = instance.getPrix();
        assertTrue(expResult == result);
    }

    /**
     * Test of boycotteOrigine method, of class Panier.
     */
    @Test
    public void testBoycotteOrigine() throws PanierPleinException, PanierVideException {
        String origine = "Espagne";
        Panier instance = new Panier(3);
        instance.ajout(new Cerise(0.80,"france"));
        instance.ajout(new Orange(0.80,"Espagne"));
        instance.ajout(new Cerise());
        instance.boycotteOrigine(origine);
        
        assertTrue(instance.getTaillePanier()==2);
        
        
    }

    /**
     * Test of equals method, of class Panier.
     */
    @Test
    public void testEquals() throws PanierPleinException {
        Panier instance = new Panier(1);
        instance.ajout(new Orange());
        Panier o = new Panier(1);
        o.ajout(new Orange());
        
        boolean expResult = true;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
    }
    
}
