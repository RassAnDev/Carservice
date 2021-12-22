package org.carservice.clients;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Create the Domain Model Class(org.carservice.clients.ClientsIndividuals) to map with the "clients_individuals" table in the database.
 */

@Entity
public class ClientsIndividuals {
    private Integer clientIndividualId;
    private String surname;
    private String firstname;
    private String patronymic;
    private String mobile;

    public ClientsIndividuals() {
    }

    public ClientsIndividuals(Integer clientIndividualId, String surname, String firstname,
                              String patronymic, String mobile) {
        this.clientIndividualId = clientIndividualId;
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.mobile = mobile;
    }

    public void setClientIndividualId(Integer clientIndividualId) {
        this.clientIndividualId = clientIndividualId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getClientIndividualId() {
        return clientIndividualId;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }
}
