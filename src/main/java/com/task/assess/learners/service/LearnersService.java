package com.task.assess.learners.service;

import com.task.assess.courses.model.Courses;
import com.task.assess.courses.repository.CoursesRepository;
import com.task.assess.learners.model.Learners;
import com.task.assess.learners.repository.LearnersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LearnersService {

    @Autowired
    private LearnersRepository learnersRepository;


    public String saveLearnersDetails(Learners learners) {
        Learners saved = learnersRepository.save(learners);
        return "Created" + saved;
    }

    public List<Learners> findLearnersDetails() {
        return learnersRepository.findAll();
    }


    public boolean existDetails(Integer id) {
        return learnersRepository.existsById(id);
    }
    public Optional<Learners> findDetailsById(Integer id){
        return learnersRepository.findById(id);
    }
    public long countDetails(){
        return learnersRepository.count();
    }
    public void deleteDetails(Integer id){
        learnersRepository.deleteById(id);
    }
    public void deleteAllDetails(){
        learnersRepository.deleteAll();
    }
}

