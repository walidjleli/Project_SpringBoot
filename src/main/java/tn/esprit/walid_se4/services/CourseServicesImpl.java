package tn.esprit.walid_se4.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.walid_se4.Entitis.Course;
import tn.esprit.walid_se4.Reposetries.ICoursRepository;

import java.util.List;

@RequiredArgsConstructor
@Service

public class CourseServicesImpl implements ICourseServices{
     private final ICoursRepository courseRepository;

     public Course addCourse(Course course) { return courseRepository.save(course); }
    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course retrieveCourse(Long numCourse) {
        return courseRepository.findById(numCourse).orElse(null);
    }

    @Override
    public List<Course> retrieveAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public void removeCourse(Long numCourse) {
        courseRepository.deleteById(numCourse);
    }


}
