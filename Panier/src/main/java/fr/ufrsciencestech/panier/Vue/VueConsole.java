/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Vue;

import fr.ufrsciencestech.panier.Modele.Panier;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author di322945
 */
public class VueConsole implements Observer{

    private String trace;
    
    public VueConsole()
    {
        
    }
    
    public String getTrace(){return this.trace;}
    
    public void setTrace(String s)
    {
        this.trace=s;
    }
    
    
    
    @Override
    public void update(Observable o, Object o1) 
    {
        trace="Nombre de fruit dans le panier "+((Panier)o).getTaillePanier();
        System.out.println(trace);
    }
    
}
