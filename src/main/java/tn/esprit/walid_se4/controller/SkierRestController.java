package tn.esprit.walid_se4.controller;

import tn.esprit.walid_se4.Entitis.Skier;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.walid_se4.Entitis.TypeSubscription;
import tn.esprit.walid_se4.services.ISkierServices;
import io.swagger.v3.oas.annotations.Operation;


import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping("skier")
@RestController
public class SkierRestController {
    private final ISkierServices skierServices;

    @PostMapping("/add")
    public Skier saveSkier(@RequestBody Skier skier){
        return skierServices.addSkier(skier);
    }
    @PutMapping("/update")
    public Skier updateSkier(@RequestBody Skier skier){
        return skierServices.updateSkier(skier);
    }
    @GetMapping("/get/{numSkier}")
    public Skier getSkier(@PathVariable Long numSkier){

        return skierServices.retrieveSkier(numSkier);
    }
    @PutMapping("/assignToPiste/{numSkier}/{numPiste}")
    public void assignSkier(@PathVariable Long numSkier, @PathVariable Long numPiste){
        skierServices.assignSkier(numSkier, numPiste);
    }
    @Operation(description = "ajouter Skier et assigner au Course avec numCourse")
    @PutMapping("/addSkierAndAssignToCourse/{numCourse}")
    public Skier addSkierAndAssignToCourse(@RequestBody Skier skier ,@PathVariable Long numCourse){
        return skierServices.addSkierAndAssignToCourse(skier, numCourse);
    }
    @Operation(description = "récupérer Skier avec typeSubscription")
    @GetMapping("/bySubscriptionType")
    public List<Skier> getSkiersBySubscriptionType(@RequestParam TypeSubscription typeSubscription) {
        return skierServices.retrieveSkiersBySubscriptionType(typeSubscription);
    }

    @Operation (description ="récupérer Skier avec fistname and lastname")
    @GetMapping("/getBy/{firstName}/{lastName}")
    public Skier getSkierByFirstNameAndLastName(@PathVariable String firstName, @PathVariable String lastName) {
        return skierServices.getByFirstnameAndLastname(firstName,lastName);
    }

    @Operation (description ="récupérer Skier avec birthdate")
    @GetMapping("/getByBirthdate/{birthDate}")
    public Skier getSkierByBirthDate(@PathVariable LocalDate birthDate) {
        return skierServices.findByBirthDate(birthDate);
    }




}
