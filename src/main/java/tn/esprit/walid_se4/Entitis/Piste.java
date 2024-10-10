package tn.esprit.walid_se4.Entitis;

import java.io.Serializable;
import java.util.Set;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long numPiste;
     String namePiste;
     @Enumerated(EnumType.STRING)
     Color color;
     int length;
     int slope;
    @ManyToMany
    Set<Skier> skiers;





}
