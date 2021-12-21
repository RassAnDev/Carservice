package org.carservice.autoparts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Create the Domain Model Class(org.carservice.autoparts.AutoParts) to map with the "auto_parts" table in the database.
 * This is a simple domain model class, with class name and field names are identical
 * to table name and column names in the database. It needs for the minimum number of JPA annotations.
 */

@Entity
public class AutoParts {
    private Integer autoPartId;
    private Integer workOrderId;
    private Date purchaseDate;
    private String autoPartName;
    private String catalogueNumber;
    private String supplierName;
    private double wholesaleUnitPrice;
    private double unitRetailPrice;
    private double markupAmount;

    public AutoParts() {
    }

    public AutoParts(Integer autoPartId, Integer workOrderId, Date purchaseDate,String autoPartName,
                     String catalogueNumber, String supplierName, double wholesaleUnitPrice,
                     double unitRetailPrice, double markupAmount) {
        this.autoPartId = autoPartId;
        this.workOrderId = workOrderId;
        this.purchaseDate = purchaseDate;
        this.autoPartName = autoPartName;
        this.catalogueNumber = catalogueNumber;
        this.supplierName = supplierName;
        this.wholesaleUnitPrice = wholesaleUnitPrice;
        this.unitRetailPrice = unitRetailPrice;
        this.markupAmount = markupAmount;
    }

    public void setAutoPartId(Integer autoPartId) {
        this.autoPartId = autoPartId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getAutoPartId() {
        return autoPartId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setAutoPartName(String autoPartName) {
        this.autoPartName = autoPartName;
    }

    public String getAutoPartName() {
        return autoPartName;
    }

    public void setCatalogueNumber(String catalogueNumber) {
        this.catalogueNumber = catalogueNumber;
    }

    public String getCatalogueNumber() {
        return catalogueNumber;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setWholesaleUnitPrice(double wholesaleUnitPrice) {
        this.wholesaleUnitPrice = wholesaleUnitPrice;
    }

    public double getWholesaleUnitPrice() {
        return wholesaleUnitPrice;
    }

    public void setUnitRetailPrice(double unitRetailPrice) {
        this.unitRetailPrice = unitRetailPrice;
    }

    public double getUnitRetailPrice() {
        return unitRetailPrice;
    }

    public void setMarkupAmount(double markupAmount) {
        this.markupAmount = markupAmount;
    }

    public double getMarkupAmount() {
        return markupAmount;
    }
}
