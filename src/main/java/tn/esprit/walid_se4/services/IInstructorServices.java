package tn.esprit.walid_se4.services;

import tn.esprit.walid_se4.Entitis.Instructor;
import java.util.List;

public interface IInstructorServices {
    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    Instructor retrieveInstructor(Long numInstructor);
    List<Instructor> retrieveAll();
    Instructor removeInstructor(Long numInstructor);
}
