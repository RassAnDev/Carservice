package org.carservice.works;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Create the Domain Model Class(org.carservice.works.Works) to map with the "works" table in the database.
 */

@Entity
public class Works {
    private Integer workId;
    private Integer workOrderId;
    private String title;
    private double unitPrice;

    public Works() {
    }

    public Works(Integer workId, Integer workOrderId, String title, double unitPrice) {
        this.workId = workId;
        this.workOrderId = workOrderId;
        this.title = title;
        this.unitPrice = unitPrice;
    }

    public void setWorkId(Integer workId) {
        this.workId = workId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getWorkId() {
        return workId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
