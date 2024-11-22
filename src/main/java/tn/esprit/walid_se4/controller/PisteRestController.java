package tn.esprit.walid_se4.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.walid_se4.Entitis.Piste;
import tn.esprit.walid_se4.services.IPisteServices;
import tn.esprit.walid_se4.services.PisteServicesImpl;

@AllArgsConstructor
@RestController
@RequestMapping("piste")
public class PisteRestController {
    private final IPisteServices pisteServices;

    @PostMapping("/add")
    public Piste savePiste(Piste piste) {
        return pisteServices.addPiste(piste);
    }

    @PutMapping("/update")
    public Piste updatePiste(@RequestBody Piste piste) {
        return pisteServices.updatePiste(piste);
    }

    @GetMapping("/get/{numPiste}")
    public Piste getPiste(@PathVariable Long numPiste) {

        return pisteServices.retrievePiste(numPiste);
    }
}
