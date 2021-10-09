/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Vue;

import fr.ufrsciencestech.panier.Controleur.Controleur;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author di322945
 */
public interface VueG extends Observer {
    
    
    @Override
    public void update(Observable o, Object o1);
    public void addControleur(Controleur c);
}
