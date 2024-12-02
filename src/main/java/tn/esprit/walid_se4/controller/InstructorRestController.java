package tn.esprit.walid_se4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.walid_se4.Entitis.Instructor;
import tn.esprit.walid_se4.services.IInstructorServices;

@RequiredArgsConstructor
@RequestMapping("instructor")
@RestController

public class InstructorRestController {
    private final IInstructorServices instructorServices;

    @PostMapping("/add")
    public Instructor saveInstructor(@RequestBody Instructor instructor){
        return instructorServices.addInstructor(instructor);
    }
    @PutMapping("/update")
    public Instructor updateInstructor(@RequestBody Instructor instructor){
        return instructorServices.updateInstructor(instructor);
    }
    @DeleteMapping("/delete/{numInstructor}")
    public Instructor removeInstructor(@PathVariable Long numInstructor){
        return instructorServices.removeInstructor(numInstructor);
    }
    @GetMapping("/get/{numInstructor}")
    public Instructor getPInstructor(@PathVariable Long numInstructor){

        return instructorServices.retrieveInstructor(numInstructor);
    }
}
