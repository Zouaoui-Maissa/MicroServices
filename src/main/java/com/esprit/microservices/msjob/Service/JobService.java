package com.esprit.microservices.msjob.Service;

import com.esprit.microservices.msjob.DAO.Entities.Job;
import com.esprit.microservices.msjob.DAO.Repository.JobRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;
import java.util.List;

@Service
@AllArgsConstructor
public class JobService implements IJobService{

    JobRepository jobRepository;

    @Override
    public Job addJob(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public List<Job> addJobs(List<Job> jobs) {
        return jobRepository.saveAll(jobs);
    }

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public Job findById(int id) {
        return jobRepository.findById(id).orElse(Job.builder().id(0).service("Pas de bloc").etat(false).build());
    }

    @Override
    public Job findByService(String service) {
        return jobRepository.findByService(service)
                .orElse(Job.builder().id(0).service("Pas de bloc").etat(false).build());
    }

    @Override
    public Job editJob(Job j) {
        return jobRepository.save(j);
    }

    @Override
    public void deleteById(int id) {
        jobRepository.deleteById(id);
    }

    @Override
    public void delete(Job job) {
        jobRepository.delete(job);

    }

    @Override
    public Job updateJobState(int id, boolean isAvailable) {
        Job job = jobRepository.findById(id)
                .orElse(Job.builder().id(0).service("Pas de bloc").etat(false).build());

        job.setEtat(isAvailable);

        return jobRepository.save(job);
    }
}
