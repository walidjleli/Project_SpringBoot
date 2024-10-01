package tn.esprit.walid_se4.Entitis;
import jakarta.persistence.*;

@Entity

public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numRegistration;
    private int numWeek;
   @ManyToOne
    Course courses;
  @ManyToOne
    Skier skier;


}
