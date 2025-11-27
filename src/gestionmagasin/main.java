    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionmagasin;

/**
 *
 * @author marvi
 */
public class main {
    public static void main(String[] args) {
        // Creation du magasin
        Magasin magasin = new Magasin("Mon Magasin");

        // Création de quelques produits
        Produit p1 = new Produit(1, "Stylo", 1.50, 4);
        Produit p2 = new Produit(2, "Cahier", 3.00, 5);
        Produit p3 = new Produit(3, "Gomme", 0.80, 6);

        // produit
        magasin.ajoutProduit(p1);
        magasin.ajoutProduit(p2);
        magasin.ajoutProduit(p3);

        // Client
        Client c1 = new Client(1, "Alice", "alice@example.com");
        Client c2 = new Client(2, "Bob", "bob@example.com");

        magasin.ajoutClient(c1);
        magasin.ajoutClient(c2);

        System.out.println(" Magasin");
        System.out.println(magasin);

        System.out.println("\n Produits ");
        
        for (Produit p : magasin.getProduits()) {
            p.afficherDetails();
}
        System.out.println("\n Clients ");
        for (Client c : magasin.getClients()) {
            c.afficherDetails();
        }
    }
}
