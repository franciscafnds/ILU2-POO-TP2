package frontiere;

import controleur.ControlAcheterProduit;
import villagegaulois.Etal;

public class BoundaryAcheterProduit {
	private ControlAcheterProduit controlAcheterProduit;

	public BoundaryAcheterProduit(ControlAcheterProduit controlAcheterProduit) {
		this.controlAcheterProduit = controlAcheterProduit;
	}

	public void acheterProduit(String nomAcheteur) {
        
	    if (controlAcheterProduit.isHabitant(nomAcheteur)) {
	        String produit = Clavier.entrerChaine("Quel produit voulez vous acheter ?");

	        Etal[] etals = controlAcheterProduit.rechercherEtalsProduit(produit);
	        if (etals.length == 0) {
	            System.out.println("Désolé, personne ne vend ce produit au marché\n");
	            return;
	        }

	        for (int i = 0; i < etals.length; i++) {
	            System.out.println((i + 1) + " - " + etals[i].getVendeur().getNom());
	        }

	        int vendeur = Clavier.entrerEntier("Choisissez un vendeur valide :");
	        while (vendeur <= 0 || vendeur > etals.length) {
	            vendeur = Clavier.entrerEntier("Choisissez un vendeur valide :");
	        }
	        vendeur -= 1;

	        System.out.println(nomAcheteur + " se déplace jusqu'à l'étal du vendeur " 
	            + etals[vendeur].getVendeur().getNom() 
	            + "\nBonjour " + nomAcheteur);
	        
	        int nombreAchete = Clavier.entrerEntier("Combien de " + produit + " voulez-vous acheter ?");

	        int quantiteRestante = etals[vendeur].getQuantite();
	        if (nombreAchete > quantiteRestante && quantiteRestante != 0) {
	            System.out.println(nomAcheteur + " veut acheter " + nombreAchete + " " + produit 
	                + ", malheureusement " + etals[vendeur].getVendeur().getNom() 
	                + " n'en a plus que " + quantiteRestante + ". " 
	                + nomAcheteur + " achète tout le stock de " 
	                + etals[vendeur].getVendeur().getNom() + ".");
	        } else if (quantiteRestante == 0) {
	            System.out.println(nomAcheteur + " veut acheter " + nombreAchete + " " + produit 
	                + ", malheureusement il n'y en a plus !");
	        } else {
	            System.out.println(nomAcheteur + " achète " + nombreAchete + " " + produit 
	                + " à " + etals[vendeur].getVendeur().getNom() + ".");
	        }

	        controlAcheterProduit.acheterProduit(etals[vendeur].getVendeur().getNom(), nombreAchete);

	    } else {
	        System.out.println("Je suis désolé " + nomAcheteur 
	            + " mais il faut être un habitant de notre village pour commercer ici.");
	    }
	}
}
