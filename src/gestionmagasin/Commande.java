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
public class Commande {
    
    
    //Variables
    private int idCommande;
    private Client client;
    private ArrayList<Produit> produitsCommandes;
    private double total;
    
    
    
    public Commande(int idCommande, Client client, ArrayList<Produit> produitsCommandes){
        this.idCommande = idCommande;
        this.client = client;
        this.produitsCommandes = produitsCommandes;
        this.total = calculerTotal();
    }
    
    public double calculerTotal() {
        double total = 0;
        for (Produit p : produitsCommandes) {
            total += p.getPrix();
        }

        return total;
    }
    
    public void afficherDetailsCommande() {
    System.out.println(
        "Identifiant de la commande : " + idCommande + "\n" +
        "Nom du client : " + client.getNom() + "\n" +
        "Liste des produits : " + produitsCommandes + "\n" +
        "Total : " + total
    );
}
}
        