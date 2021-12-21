package org.carservice.clients;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Create the Domain Model Class(org.carservice.clients.ClientsOrganizations) to map with the "clients_organizations" table in the database.
 */

@Entity
public class ClientsOrganizations {
    private Integer clientOrganizationId;
    private String nameOfCompany;
    private String legalAdress;
    private String taxpayerNumber;
    private String registrationReasonCode;
    private String stateRegistrationNumber;
    private String bankDetails;
    private String agreementNumber;
    private Date agreementDate;
    private String mobile;

    public ClientsOrganizations() {
    }

    public ClientsOrganizations(Integer clientOrganizationId, String nameOfCompany, String legalAdress,
                                String taxpayerNumber, String registrationReasonCode, String stateRegistrationNumber,
                                String bankDetails, String agreementNumber, Date agreementDate, String mobile) {
        this.clientOrganizationId = clientOrganizationId;
        this.nameOfCompany = nameOfCompany;
        this.legalAdress = legalAdress;
        this.taxpayerNumber = taxpayerNumber;
        this.registrationReasonCode = registrationReasonCode;
        this.stateRegistrationNumber = stateRegistrationNumber;
        this.bankDetails = bankDetails;
        this.agreementNumber = agreementNumber;
        this.agreementDate = agreementDate;
        this.mobile = mobile;
    }

    public void setClientOrganizationId(Integer clientOrganizationId) {
        this.clientOrganizationId = clientOrganizationId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getClientOrganizationId() {
        return clientOrganizationId;
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

    public void setAgreementNumber(String agreementNumber) {
        this.agreementNumber = agreementNumber;
    }

    public String getAgreementNumber() {
        return agreementNumber;
    }

    public void setAgreementDate(Date agreementDate) {
        this.agreementDate = agreementDate;
    }

    public Date getAgreementDate() {
        return agreementDate;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }
}
