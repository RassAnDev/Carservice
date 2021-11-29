package org.carservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Create the Domain Model Class(org.carservice.Cars) to map with the "cars" table in the database.
 */

@Entity
public class Cars {
    private Integer carId;
    private String brand;
    private String model;
    private String licensePlate;
    private Integer yearOfIssue;
    private String vinCode;
    private double engineVolume;
    private Integer enginePower;
    private Integer mileage;

    public Cars() {
    }

    public Cars(Integer carId, String brand, String model, String licensePlate, Integer yearOfIssue,
                String vinCode, double engineVolume, Integer enginePower, Integer mileage) {
        this.carId = carId;
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.yearOfIssue = yearOfIssue;
        this.vinCode = vinCode;
        this.engineVolume = engineVolume;
        this.enginePower = enginePower;
        this.mileage = mileage;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getCarId() {
        return carId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setYearOfIssue(Integer yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEnginePower(Integer enginePower) {
        this.enginePower = enginePower;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getMileage() {
        return mileage;
    }
}
