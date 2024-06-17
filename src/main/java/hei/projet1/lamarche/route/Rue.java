package hei.projet1.lamarche.route;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Rue {
    private String nom;
    private List<Lieu> rue;
}
