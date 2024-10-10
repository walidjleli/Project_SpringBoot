package tn.esprit.walid_se4.Entitis;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;



@Entity

public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numSub;
    LocalDate startDate;
    LocalDate endDate;
    Float price;
    @Enumerated(EnumType.STRING)
    TypeSubscription typeSub;
}
