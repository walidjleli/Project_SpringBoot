package tn.esprit.walid_se4.Reposetries;
import org.springframework.data.repository.CrudRepository;
import tn.esprit.walid_se4.Entitis.Course;

public interface ICoursRepository extends CrudRepository<Course, Long> {
}
