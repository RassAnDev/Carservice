package org.carservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Create the Domain Model Class(org.carservice.ActsExecutedWorks) to map with the "acts_executed_works" table in the database.
 */

@Entity
public class ActsExecutedWorks {
    private Integer actExecutedWorkId;
    private Integer organizationExecutorId;
    private Integer clientId;
    private Integer workOrderId;

    public ActsExecutedWorks() {
    }

    public ActsExecutedWorks(Integer actExecutedWorkId, Integer organizationExecutorId,
                             Integer clientId, Integer workOrderId) {
        this.actExecutedWorkId = actExecutedWorkId;
        this.organizationExecutorId = organizationExecutorId;
        this.clientId = clientId;
        this.workOrderId = workOrderId;
    }

    public void setActExecutedWorkId(Integer actExecutedWorkId) {
        this.actExecutedWorkId = actExecutedWorkId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getActExecutedWorkId() {
        return actExecutedWorkId;
    }

    public void setOrganizationExecutorId(Integer organizationExecutorId) {
        this.organizationExecutorId = organizationExecutorId;
    }

    public Integer getOrganizationExecutorId() {
        return organizationExecutorId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setWorkOrderId(Integer workOrderId) {
        this.workOrderId = workOrderId;
    }

    public Integer getWorkOrderId() {
        return workOrderId;
    }
}
