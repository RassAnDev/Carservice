package org.carservice.workorders;

import org.carservice.autoparts.AutoParts;
import org.carservice.cars.Cars;
import org.carservice.clients.Clients;
import org.carservice.clients.ClientsIndividuals;
import org.carservice.clients.ClientsOrganizations;
import org.carservice.employees.Employees;
import org.carservice.payments.PaymentsOptions;
import org.carservice.works.Works;

import java.util.Date;

public class WorkOrderReport {
    private Integer workOrderId;
    private Integer clientId;
    private Integer carId;
    private Integer employeePositionPerformer;
    private Integer employeePositionMasterCons;
    private Integer paymentOptionId;
    private Integer workOrderNumber;
    private Date startDate;
    private Date endDate;
    private Integer workQuantity;
    private double workAmount;
    private Integer autoPartQuantity;
    private double autoPartAmount;
    private double discountOnWork;
    private double totalCost;
    private double wagePercentage;
    private String recommendation;
    private String brand;
    private String model;
    private String licensePlate;
    private Integer yearOfIssue;
    private String vinCode;
    private double engineVolume;
    private Integer enginePower;
    private Integer mileage;
    private Integer clientIndividualId;
    private String clientIndividualSurname;
    private String clientIndividualFirstname;
    private String clientIndividualPatronymic;
    private String clientIndividualMobile;
    private Integer clientOrganizationId;
    private String nameOfCompany;
    private String legalAddress;
    private String taxpayerNumber;
    private String registrationReasonCode;
    private String stateRegistrationNumber;
    private String bankDetails;
    private String agreementNumber;
    private Date agreementDate;
    private String clientOrganizationMobile;
    private Integer clientsClientId;
    private Integer clientsClientOrganizationId;
    private Integer clientsClientIndividualId;
    private Integer employeePositionId;
    private String employeeSurname;
    private String employeeFirstname;
    private String employeePatronymic;
    private Integer workId;
    private Integer worksWorkOrderId;
    private String workTitle;
    private double workUnitPrice;
    private Integer paymentsOptionsPaymentOptionId;
    private String cash;
    private String cashless;
    private String autoPartName;
    private String catalogueNumber;
    private double unitRetailPrice;

    public WorkOrderReport() {
    }

