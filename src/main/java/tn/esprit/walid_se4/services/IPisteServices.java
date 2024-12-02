package tn.esprit.walid_se4.services;

import tn.esprit.walid_se4.Entitis.Piste;

import java.util.List;

public interface IPisteServices { Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    Piste retrievePiste(Long numPiste);
    List<Piste> retrieveAll();
    void removePiste(Long numPiste);
}
