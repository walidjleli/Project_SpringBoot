package tn.esprit.walid_se4.services;

import tn.esprit.walid_se4.Entitis.Registration;

import java.util.List;

public interface IRegistrationServices {
    Registration addRegistration(Registration registration);
    Registration updateRegistration(Registration registration);
    Registration retrieveRegistration(Long numRegistration);
    List<Registration> retrieveAll();
    void removeRegistration(Long numRegistration);
}
