/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier.Vue;

import fr.ufrsciencestech.panier.Controleur.Controleur;
import fr.ufrsciencestech.panier.Modele.Panier;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author di322945
 */
public class VueGraphiqueSwing extends javax.swing.JFrame implements VueG {

    JButton Plus;
    JButton Moins;
    /**
     * Creates new form VueGraphiqueSwing
     */
    public VueGraphiqueSwing() {
        initComponents();
        
        Plus=new JButton("+");
        Moins= new JButton("-");
        
        this.add(Plus);
        this.add(Moins);
        
        Moins.setName("Moins");
        Plus.setName("Plus");
        this.pack();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        affiche = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 1));

        affiche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(affiche);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents



    @Override
    public void addControleur(Controleur c) 
    {
        Plus.addActionListener(c);
        Moins.addActionListener(c);
    }

    @Override
    public void update(Observable o, Object o1) 
    {
        affiche.setText(((Panier)o).getTaillePanier()+"");
    }
    
    public JButton getPlus(){return this.Plus;}
    public JButton getMoins(){return this.Moins;}
    
    public JLabel getAffiche(){return this.affiche;}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel affiche;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}