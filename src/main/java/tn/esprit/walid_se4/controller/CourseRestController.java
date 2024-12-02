package tn.esprit.walid_se4.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.walid_se4.Entitis.Course;
import tn.esprit.walid_se4.services.ICourseServices;

@RequiredArgsConstructor
@RequestMapping("course")
@RestController

public class CourseRestController {
    private final ICourseServices courseServices;
    private Long numCourse;

    @PostMapping("/add")
    public Course saveCourse(Course course){
        return courseServices.addCourse(course);
    }

    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course){
        return courseServices.updateCourse(course);
    }
    @GetMapping("/get/{numCourse}")
    public Course getCourse(@PathVariable Long numCourse){

        return courseServices.retrieveCourse(numCourse);
    }
}
