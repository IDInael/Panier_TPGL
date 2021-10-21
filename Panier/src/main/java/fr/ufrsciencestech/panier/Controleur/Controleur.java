/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Controleur;

import fr.ufrsciencestech.panier.Modele.Orange;
import fr.ufrsciencestech.panier.Modele.Panier;
import fr.ufrsciencestech.panier.Modele.PanierPleinException;
import fr.ufrsciencestech.panier.Modele.PanierVideException;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author di322945
 */
public class Controleur implements ActionListener{

    Panier panier;
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        if(((JButton)ae.getSource()).getName().equals("Plus"))
        {
            try
            {
                this.panier.ajout(new Orange());
            }
            catch(PanierPleinException e)
            {
                System.err.println(e);
            }
        }
        else
        {
            try
            {
                this.panier.retrait();
            }
            catch(PanierVideException e)
            {
                System.err.println(e);
            }
        }
    }
    
    public void setPanier(Panier p)
    {
        if(p!=null)
            this.panier=p;
    }
    
    public Panier getPanier(){return this.panier;}
    
    @Override
    public boolean equals(Object o)
    {
         if(o != null && getClass() == o.getClass())
        {
            Controleur c = (Controleur) o;
            
            return c.panier.equals(this.panier);
        }
        else 
        {
            return false;
        }
    }
    
}
