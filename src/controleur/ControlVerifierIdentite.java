package controleur;

import villagegaulois.Village;

public class ControlVerifierIdentite {
	private Village village;

	public ControlVerifierIdentite(Village village) {
		this.village = village;
	}

	public boolean verifierIdentite(String nomVendeur) {
		String nomGaulois = village.trouverHabitant(nomVendeur).getNom();
		if (nomGaulois != null) {
			return true;
		}
		return false;
	}
}
