package org.carservice.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Create the org.carservice.cars.CarsController class.
 * This is a Spring Controller following REST style.
 */

@RestController
public class CarsController {
    @Autowired
    private CarsService service;

    @GetMapping("/cars")
    public List<Cars> list() {
        return service.listAll();
    }

    @GetMapping("/cars/{id}")
    public Cars get(@PathVariable Integer id) {
        try {
            return service.get(id);
        } catch(NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NO_DATA_ON_THIS_ID", e);
        }
    }

    @PostMapping("/cars")
    public void add(@RequestBody Cars cars) {
        service.save(cars);
    }

    @PutMapping("/cars/{id}")
    public ResponseEntity<?> update(@RequestBody Cars cars, @PathVariable Integer id) {
        try {
            Cars existCar = service.get(id);
            existCar.setCarId(cars.getCarId());
            existCar.setBrand(cars.getBrand());
            existCar.setModel(cars.getModel());
            existCar.setLicensePlate(cars.getLicensePlate());
            existCar.setYearOfIssue(cars.getYearOfIssue());
            existCar.setVinCode(cars.getVinCode());
            existCar.setEngineVolume(cars.getEngineVolume());
            existCar.setEnginePower(cars.getEnginePower());
            existCar.setMileage(cars.getMileage());

            service.save(cars);

            return new ResponseEntity<>(HttpStatus.OK);
        } catch(NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/cars/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}
