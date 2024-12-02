package tn.esprit.walid_se4.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.walid_se4.Entitis.Registration;
import tn.esprit.walid_se4.Entitis.Skier;
import tn.esprit.walid_se4.Reposetries.IRegistrationRepository;
import tn.esprit.walid_se4.Reposetries.ISkierRepository;

import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
@Service
public class RegistrationServicesImpl implements IRegistrationServices{

    private final IRegistrationRepository registrationRepository;
    private final ISkierRepository iSkierRepository;

    public  Registration addRegistration(Registration registration){
        return registrationRepository.save(registration);
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        return registrationRepository.findById(numRegistration).orElse(null);
    }

    @Override
    public List<Registration> retrieveAll() {
        return (List<Registration>) registrationRepository.findAll();
    }

    @Override
    public void removeRegistration(Long numRegistration) {
        registrationRepository.deleteById(numRegistration);
    }




}
