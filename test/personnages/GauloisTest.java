package personnages;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import villagegaulois.Village;

class GauloisTest {
	private Village village;
	private Chef abraracourcix;
	private Gaulois gaulois;
	
	@BeforeEach
	void initialiser() {
		System.out.println("Initialisation...");
		village = new Village("le village des irréductibles",10, 5);
		abraracourcix = new Chef("Abraracourcix", 10, village);
		village.setChef(abraracourcix);
		gaulois = new Gaulois("Bonemine",6);
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testPrendreParole() {
		fail("Not yet implemented");
	}

	@Test
	void testGaulois() {
		fail("Not yet implemented");
	}

	@Test
	void testBoirePotion() {
		fail("Not yet implemented");
	}

}