    public WorkOrderReport(Integer workOrderId, Integer clientId, Integer carId, Integer employeePositionPerformer,
                           Integer employeePositionMasterCons, Integer paymentOptionId, Integer workOrderNumber,
                           Date startDate, Date endDate, Integer workQuantity, double workAmount,
                           Integer autoPartQuantity, double autoPartAmount, double discountOnWork, double totalCost,
                           double wagePercentage, String recommendation, String brand, String model,
                           String licensePlate, Integer yearOfIssue, String vinCode, double engineVolume,
                           Integer enginePower, Integer mileage, Integer clientIndividualId,
                           String clientIndividualSurname, String clientIndividualFirstname,
                           String clientIndividualPatronymic, String clientIndividualMobile,
                           Integer clientOrganizationId, String nameOfCompany, String legalAddress,
                           String taxpayerNumber, String registrationReasonCode, String stateRegistrationNumber,
                           String bankDetails, String agreementNumber, Date agreementDate,
                           String clientOrganizationMobile, Integer clientsClientId, Integer clientsClientOrganizationId,
                           Integer clientsClientIndividualId, Integer employeePositionId, String employeeSurname,
                           String employeeFirstname, String employeePatronymic, Integer workId, Integer worksWorkOrderId,
                           String workTitle, double workUnitPrice, Integer paymentsOptionsPaymentOptionId, String cash,
                           String cashless, String autoPartName, String catalogueNumber, double unitRetailPrice) {
        this.workOrderId = workOrderId;
        this.clientId = clientId;
        this.carId = carId;
        this.employeePositionPerformer = employeePositionPerformer;
        this.employeePositionMasterCons = employeePositionMasterCons;
        this.paymentOptionId = paymentOptionId;
        this.workOrderNumber = workOrderNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.workQuantity = workQuantity;
        this.workAmount = workAmount;
        this.autoPartQuantity = autoPartQuantity;
        this.autoPartAmount = autoPartAmount;
        this.discountOnWork = discountOnWork;
        this.totalCost = totalCost;
        this.wagePercentage = wagePercentage;
        this.recommendation = recommendation;
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.yearOfIssue = yearOfIssue;
        this.vinCode = vinCode;
        this.engineVolume = engineVolume;
        this.enginePower = enginePower;
        this.mileage = mileage;
        this.clientIndividualId = clientIndividualId;
        this.clientIndividualSurname = clientIndividualSurname;
        this.clientIndividualFirstname = clientIndividualFirstname;
        this.clientIndividualPatronymic = clientIndividualPatronymic;
        this.clientIndividualMobile = clientIndividualMobile;
        this.clientOrganizationId = clientOrganizationId;
        this.nameOfCompany = nameOfCompany;
        this.legalAddress = legalAddress;
        this.taxpayerNumber = taxpayerNumber;
        this.registrationReasonCode = registrationReasonCode;
        this.stateRegistrationNumber = stateRegistrationNumber;
        this.bankDetails = bankDetails;
        this.agreementNumber = agreementNumber;
        this.agreementDate = agreementDate;
        this.clientOrganizationMobile = clientOrganizationMobile;
        this.clientsClientId = clientsClientId;
        this.clientsClientOrganizationId = clientsClientOrganizationId;
        this.clientsClientIndividualId = clientsClientIndividualId;
        this.employeePositionId = employeePositionId;
        this.employeeSurname = employeeSurname;
        this.employeeFirstname = employeeFirstname;
        this.employeePatronymic = employeePatronymic;
        this.workId = workId;
        this.worksWorkOrderId = worksWorkOrderId;
        this.workTitle = workTitle;
        this.workUnitPrice = workUnitPrice;
        this.paymentsOptionsPaymentOptionId = paymentsOptionsPaymentOptionId;
        this.cash = cash;
        this.cashless = cashless;
        this.autoPartName = autoPartName;
        this.catalogueNumber = catalogueNumber;
        this.unitRetailPrice = unitRetailPrice;
    }

