package com.esprit.microservices.msjob.Service;

import com.esprit.microservices.msjob.DAO.Entities.Job;

import java.util.List;

public interface IJobService {
    Job addJob(Job job);
    List<Job> addJobs(List<Job> jobs);
    List<Job> findAll();

    Job editJob(Job j);
    void deleteById(int id);
    void delete(Job job);

}
