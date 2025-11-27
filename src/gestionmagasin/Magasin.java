/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmagasin;

import java.util.ArrayList;

/**
 *
 * @author marvi
 */
public class Magasin {
    
    private ArrayList<Produit> produits;
    
    
    public void ajouterProduit(Produit p){
        produits.add(p);
    }
    
    
    public void afficherProduitsDisponibles(){
        System.out.println(produits);
    }
    
    public static Produit trouverProduitParNom(ArrayList<Produit> produit, String nomRecherche){ {
        int i = 0;
        while (i < produit.size()) {
            Produit p = produit.get(i);
            if (p.getNom().equalsIgnoreCase(nomRecherche)) { 
                return p;
            }
            i++;
        }
        return null; // si non trouvé
    }
   
}

}