    public Integer getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(WorkOrders workOrderId) {
        this.workOrderId = workOrderId.getWorkOrderId();
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(WorkOrders clientId) {
        this.clientId = clientId.getClientId();
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(WorkOrders carId) {
        this.carId = carId.getCarId();
    }

    public Integer getEmployeePositionPerformer() {
        return employeePositionPerformer;
    }

    public void setEmployeePositionPerformer(WorkOrders employeePositionPerformer) {
        this.employeePositionPerformer = employeePositionPerformer.getEmployeePositionPerformer();
    }

    public Integer getEmployeePositionMasterCons() {
        return employeePositionMasterCons;
    }

    public void setEmployeePositionMasterCons(WorkOrders employeePositionMasterCons) {
        this.employeePositionMasterCons = employeePositionMasterCons.getEmployeePositionMasterCons();
    }

    public Integer getPaymentOptionId() {
        return paymentOptionId;
    }

    public void setPaymentOptionId(WorkOrders paymentOptionId) {
        this.paymentOptionId = paymentOptionId.getPaymentOptionId();
    }

    public Integer getWorkOrderNumber() {
        return workOrderNumber;
    }

    public void setWorkOrderNumber(WorkOrders workOrderNumber) {
        this.workOrderNumber = workOrderNumber.getWorkOrderNumber();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(WorkOrders startDate) {
        this.startDate = startDate.getStartDate();
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(WorkOrders endDate) {
        this.endDate = endDate.getEndDate();
    }

    public Integer getWorkQuantity() {
        return workQuantity;
    }

    public void setWorkQuantity(WorkOrders workQuantity) {
        this.workQuantity = workQuantity.getWorkQuantity();
    }

    public double getWorkAmount() {
        return workAmount;
    }

    public void setWorkAmount(WorkOrders workAmount) {
        this.workAmount = workAmount.getWorkAmount();
    }

    public Integer getAutoPartQuantity() {
        return autoPartQuantity;
    }

    public void setAutoPartQuantity(WorkOrders autoPartQuantity) {
        this.autoPartQuantity = autoPartQuantity.getAutoPartQuantity();
    }

    public double getAutoPartAmount() {
        return autoPartAmount;
    }

    public void setAutoPartAmount(WorkOrders autoPartAmount) {
        this.autoPartAmount = autoPartAmount.getAutoPartAmount();
    }

    public double getDiscountOnWork() {
        return discountOnWork;
    }

    public void setDiscountOnWork(WorkOrders discountOnWork) {
        this.discountOnWork = discountOnWork.getDiscountOnWork();
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(WorkOrders totalCost) {
        this.totalCost = totalCost.getTotalCost();
    }

    public double getWagePercentage() {
        return wagePercentage;
    }

    public void setWagePercentage(WorkOrders wagePercentage) {
        this.wagePercentage = wagePercentage.getWagePercentage();
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(WorkOrders recommendation) {
        this.recommendation = recommendation.getRecommendation();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(Cars brand) {
        this.brand = brand.getBrand();
    }

    public String getModel() {
        return model;
    }

    public void setModel(Cars model) {
        this.model = model.getModel();
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(Cars licensePlate) {
        this.licensePlate = licensePlate.getLicensePlate();
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Cars yearOfIssue) {
        this.yearOfIssue = yearOfIssue.getYearOfIssue();
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(Cars vinCode) {
        this.vinCode = vinCode.getVinCode();
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Cars engineVolume) {
        this.engineVolume = engineVolume.getEngineVolume();
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Cars enginePower) {
        this.enginePower = enginePower.getEnginePower();
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Cars mileage) {
        this.mileage = mileage.getMileage();
    }

    public Integer getClientIndividualId() {
        return clientIndividualId;
    }

    public void setClientIndividualId(ClientsIndividuals clientIndividualId) {
        this.clientIndividualId = clientIndividualId.getClientIndividualId();
    }

    public String getClientIndividualSurname() {
        return clientIndividualSurname;
    }

    public void setClientIndividualSurname(ClientsIndividuals clientIndividualSurname) {
        this.clientIndividualSurname = clientIndividualSurname.getSurname();
    }

    public String getClientIndividualFirstname() {
        return clientIndividualFirstname;
    }

    public void setClientIndividualFirstname(ClientsIndividuals clientIndividualFirstname) {
        this.clientIndividualFirstname = clientIndividualFirstname.getFirstname();
    }

    public String getClientIndividualPatronymic() {
        return clientIndividualPatronymic;
    }

    public void setClientIndividualPatronymic(ClientsIndividuals clientIndividualPatronymic) {
        this.clientIndividualPatronymic = clientIndividualPatronymic.getPatronymic();
    }

    public String getClientIndividualMobile() {
        return clientIndividualMobile;
    }

    public void setClientIndividualMobile(ClientsIndividuals clientIndividualMobile) {
        this.clientIndividualMobile = clientIndividualMobile.getMobile();
    }

    public Integer getClientOrganizationId() {
        return clientOrganizationId;
    }

    public void setClientOrganizationId(ClientsOrganizations clientOrganizationId) {
        this.clientOrganizationId = clientOrganizationId.getClientOrganizationId();
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(ClientsOrganizations nameOfCompany) {
        this.nameOfCompany = nameOfCompany.getNameOfCompany();
    }

    public String getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(ClientsOrganizations legalAddress) {
        this.legalAddress = legalAddress.getLegalAddress();
    }

    public String getTaxpayerNumber() {
        return taxpayerNumber;
    }

    public void setTaxpayerNumber(ClientsOrganizations taxpayerNumber) {
        this.taxpayerNumber = taxpayerNumber.getTaxpayerNumber();
    }

    public String getRegistrationReasonCode() {
        return registrationReasonCode;
    }

    public void setRegistrationReasonCode(ClientsOrganizations registrationReasonCode) {
        this.registrationReasonCode = registrationReasonCode.getRegistrationReasonCode();
    }

    public String getStateRegistrationNumber() {
        return stateRegistrationNumber;
    }

    public void setStateRegistrationNumber(ClientsOrganizations stateRegistrationNumber) {
        this.stateRegistrationNumber = stateRegistrationNumber.getStateRegistrationNumber();
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(ClientsOrganizations bankDetails) {
        this.bankDetails = bankDetails.getBankDetails();
    }

    public String getAgreementNumber() {
        return agreementNumber;
    }

    public void setAgreementNumber(ClientsOrganizations agreementNumber) {
        this.agreementNumber = agreementNumber.getAgreementNumber();
    }

    public Date getAgreementDate() {
        return agreementDate;
    }

    public void setAgreementDate(ClientsOrganizations agreementDate) {
        this.agreementDate = agreementDate.getAgreementDate();
    }

    public String getClientOrganizationMobile() {
        return clientOrganizationMobile;
    }

    public void setClientOrganizationMobile(ClientsOrganizations clientOrganizationMobile) {
        this.clientOrganizationMobile = clientOrganizationMobile.getMobile();
    }

    public Integer getClientsClientId() {
        return clientsClientId;
    }

    public void setClientsClientId(Clients clientsClientId) {
        this.clientsClientId = clientsClientId.getClientId();
    }

    public Integer getClientsClientOrganizationId() {
        return clientsClientOrganizationId;
    }

    public void setClientsClientOrganizationId(Clients clientsClientOrganizationId) {
        this.clientsClientOrganizationId = clientsClientOrganizationId.getClientOrganizationId();
    }

    public Integer getClientsClientIndividualId() {
        return clientsClientIndividualId;
    }

    public void setClientsClientIndividualId(Clients clientsClientIndividualId) {
        this.clientsClientIndividualId = clientsClientIndividualId.getClientIndividualId();
    }

    public Integer getEmployeePositionId() {
        return employeePositionId;
    }

    public void setEmployeePositionId(Employees employeePositionId) {
        this.employeePositionId = employeePositionId.getEmployeePositionId();
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public void setEmployeeSurname(Employees employeeSurname) {
        this.employeeSurname = employeeSurname.getSurname();
    }

    public String getEmployeeFirstname() {
        return employeeFirstname;
    }

    public void setEmployeeFirstname(Employees employeeFirstname) {
        this.employeeFirstname = employeeFirstname.getFirstname();
    }

    public String getEmployeePatronymic() {
        return employeePatronymic;
    }

    public void setEmployeePatronymic(Employees employeePatronymic) {
        this.employeePatronymic = employeePatronymic.getPatronymic();
    }

    public Integer getWorkId() {
        return workId;
    }

    public void setWorkId(Works workId) {
        this.workId = workId.getWorkId();
    }

    public Integer getWorksWorkOrderId() {
        return worksWorkOrderId;
    }

    public void setWorksWorkOrderId(Works worksWorkOrderId) {
        this.worksWorkOrderId = worksWorkOrderId.getWorkOrderId();
    }

    public String getWorkTitle() {
        return workTitle;
    }

    public void setWorkTitle(Works workTitle) {
        this.workTitle = workTitle.getTitle();
    }

    public double getWorkUnitPrice() {
        return workUnitPrice;
    }

    public void setWorkUnitPrice(Works workUnitPrice) {
        this.workUnitPrice = workUnitPrice.getUnitPrice();
    }

    public Integer getPaymentsOptionsPaymentOptionId() {
        return paymentsOptionsPaymentOptionId;
    }

    public void setPaymentsOptionsPaymentOptionId(PaymentsOptions paymentsOptionsPaymentOptionId) {
        this.paymentsOptionsPaymentOptionId = paymentsOptionsPaymentOptionId.getPaymentOptionId();
    }

    public String getCash() {
        return cash;
    }

    public void setCash(PaymentsOptions cash) {
        this.cash = cash.getCash();
    }

    public String getCashless() {
        return cashless;
    }

    public void setCashless(PaymentsOptions cashless) {
        this.cashless = cashless.getCashless();
    }

    public String getAutoPartName() {
        return autoPartName;
    }

    public void setAutoPartName(AutoParts autoPartName) {
        this.autoPartName = autoPartName.getAutoPartName();
    }

    public String getCatalogueNumber() {
        return catalogueNumber;
    }

    public void setCatalogueNumber(AutoParts catalogueNumber) {
        this.catalogueNumber = catalogueNumber.getCatalogueNumber();
    }

    public double getUnitRetailPrice() {
        return unitRetailPrice;
    }

    public void setUnitRetailPrice(AutoParts unitRetailPrice) {
        this.unitRetailPrice = unitRetailPrice.getUnitRetailPrice();
    }
}
