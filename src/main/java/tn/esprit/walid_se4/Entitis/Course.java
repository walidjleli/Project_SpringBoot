package tn.esprit.walid_se4.Entitis;

import java.util.Set;
import jakarta.persistence.*;

@Entity

public class Course {
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
