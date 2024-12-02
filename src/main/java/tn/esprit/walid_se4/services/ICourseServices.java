package tn.esprit.walid_se4.services;

import tn.esprit.walid_se4.Entitis.Course;

import java.util.List;

public interface ICourseServices {
    Course addCourse(Course course);
    Course updateCourse(Course course);
    Course retrieveCourse( Long numCourse);
    List<Course> retrieveAll();
    void removeCourse(Long numCourse);

}
