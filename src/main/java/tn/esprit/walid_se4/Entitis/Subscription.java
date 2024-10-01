package tn.esprit.walid_se4.Entitis;
import jakarta.persistence.*;

import java.time.LocalDate;



@Entity

public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numSub;
    LocalDate startDate;
    LocalDate endDate;
    Float price;
    TypeSubscription typeSub;


}
