package tn.esprit.walid_se4.Entitis;

import java.util.Set;
import jakarta.persistence.*;


@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numPiste;
    private String namePiste;
    private Color color;
    private int length;
    private int slope;
    @ManyToMany
    Set<Skier>skiers;





}
