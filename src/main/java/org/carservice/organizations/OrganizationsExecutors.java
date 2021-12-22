package org.carservice.organizations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Create the Domain Model Class(org.carservice.organizations.OrganizationsExecutors) to map with the "organizations_executors" table in the database.
 */

@Entity
public class OrganizationsExecutors {
    private Integer organizationExecutorId;
    private String nameOfCompany;
    private String legalAdress;
    private String taxpayerNumber;
    private String registrationReasonCode;
    private String stateRegistrationNumber;
    private String bankDetails;

    public OrganizationsExecutors() {
    }

    public OrganizationsExecutors(Integer organizationExecutorId, String nameOfCompany, String legalAdress,
                                  String taxpayerNumber, String registrationReasonCode, String stateRegistrationNumber,
                                  String bankDetails) {
        this.organizationExecutorId = organizationExecutorId;
        this.nameOfCompany = nameOfCompany;
        this.legalAdress = legalAdress;
        this.taxpayerNumber = taxpayerNumber;
        this.registrationReasonCode = registrationReasonCode;
        this.stateRegistrationNumber = stateRegistrationNumber;
        this.bankDetails = bankDetails;
    }

    public void setOrganizationExecutorId(Integer organizationExecutorId) {
        this.organizationExecutorId = organizationExecutorId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getOrganizationExecutorId() {
        return organizationExecutorId;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setLegalAdress(String legalAdress) {
        this.legalAdress = legalAdress;
    }

    public String getLegalAdress() {
        return legalAdress;
    }

    public void setTaxpayerNumber(String taxpayerNumber) {
        this.taxpayerNumber = taxpayerNumber;
    }

    public String getTaxpayerNumber() {
        return taxpayerNumber;
    }

    public void setRegistrationReasonCode(String registrationReasonCode) {
        this.registrationReasonCode = registrationReasonCode;
    }

    public String getRegistrationReasonCode() {
        return registrationReasonCode;
    }

    public void setStateRegistrationNumber(String stateRegistrationNumber) {
        this.stateRegistrationNumber = stateRegistrationNumber;
    }

    public String getStateRegistrationNumber() {
        return stateRegistrationNumber;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getBankDetails() {
        return bankDetails;
    }
}
