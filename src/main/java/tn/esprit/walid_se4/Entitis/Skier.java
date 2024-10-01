package tn.esprit.walid_se4.Entitis;
import jakarta.persistence.*;



import java.time.LocalDate;
import java.util.Set;

@Entity
public class Skier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numSkier;
    private String name;
    private LocalDate birthDate;
    private int age;
    @OneToOne
    Subscription subscription;
    @ManyToMany
    Set<Piste>pistes;



}
