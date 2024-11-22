package tn.esprit.walid_se4.Entitis;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)

@Entity
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numSkier;
    String name;
    @Column(nullable = false)
    LocalDate birthDate;
    int age;
    @OneToOne(cascade = {CascadeType.PERSIST ,CascadeType.REMOVE })
    Subscription subscription;
    @ManyToMany (mappedBy = "skiers")
    Set<Piste> pistes;
    @OneToMany(mappedBy = "skier", fetch = FetchType.EAGER)
    Set<Registration> registration;
}
