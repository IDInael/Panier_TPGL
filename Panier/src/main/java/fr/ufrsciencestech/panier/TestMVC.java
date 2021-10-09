package fr.ufrsciencestech.panier;

import fr.ufrsciencestech.panier.Controleur.Controleur;
import fr.ufrsciencestech.panier.Modele.Panier;
import fr.ufrsciencestech.panier.Vue.VueConsole;
import fr.ufrsciencestech.panier.Vue.VueGraphiqueSwing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author di322945
 */
public class TestMVC 
{
    VueGraphiqueSwing vueGraph;
    Controleur controle;
    VueConsole vueC;
    
    public TestMVC()
    {
        vueGraph=new VueGraphiqueSwing();
        controle=new Controleur();
        vueC= new VueConsole();
        
        Panier panier=new Panier(10);
        
        controle.setPanier(panier);
        
        vueGraph.addControleur(controle);
        
        panier.addObserver(vueGraph);
        panier.addObserver(vueC);
    }

    public Controleur getControle() {
        return controle;
    }

    public void setControle(Controleur controle) {
        this.controle = controle;
    }
    public VueGraphiqueSwing getVueGraph() {
        return vueGraph;
    }
    
    
    public void setVueGraph(VueGraphiqueSwing vueGraph) {
        this.vueGraph = vueGraph;
    }
    
    public static void main(String[] args)
    {
        TestMVC test=new TestMVC();
    }
    
}
