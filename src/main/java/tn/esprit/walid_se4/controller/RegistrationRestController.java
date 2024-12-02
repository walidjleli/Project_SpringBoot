package tn.esprit.walid_se4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.walid_se4.Entitis.Registration;
import tn.esprit.walid_se4.services.IRegistrationServices;

@RequiredArgsConstructor
@RequestMapping("registration")
@RestController

public class RegistrationRestController {
    private final IRegistrationServices registrationServices;

    @PostMapping("/add")
    public Registration saveRegistration(Registration registration){
        return registrationServices.addRegistration(registration);
    }
    @PutMapping("/update")
    public Registration updateRegistration(@RequestBody Registration registration){
        return registrationServices.updateRegistration(registration);
    }
    @GetMapping("/get/{numRegistration}")
    public Registration getRegistration(@PathVariable Long numRegistration){

        return registrationServices.retrieveRegistration(numRegistration);
    }


}
