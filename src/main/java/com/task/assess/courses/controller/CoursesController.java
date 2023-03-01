package com.task.assess.courses.controller;

import com.task.assess.courses.model.Courses;
import com.task.assess.courses.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/courses")



public class CoursesController {
    @Autowired
    private CoursesService coursesService;

    @RequestMapping("/details/save")
    public String saveDetails(@RequestBody Courses courses) {
        return coursesService.saveCoursesDetails(courses);
    }
    @RequestMapping("/details")
    public List<Courses> findDetails() {
        return coursesService.findCourseDetails();
    }
    @RequestMapping("/exist")
    public boolean existDetails(Integer id){
        return coursesService.existDetails(id);
    }
    @RequestMapping("/find")
    public Optional<Courses> findDetailsById(@PathVariable("id")int id)
    {
        return coursesService.findDeatilsById(id);

    }
    @RequestMapping("/count")
    public long countDetails(){
        return coursesService.countDetails();
    }
    @RequestMapping("/delete")
    public void deleteDetails(Integer id){
        coursesService.deleteDetails(id);
    }
    @RequestMapping("/deleteall")
    public void deleteallDetails(){
        coursesService.deleteAllDetails();
    }


}
