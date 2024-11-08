package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlEmmenagerTest {
	private Village village;
	private Chef abraracourix;
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initalisation...");
		village=new Village("le village des irréductible", 10, 5);
		abraracourix = new Chef("abraracourix", 10, village);
	}

	@Test
	void testControleEmmenager() {
		ControlEmmenager controleEmmenager = new ControlEmmenager (village);
		assertNotNull(controleEmmenager,"contructeur ne renvois pas null");
	}
	@Test
	void testIsHabitant() {
		ControlEmmenager controleEmmenager = new ControlEmmenager (village);
		controleEmmenager.ajouterGaulois("Bonemie", 10);
		assertTrue(controleEmmenager.isHabitant("Bonemie"));
		assertFalse(controleEmmenager.isHabitant("existepas"));
		controleEmmenager.ajouterDruide("Panoramix", 10, 1, 5);
		assertTrue(controleEmmenager.isHabitant("Panoramix"));
		}
	@Test
	void testAjouterDruide() {
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
	}
	@Test
	void testAjouterGaulois() {
		fail("Not yet implemented");
	}


}
