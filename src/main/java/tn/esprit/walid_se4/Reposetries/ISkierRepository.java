package tn.esprit.walid_se4.Reposetries;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.walid_se4.Entitis.Skier;
import tn.esprit.walid_se4.Entitis.TypeSubscription;

import java.time.LocalDate;
import java.util.List;

public interface ISkierRepository extends CrudRepository<Skier,Long> {
    List<Skier> findBySubscription_TypeSub(TypeSubscription typeSubscription);
    Skier findByFirstNameAndLastName(String firstName, String lastName);
    Skier findByBirthDate(LocalDate birthDate);

}

