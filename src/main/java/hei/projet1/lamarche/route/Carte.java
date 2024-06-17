package hei.projet1.lamarche.route;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@ToString
@AllArgsConstructor
@Getter
@Setter
public class Carte {
    private String nom;
    private List<Rue> rueExistant;
}
