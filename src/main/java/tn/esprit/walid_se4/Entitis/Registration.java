package tn.esprit.walid_se4.Entitis;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity

public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long numRegistration;
     int numWeek;
   @ManyToOne
    Course course;
  @ManyToOne
    Skier skier;
}
