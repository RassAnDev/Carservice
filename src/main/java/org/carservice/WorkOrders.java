package org.carservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Create the Domain Model Class(org.carservice.WorkOrders) to map with the "work_orders" table in the database.
 */

@Entity
public class WorkOrders {
    private Integer workOrderId;
    private Integer clientId;
    private Integer carId;
    private Integer employeePositionPerformer;
    private Integer employeePositionMasterCons;
    private Integer paymentOptionId;
    private Integer workOrderNumber;
    private Date startdate;
    private Date enddate;
    private Integer workQuantity;
    private double workAmount;
    private Integer autoPartQuantity;
    private double autoPartAmount;
    private double discountOnWork;
    private double totalCost;
    private double wagePercentage;
    private String recommendation;

    public WorkOrders() {
    }

    public WorkOrders(Integer workOrderId, Integer clientId, Integer carId, Integer employeePositionPerformer,
                      Integer employeePositionMasterCons, Integer paymentOptionId, Integer workOrderNumber,
                      Date startdate, Date enddate, Integer workQuantity, double workAmount, Integer autoPartQuantity,
                      double autoPartAmount, double discountOnWork, double totalCost, double wagePercentage,
                      String recommendation) {
        this.workOrderId = workOrderId;
        this.clientId = clientId;
        this.carId = carId;
        this.employeePositionPerformer = employeePositionPerformer;
        this.employeePositionMasterCons = employeePositionMasterCons;
        this.paymentOptionId = paymentOptionId;
        this.workOrderNumber = workOrderNumber;
        this.startdate = startdate;
        this.enddate = enddate;
        this.workQuantity = workQuantity;
        this.workAmount = workAmount;
        this.autoPartQuantity = autoPartQuantity;
        this.autoPartAmount = autoPartAmount;
        this.discountOnWork = discountOnWork;
        this.totalCost = totalCost;
        this.wagePercentage = wagePercentage;
        this.recommendation = recommendation;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setEmployeePositionPerformer(Integer employeePositionPerformer) {
        this.employeePositionPerformer = employeePositionPerformer;
    }

    public Integer getEmployeePositionPerformer() {
        return employeePositionPerformer;
    }

    public void setEmployeePositionMasterCons(Integer employeePositionMasterCons) {
        this.employeePositionMasterCons = employeePositionMasterCons;
    }

    public Integer getEmployeePositionMasterCons() {
        return employeePositionMasterCons;
    }

    public void setPaymentOptionId(Integer paymentOptionId) {
        this.paymentOptionId = paymentOptionId;
    }

    public Integer getPaymentOptionId() {
        return paymentOptionId;
    }

    public void setWorkOrderNumber(Integer workOrderNumber) {
        this.workOrderNumber = workOrderNumber;
    }

    public Integer getWorkOrderNumber() {
        return workOrderNumber;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setWorkQuantity(Integer workQuantity) {
        this.workQuantity = workQuantity;
    }

    public Integer getWorkQuantity() {
        return workQuantity;
    }

    public void setWorkAmount(double workAmount) {
        this.workAmount = workAmount;
    }

    public double getWorkAmount() {
        return workAmount;
    }

    public void setAutoPartQuantity(Integer autoPartQuantity) {
        this.autoPartQuantity = autoPartQuantity;
    }

    public Integer getAutoPartQuantity() {
        return autoPartQuantity;
    }

    public void setAutoPartAmount(double autoPartAmount) {
        this.autoPartAmount = autoPartAmount;
    }

    public double getAutoPartAmount() {
        return autoPartAmount;
    }

    public void setDiscountOnWork(double discountOnWork) {
        this.discountOnWork = discountOnWork;
    }

    public double getDiscountOnWork() {
        return discountOnWork;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setWagePercentage(double wagePercentage) {
        this.wagePercentage = wagePercentage;
    }

    public double getWagePercentage() {
        return wagePercentage;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation  = recommendation;
    }

    public String getRecommendation() {
        return recommendation;
    }
}
