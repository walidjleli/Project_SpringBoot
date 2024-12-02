package tn.esprit.walid_se4.services;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.walid_se4.Entitis.Piste;
import tn.esprit.walid_se4.Reposetries.IInstructorRepository;
import tn.esprit.walid_se4.Reposetries.IPisteRepository;


import java.util.List;

@Service
@AllArgsConstructor

public class PisteServicesImpl implements IPisteServices {private final IPisteRepository pisteRepository ;

    public Piste addPiste(Piste piste){
        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) {
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public List<Piste> retrieveAll() {
        return (List<Piste>) pisteRepository.findAll();
    }

    @Override
    public void removePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }


}
