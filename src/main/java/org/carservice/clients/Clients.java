package org.carservice.clients;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Create the Domain Model Class(org.carservice.clients.Clients) to map with the "clients" table in the database.
 */

@Entity
public class Clients {
    private Integer clientId;
    private Integer clientIndividualId;
    private Integer clientOrganizationId;

    public Clients() {
    }

    public Clients(Integer clientId, Integer clientIndividualId, Integer clientOrganizationId) {
        this.clientId = clientId;
        this.clientIndividualId = clientIndividualId;
        this.clientOrganizationId = clientOrganizationId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getClientId() {
        return clientId;
    }

    public void setClientIndividualId(Integer clientIndividualId) {
        this.clientIndividualId = clientIndividualId;
    }

    public Integer getClientIndividualId() {
        return clientIndividualId;
    }

    public void setClientOrganizationId(Integer clientOrganizationId) {
        this.clientOrganizationId = clientOrganizationId;
    }

    public Integer getClientOrganizationId() {
        return clientOrganizationId;
    }
}
