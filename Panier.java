package fr.ufrsciencestech.panier;


import fr.ufrsciencestech.panier.Fruit;
import fr.ufrsciencestech.panier.Orange;
import java.util.*;
/**
 *
 * @author roudet
 */
public class Panier {
    private ArrayList<Fruit> fruits;  //attribut pour stocker les fruits
    private int contenanceMax;        //nb maximum d'oranges que peut contenir le panier

    //groupe 1
    public Panier(int contenanceMax){  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)

	this.contenanceMax = contenanceMax;
	this.fruits = new ArrayList<Fruit>();
    }
    
    /*-public void add(Fruit f) throws PanierPleinException
    {
        if(this.contenanceMax>this.fruits.size())
        {
            if( f!= null) fruits.add(f);
        }
        else
        {
            throw new PanierPleinException();
        }
	
    }
    */
    @Override
    public String toString(){  //affichage de ce qui est contenu dans le panier : liste des fruits presents
        String s = "";
	for (Fruit elem: fruits){
		s+= elem.toString() + " | ";
	}
	return s;
    }

    //groupe 2
    public ArrayList<Fruit> getFruits() {  //accesseur du premier attribut
       return null;
    }

    public void setFruits(ArrayList<Fruit> fruits) { //modificateur du premier attribut

    }

    public int getTaillePanier(){  //accesseur retournant la taille allouee pour l'attibut fruits
        return this.fruits.size();
    }

    public int getContenanceMax(){  //accesseur du second attribut
	return 0;
    }

    //groupe 3
    public Fruit getFruit(int i){  //accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou null s'il n'y a rien a cet emplacement
	return null;
    }

    public void setFruit(int i, Fruit f){  //modificateur du fruit contenu dans le panier a l'emplacement n°i par f (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)

    }

    public boolean estVide(){  //predicat indiquant que le panier est vide
	return false;
    }

    public boolean estPlein(){  //predicat indiquant que le panier est plein
	return false;
    }

    //groupe 4
    public void ajout(Fruit o) throws PanierPleinException
    {  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein

//      System.out.println(this.contenanceMax+" "+fruits.size());
       if(this.contenanceMax>fruits.size())
       {
           if(o!=null)
           {
               fruits.add(o);
                System.out.println("fruit ajouté avec succes");
           }
         
       }
       else
       {
         throw new PanierPleinException();
       }
    }

    //groupe 5
    public void retrait() throws PanierVideException{ //retire le dernier fruit du panier si celui-ci n'est pas vide

    }

    //groupe 6
    public double getPrix()
    {  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans
	return 0;
    }

    //groupe 7
    public void boycotteOrigine(String origine){  //supprime du panier tous les fruits provenant du pays origine

    }

    //groupe 8
    @Override
    public boolean equals(Object o){  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
        return false;
    }
}