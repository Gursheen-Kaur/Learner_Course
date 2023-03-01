package com.task.assess.courses.service;

import com.task.assess.courses.model.Courses;
import com.task.assess.courses.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursesService {
    @Autowired
    private CoursesRepository coursesRepository;

    public String saveCoursesDetails(Courses courses) {
        Courses saved = coursesRepository.save(courses);
        return "Created" + saved;
    }

    public List<Courses> findCourseDetails() {
        return coursesRepository.findAll();
    }


    public boolean existDetails(Integer id) {
        return coursesRepository.existsById(id);
    }
    public Optional<Courses> findDeatilsById(Integer id){
        return coursesRepository.findById(id);
    }
    public long countDetails(){
        return coursesRepository.count();
    }
    public void deleteDetails(Integer id){
         coursesRepository.deleteById(id);
    }
    public void deleteAllDetails(){
        coursesRepository.deleteAll();
    }
}