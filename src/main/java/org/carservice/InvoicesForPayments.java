package org.carservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Create the Domain Model Class(org.carservice.InvoicesForPayments) to map with the "invoices_for_payments" table in the database.
 */

@Entity
public class InvoicesForPayments {
    private Integer invoiceForPaymentId;
    private Integer actExecutedWorkId;

    public InvoicesForPayments() {
    }

    public InvoicesForPayments(Integer invoiceForPaymentId, Integer actExecutedWorkId) {
        this.invoiceForPaymentId = invoiceForPaymentId;
        this.actExecutedWorkId = actExecutedWorkId;
    }

    public void setInvoiceForPaymentId(Integer invoiceForPaymentId) {
        this.invoiceForPaymentId = invoiceForPaymentId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getInvoiceForPaymentId() {
        return invoiceForPaymentId;
    }

    public void setActExecutedWorkId(Integer actExecutedWorkId) {
        this.actExecutedWorkId = actExecutedWorkId;
    }

    public Integer getActExecutedWorkId() {
        return actExecutedWorkId;
    }
}
