package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Druide;
import personnages.Gaulois;
import villagegaulois.Village;

class ControlEmmenagerTest {
	Village village;
	ControlEmmenager controlEmmenager;
	Gaulois[] gaulois;
	Druide druide;
	Chef chef;
	
	@BeforeEach
	void initialiser() {
		village = new Village("village",10,10);
		village.setChef(chef);
		controlEmmenager = new ControlEmmenager(village);
		gaulois = new Gaulois[10];
	}
	
	@Test
	void testControlEmmenager() {
		controlEmmenager = new ControlEmmenager(village);
		assertNotNull(controlEmmenager,"Constructeur ne renvoie pas null");
	}

	@Test
	void testIsHabitant() {
		controlEmmenager.ajouterGaulois("gaulois", 5);
		assertNotNull(controlEmmenager.isHabitant("gaulois"));
	}

	@Test
	void testAjouterDruide() {
		controlEmmenager.ajouterDruide("druide", 7, 2, 9);
		controlEmmenager.
		assertNotNull(controlEmmenager.isHabitant("druide"));
	}

	@Test
	void testAjouterGaulois() {
		controlEmmenager.ajouterGaulois("gaulois", 2);
		assertNotNull(village.trouverHabitant("gaulois"));
	}

}
