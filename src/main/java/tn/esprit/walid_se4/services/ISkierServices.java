package tn.esprit.walid_se4.services;

import tn.esprit.walid_se4.Entitis.Skier;
import tn.esprit.walid_se4.Entitis.TypeSubscription;

import java.time.LocalDate;
import java.util.List;

public interface ISkierServices {
    Skier addSkier (Skier skier);
    Skier updateSkier (Skier skier);
    Skier retrieveSkier (Long numSkier);
    List<Skier> retrieveAll();
    void removeSkier(Long numSkier);
    void assignSkier(Long numSkier, Long numPiste);
    public Skier addSkierAndAssignToCourse(Skier skier, Long numCourse);

    List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription typeSubscription);

    Skier getByFirstnameAndLastname(String firstName , String lastName);
    Skier findByBirthDate(LocalDate birthDate);

}
