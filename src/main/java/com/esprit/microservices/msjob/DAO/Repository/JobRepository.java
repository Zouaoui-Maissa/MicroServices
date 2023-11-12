package com.esprit.microservices.msjob.DAO.Repository;

import com.esprit.microservices.msjob.DAO.Entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
@Repository
public interface JobRepository extends JpaRepository<Job,Integer> {
    Optional<Job> findByService(String service);

}
