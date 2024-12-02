package tn.esprit.walid_se4.services;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.reactive.TransactionalOperator;
import tn.esprit.walid_se4.Entitis.*;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

import tn.esprit.walid_se4.Reposetries.*;

@RequiredArgsConstructor
@Service
public class SkierServicesImpl implements ISkierServices {

    private final ISkierRepository skierRepository;
    private final IPisteRepository pisteRepository;
    private final ISubscriptionRepository subscriptionRepository;
    private final IRegistrationRepository registrationRepository;
    private final ICoursRepository courseRepository;


    @Override
    public Skier addSkier (Skier skier){
        Subscription subscription = skier.getSubscription();
        subscriptionRepository.save(subscription);
        skier.setSubscription(subscription);
        return skierRepository.save(skier);
    }

    @Override
    public Skier updateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier retrieveSkier(Long numSkier) {
        return skierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public List<Skier> retrieveAll() {
        return (List<Skier>) skierRepository.findAll();
    }

    @Override
    public void removeSkier(Long numSkier) {
        skierRepository.deleteById(numSkier);
    }

    @Override
    public void assignSkier(Long numSkier, Long numPiste) {
        Skier skier = skierRepository.findById(numSkier).orElse(null);
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        assert piste != null;
        piste.getSkiers().add(skier);
        pisteRepository.save(piste);
    }
    @Override
    public Skier addSkierAndAssignToCourse(Skier skier , Long numCourse){

       // Registration registration = registrationRepository.findById(numCourse).orElse(null);
        Course course = courseRepository.findById(numCourse).orElse(null);
        for (Registration registration : skier.getRegistration()){
            registration.setCourse(course);
            registration.setSkier(skier);
            registrationRepository.save(registration);
        }

        return skierRepository.save(skier);
    }
    @Override
    public List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription typeSubscription) {
        return skierRepository.findBySubscription_TypeSub(typeSubscription);
    }

   @Override
    public Skier getByFirstnameAndLastname(String firstName, String lastName) {

       return skierRepository.findByFirstNameAndLastName( firstName, lastName);
   }
    @Override
    public  Skier findByBirthDate(LocalDate birthDate){
        return skierRepository.findByBirthDate(birthDate);
    }



}