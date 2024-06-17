package hei.projet1.lamarche.route;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Parcours {
    private Marcheur marcheur;
    private Carte carte;
    private Lieu depart;
    private Lieu arrive;
}
