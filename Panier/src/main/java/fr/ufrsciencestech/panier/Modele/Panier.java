package fr.ufrsciencestech.panier.Modele;


import java.util.*;
/**
 *
 * @author roudet
 */
public class Panier extends Observable {
    private ArrayList<Fruit> fruits;  //attribut pour stocker les fruits
    private int contenanceMax;        //nb maximum d'oranges que peut contenir le panier

    public Panier(int contenanceMax){  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)

	this.contenanceMax = contenanceMax;
	this.fruits = new ArrayList<Fruit>();
    }

    @Override
    public String toString(){  //affichage de ce qui est contenu dans le panier : liste des fruits presents
        String s = "";
	for (Fruit elem: fruits){
		s+= elem.toString() + " | ";
	}
	return s;
    }

    public ArrayList<Fruit> getFruits()
    {  //accesseur du premier attribut
       if(this.fruits.size() <= this.contenanceMax )
       {
           return this.fruits;
       }
       else 
       {
           System.err.println("Panier vide");
           return null;
       }
    }

    public void setFruits(ArrayList<Fruit> fruits) 
    { //modificateur du premier attribut
        if(fruits.size() > 0)
        {
            this.fruits = fruits;
        }
    }

    public int getTaillePanier(){  //accesseur retournant la taille allouee pour l'attibut fruits
        return this.fruits.size();
    }

    public int getContenanceMax(){  //accesseur du second attribut
	return this.contenanceMax;
    }

    public Fruit getFruit(int i) throws PanierVideException{  //accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou null s'il n'y a rien a cet emplacement
	if(this.fruits.size() > 0 )
        {
            if(this.fruits.get(i) != null)
            {
                return this.fruits.get(i);
            }
            else
            {
                System.err.println("Le Fruits n'est pas dans le panier!");
                return null;
            }
        }
        else 
        {
            throw new PanierVideException();
        }
    }

    public void setFruit(int i, Fruit f)
    {  //modificateur du fruit contenu dans le panier a l'emplacement n°i par f (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)
        if(this.fruits.get(i) != null)
        {
            this.fruits.set(i, f);
        }
    }

    public boolean estVide(){  //predicat indiquant que le panier est vide
	return this.fruits.size() == 0;
    }

    public boolean estPlein(){  //predicat indiquant que le panier est plein
	return this.fruits.size() == this.contenanceMax;
    }

    public void ajout(Fruit o) throws PanierPleinException
    {  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein

       if(this.contenanceMax>fruits.size())
       {
           if(o!=null)
           {
               fruits.add(o);
               setChanged();
               notifyObservers();
           }
       }
       else
       {
         throw new PanierPleinException();
       }
    }

    public void retrait() throws PanierVideException
    { //retire le dernier fruit du panier si celui-ci n'est pas vide
        if(this.getTaillePanier()>=1)
        {
            this.fruits.remove(this.getTaillePanier()-1);
            setChanged();
            notifyObservers();
        }
        else
        {
            throw new PanierVideException();
        }
    }

    public double getPrix()
    {  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans
	double sum = 0;
        for(Fruit f : this.fruits)
        {
            sum+=f.getPrix();
        }
        return sum;
    }

    public void boycotteOrigine(String origine)
    {  //supprime du panier tous les fruits provenant du pays origine
        for(Fruit f : this.fruits)
        {
            if(f.getOrigine().equals(origine))
            {
                this.fruits.remove(f);
            }
        }
    }

    @Override
    public boolean equals(Object o){  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
        if(o != null && getClass() == o.getClass())
        {
            Panier p = (Panier) o;
            int cpt = 0;
            for(Fruit f : this.fruits)
            {
                for(Fruit f2 : p.getFruits())
                {
                    if(f.equals(f2))
                    {
                        cpt++;
                    }
                }
            }
            return cpt == this.fruits.size();
        }
        else 
        {
            return false;
        }
    }
}
