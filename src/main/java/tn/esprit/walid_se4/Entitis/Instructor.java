package tn.esprit.walid_se4.Entitis;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity

public class Instructor implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
     Long numInstructor;
     String firstName;
     String lastName;
     LocalDate dateOfHire;
    @OneToMany
    Set<Course> courses;
}
