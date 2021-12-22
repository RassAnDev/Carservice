package org.carservice.payments;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Create the Domain Model Class(org.carservice.payments.PaymentsOptions) to map with the "payments_options" table in the database.
 */

@Entity
public class PaymentsOptions {
    private Integer paymentOptionId;
    private String cash;
    private String cashless;

    public PaymentsOptions() {
    }

    public PaymentsOptions(Integer paymentOptionId, String cash, String cashless) {
        this.paymentOptionId = paymentOptionId;
        this.cash = cash;
        this.cashless = cashless;
    }

    public void setPaymentOptionId(Integer paymentOptionId) {
        this.paymentOptionId = paymentOptionId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getPaymentOptionId() {
        return paymentOptionId;
    }

    public void setCash(String cash) {
        this.cash = cash;
    }

    public String getCash() {
        return cash;
    }

    public void setCashless(String cashless) {
        this.cashless = cashless;
    }

    public String getCashless() {
        return cashless;
    }
}
