package hei.projet1.lamarche.operation;

import hei.projet1.lamarche.route.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OperationParcours {
    public static Itineraire routeDuMarcheur(Parcours parcours) {
        Lieu depart = parcours.getDepart();
        Lieu arrive = parcours.getArrive();
        Carte carte = parcours.getCarte();

        List<Lieu> chemin = new ArrayList<>();
        Random random = new Random();
        Lieu courant = depart;
        chemin.add(courant);

        while (!courant.equals(arrive)) {
            List<Lieu> voisinsNonVisites = new ArrayList<>();
            for (Rue rue : carte.getRueExistant()) {
                if (rue.getRue().contains(courant)) {
                    for (Lieu voisin : rue.getRue()) {
                        if (!voisin.equals(courant) && !chemin.contains(voisin)) {
                            voisinsNonVisites.add(voisin);
                        }
                    }
                }
            }

            if (voisinsNonVisites.isEmpty()) {
                chemin.remove(chemin.size() - 1);
                if (chemin.isEmpty()) {
                    return null;
                }
                courant = chemin.get(chemin.size() - 1);
            } else {
                courant = voisinsNonVisites.get(random.nextInt(voisinsNonVisites.size()));
                chemin.add(courant);
            }
        }

        return new Itineraire(chemin);
    }
}
