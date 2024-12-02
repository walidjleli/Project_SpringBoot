package tn.esprit.walid_se4.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.walid_se4.Entitis.Instructor;
import tn.esprit.walid_se4.Reposetries.IInstructorRepository;


import java.util.List;

@RequiredArgsConstructor
@Service

public class InstructorServicesImpl implements IInstructorServices {
    private final IInstructorRepository instructorRepository;

    public Instructor addInstructor(Instructor instructor){
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    public Instructor retrieveInstructor(Long numInstructor) {
        return instructorRepository.findById(numInstructor).orElse(null);
    }

    @Override
    public List<Instructor> retrieveAll() {
        return (List<Instructor>) instructorRepository.findAll();
    }

    @Override
    public Instructor removeInstructor(Long numInstructor) {
        instructorRepository.deleteById(numInstructor);
        return null;
    }

}
