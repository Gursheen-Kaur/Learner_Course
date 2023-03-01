package com.task.assess.learners.controller;


import com.task.assess.courses.model.Courses;
import com.task.assess.courses.service.CoursesService;
import com.task.assess.learners.model.Learners;
import com.task.assess.learners.service.LearnersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/learners")



public class LearnersController {
    private LearnersService learnersService;
    @Autowired

    public LearnersController(LearnersService service)
    {
        this.learnersService=service;
    }


    @RequestMapping(value = "/details/save",method = RequestMethod.POST)
    public String saveDetails(@RequestBody Learners learners) {
        return learnersService.saveLearnersDetails(learners);
    }
    @RequestMapping("/details")
    public List<Learners> findDetails() {
        return learnersService.findLearnersDetails();
    }
    @RequestMapping(value="/exist/{id}", method = RequestMethod.GET)
    public boolean existDetails(Integer id){
        return learnersService.existDetails(id);
    }
    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public Optional<Learners> findDetailsById(@PathVariable("id")int id)
    {
        return learnersService.findDetailsById(id);

    }
    @RequestMapping("/count")
    public long countDetails(){
        return learnersService.countDetails();
    }
    @RequestMapping("/delete")
    public void deleteDetails(Integer id){
        learnersService.deleteDetails(id);
    }
    @RequestMapping("/deleteall")
    public void deleteallDetails(){
        learnersService.deleteAllDetails();
    }


}

