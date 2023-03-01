package com.task.assess.learners.repository;
import com.task.assess.courses.model.Courses;
import com.task.assess.learners.model.Learners;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LearnersRepository extends CrudRepository<Learners,Integer> {
    public List<Learners> findAll();

    Learners findById(int learner_id);
    Learners save(Learners learners);
    public boolean existsById(Integer id);
    public Optional<Learners> findById(Integer id);
    public long count();
    public void deleteById(Integer id);
    public void deleteAll();


}