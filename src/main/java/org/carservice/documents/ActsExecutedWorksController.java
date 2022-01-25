package org.carservice.documents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Create the org.carservice.documents.ActsExecutedWorksController class.
 * This is a Spring Controller following REST style.
 */

@RestController
public class ActsExecutedWorksController {
    @Autowired
    private ActsExecutedWorksService service;

    @GetMapping("/actsexecutedworks")
    public List<ActsExecutedWorks> list() {
        return service.listAll();
    }

    @GetMapping("/actsexecutedworks/{id}")
    public ActsExecutedWorks get(@PathVariable Integer id) {
        try {
            return service.get(id);
        } catch(NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO_DATA_ON_THIS_ID", e);
        }
    }

    @PostMapping("/actsexecutedworks")
    public void add(@RequestBody ActsExecutedWorks actsExecutedWorks) {
        service.save(actsExecutedWorks);
    }

    @PutMapping("/actsexecutedworks/{id}")
    public ResponseEntity<?> update(@RequestBody ActsExecutedWorks actsExecutedWorks, @PathVariable Integer id) {
        try {
            ActsExecutedWorks existActExecutedWork = service.get(id);
            existActExecutedWork.setActExecutedWorkId(actsExecutedWorks.getActExecutedWorkId());
            existActExecutedWork.setOrganizationExecutorId(actsExecutedWorks.getOrganizationExecutorId());
            existActExecutedWork.setClientId(actsExecutedWorks.getClientId());
            existActExecutedWork.setWorkOrderId(actsExecutedWorks.getWorkOrderId());

            service.save(actsExecutedWorks);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch(NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/actsexecutedworks/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }
}
