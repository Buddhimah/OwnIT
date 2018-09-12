package com.ownit.Transaction;

/**
 * Created by Buddhima on 8/18/2018.
 */
import com.ownit.Seller.Seller;
import com.ownit.Customer.Customer;
import com.ownit.Carrier.Carrier;

import javax.persistence.*;

@Entity
@Table(name = "transaction", schema = "ownit", catalog = "")
public class Transaction {

    private int id;
    private String customer;
    private String carrier;
    private String seller;
    private String TransactionID;
    private int active;

    @Basic
    @Column(name = "Customer")
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    @Basic
    @Column(name = "Carrier")
    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Basic
    @Column(name = "Active")
    public int isActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }
    @Basic
    @Column(name = "Seller")
    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
    @Basic
    @Column(name = "TransactionID")
    public String getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(String transactionID) {
        TransactionID = transactionID;
    }
}
