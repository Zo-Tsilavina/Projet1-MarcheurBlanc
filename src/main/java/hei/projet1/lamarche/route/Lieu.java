package hei.projet1.lamarche.route;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Lieu {
    private String nom;
    private List<Lieu> voisins;

    public Lieu(String nom) {
        this.nom = nom;
        this.voisins = new ArrayList<>();
    }

    public void ajouterVoisin(Lieu voisin) {
        this.voisins.add(voisin);
    }
}
