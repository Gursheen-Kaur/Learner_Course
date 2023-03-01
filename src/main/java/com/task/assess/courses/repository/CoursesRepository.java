package com.task.assess.courses.repository;

import com.task.assess.courses.model.Courses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CoursesRepository extends CrudRepository<Courses,Integer> {
    public Courses save(Courses courses);
    public List<Courses>findAll();
    public boolean existsById(Integer id);
    public Optional<Courses> findById(Integer id);
    public long count();
    public void deleteById(Integer id);
    public void deleteAll();





}
