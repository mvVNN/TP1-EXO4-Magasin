package gestionmagasin;

import java.util.ArrayList;

public class Magasin {

    private String nom;
    private ArrayList<Produit> produits;
    private ArrayList<Client> clients;

    public Magasin(String nom) {
        this.nom = nom;
        this.produits = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public void ajoutProduit(Produit p) {
        produits.add(p);
    }

    public ArrayList<Produit> getProduits() {
        return produits;
    }

    public void ajoutClient(Client c) {
        clients.add(c);
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public Produit rechercherProduit(String nomRecherche) {
        for (Produit p : produits) {
            if (p.getNom().equalsIgnoreCase(nomRecherche)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Magasin : " + nom +
               "\nProduits : " + produits.size() +
               "\nClients : " + clients.size();
    }
}
