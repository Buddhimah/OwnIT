package com.ownit.Customer;

import javax.persistence.*;

/**
 * Created by Buddhima on 8/18/2018.
 */
@Entity
@Table(name = "customer", schema = "ownit", catalog = "")
public class Customer {
    private int id;
    private String customerID;
    private String name;
    private String address;
    private String telephone;
    private int rating;

    @Basic
    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name="address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name="telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name="rating")
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Id
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Basic
    @Column(name="customerID")
    public String getCustomerID() {
        return customerID;
    }


    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
