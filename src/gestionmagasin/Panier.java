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
public class Panier {
    
    //variable
    
    private ArrayList<Produit> produits = new ArrayList<>();
    

    public ArrayList<Produit> getProduits() {
        return produits;
    }
    
    public void ajouterProduit(Produit p){
        produits.add(p);
    }
            
    public void supprimerProduit(Produit p){
        produits.remove(p);
    }
    
    public void afficherPanier(){
        System.out.println(produits);
    }
    public double calculerTotal(){
        double total = 0;
        for (Produit produit : produits) {
            total+= produit.getPrix() * produit.getQuantite();     
        }
        return total;
    }
}
