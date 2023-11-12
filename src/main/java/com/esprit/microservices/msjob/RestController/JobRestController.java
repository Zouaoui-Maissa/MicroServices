package com.esprit.microservices.msjob.RestController;

import com.esprit.microservices.msjob.DAO.Entities.Job;
import com.esprit.microservices.msjob.Service.IJobService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class JobRestController {

    IJobService iJobService;

    @GetMapping("findAll")
    List<Job> findAll(){
        return iJobService.findAll();
    }

    @GetMapping("findByIdJ/{id}")
    public Job findByIdJ(@PathVariable int id) {
        return iJobService.findById(id);
    }

    @GetMapping("/findByService/{service}")
    public Job findByService(@PathVariable String service) {
        return iJobService.findByService(service);
    }

    @PostMapping("addJob")
    Job addBloc(@RequestBody Job j){
        return iJobService.addJob(j);
    }

    @DeleteMapping("deleteJob")
    public void delete(@RequestBody Job j) {
        iJobService.delete(j);
    }

    @DeleteMapping("deleteById/{id}")
    public void deleteById(@PathVariable int id) {
        iJobService.deleteById(id);
    }

    @PutMapping("editJob")
    public Job editJob(@RequestBody Job j) {
        return iJobService.editJob(j);
    }

        @PostMapping("/updateJobState/{id}/{isAvailable}")
        public Job updateJobState(@PathVariable int id, @PathVariable boolean isAvailable) {
            return iJobService.updateJobState(id, isAvailable);
        }
}