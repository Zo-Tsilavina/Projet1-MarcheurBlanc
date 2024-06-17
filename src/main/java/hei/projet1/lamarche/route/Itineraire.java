package hei.projet1.lamarche.route;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Itineraire {
    private List<Lieu> chemin;

}
