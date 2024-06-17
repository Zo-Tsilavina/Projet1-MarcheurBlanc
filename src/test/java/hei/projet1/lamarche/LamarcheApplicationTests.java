package hei.projet1.lamarche;

import hei.projet1.lamarche.operation.OperationParcours;
import hei.projet1.lamarche.route.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class LamarcheApplicationTests {


	@Test
	public void testMarcheurParcours() {
		Lieu HEI = new Lieu("HEI");
		Lieu Marais = new Lieu("Marais");
		Lieu Sekolintsika = new Lieu("Sekolintsika");
		Lieu Pullman = new Lieu("Pullman");
		Lieu Nexta = new Lieu("Nexta");
		Lieu Balancoire = new Lieu("Balançoire");
		Lieu Boulevard = new Lieu("Boulevard");
		Lieu ESTI = new Lieu("ESTI");

		Rue Andriantsihoavina = new Rue("Andriantsihoavina", List.of(HEI, Pullman));
		Rue Ranaivo = new Rue("Ranaivo", List.of(Pullman, Balancoire));
		Rue MaraisSekolintsika = new Rue("Marais - Sekolintsika", List.of(Marais, Sekolintsika));
		Rue SekolintsikaHEI = new Rue("Sekolintsika - HEI", List.of(Sekolintsika, HEI));
		Rue PullmanNexta = new Rue("Pullman - Nexta", List.of(Pullman, Nexta));
		Rue HEIBalancoire = new Rue("HEI - Balançoire", List.of(HEI, Balancoire));
		Rue BalancoireBoulevard = new Rue("Balançoire - Boulevard", List.of(Balancoire, Boulevard));
		Rue BoulevardESTI = new Rue("Boulevard - ESTI", List.of(Boulevard, ESTI));
		Rue BalancoireESTI = new Rue("Balançoire - ESTI", List.of(Balancoire, ESTI));

		Marcheur Bjarni = new Marcheur("Bjarni", "Islande");
		Carte carte = new Carte("CarteDeBjarni", List.of(
				Andriantsihoavina, Ranaivo, MaraisSekolintsika, SekolintsikaHEI, PullmanNexta, HEIBalancoire,
				BalancoireBoulevard, BoulevardESTI, BalancoireESTI
		));

		Parcours parcours = new Parcours(Bjarni, carte, HEI, ESTI);

		Itineraire itineraire = OperationParcours.routeDuMarcheur(parcours);

		assertNotNull(itineraire, "Aucun itinéraire trouvé.");
		assertTrue(itineraire.getChemin().contains(ESTI), "L'itinéraire ne mène pas à ESTI.");

		System.out.println("Itinéraire trouvé :");
		for (Lieu lieu : itineraire.getChemin()) {
			System.out.println(lieu.getNom());
		}
	}
}
