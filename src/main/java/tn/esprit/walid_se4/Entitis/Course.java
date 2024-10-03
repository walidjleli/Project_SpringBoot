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

public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numCourse;
    int level;
    @Enumerated(EnumType.STRING)
    TypeCourse typeCourse;
    @Enumerated(value = EnumType.STRING)
    Support support;
    Float price;
    int timeSlot;
    @OneToMany
    Set<Registration>registrations;
}
