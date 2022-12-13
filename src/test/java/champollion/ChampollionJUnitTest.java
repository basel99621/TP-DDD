
package champollion;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ChampollionJUnitTest {
	Enseignant untel;
	UE uml, java;

	@BeforeEach
	public void setUp() {
		untel = new Enseignant("untel", "untel@gmail.com");
		uml = new UE("UML");
		java = new UE("Programmation en java tetst");
	}


	@Test
	public void testNouvelEnseignantSansService() {
		assertEquals(0, untel.heuresPrevues(),
				"Un nouvel enseignant doit avoir 0 heures prévues");
	}

	@Test
	public void testAjouteHeures() {
		// 10h TD pour UML
		untel.ajouteEnseignement(uml, 0, 10, 0);


		// 20h TD pour UML
		untel.ajouteEnseignement(uml, 0, 20, 0);
		System.out.println(untel.heuresPrevuesPourUE(uml));


	}

	@Test
	public void testAjouteHeureInvalides() throws Exception {
		// On va ajouter -10heures
		Exception exception = assertThrows(
				IllegalArgumentException.class,
				() -> untel.ajouteEnseignement(uml, -10, 0, 0));



	}

	@Test
	public void testEnSousService() {
		untel.ajouteEnseignement(java, 50, 50, 50);
		untel.ajouteEnseignement(uml, 50, 50, 50);

		Enseignant unAutre = new Enseignant("autre", "autre@gmail.com");
		unAutre.ajouteEnseignement(java, 20, 10, 10);


		assertEquals(true, unAutre.enSousService());
	}
}
