package hei.projet1.lamarche;

import hei.projet1.lamarche.route.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LamarcheApplication {

	public static void main(String[] args) {
		Lieu HEI = new Lieu("HEI");
		Lieu Marais = new Lieu("Marais");
		Lieu Sekolintsika = new Lieu("Sekolintsika");
		//HEI
		Lieu Pullman = new Lieu("pullman");
		Lieu Nexta = new Lieu("Nexta");
		Lieu Balançoire = new Lieu("Balançoire");
		Lieu Boulevard = new Lieu("Boulevard");
		Lieu ESTI = new Lieu("ESTI");

		Rue Andriantsihoavina = new Rue("Andriantsihoavina", List.of(HEI, Pullman));
		Rue Ranaivo = new Rue("Ranaivo", List.of(Pullman, Balançoire));
		Rue MaraisSekolintsika = new Rue("Marais - Sekolintsika", List.of(Marais, Sekolintsika));
		Rue SekolintsikaHEI = new Rue("Sekolintsika - HEI", List.of(Sekolintsika, HEI));
		Rue PullmanNexta = new Rue("Pullman - Nexta", List.of(Pullman, Nexta));
		Rue HEIBalançoire = new Rue("HEI - Balançoire", List.of(HEI, Balançoire));
		Rue BalançoireBoulevard = new Rue("Balançoire - Boulevard", List.of(Balançoire, Boulevard));
		Rue BoulevardESTI = new Rue("Boulevard - ESTI", List.of(Boulevard, ESTI));
		Rue BalançoireESTI = new Rue("Balançoire - ESTI", List.of(Balançoire, ESTI));

		Marcheur Bjarni = new Marcheur("Bjarni", "Islande");
		Carte carte = new Carte("CarteDeBjarni", List.of(Andriantsihoavina,Ranaivo,MaraisSekolintsika,SekolintsikaHEI,PullmanNexta,HEIBalançoire,BalançoireBoulevard,BoulevardESTI,BalançoireESTI));
		Parcours parcours = new Parcours(Bjarni, carte, HEI, ESTI);

		System.out.println(parcours);
	}

}
