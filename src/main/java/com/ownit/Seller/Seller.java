package com.ownit.Seller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;

/**
 * Created by Buddhima on 8/18/2018.
 */
@Entity
@Table(name = "seller", schema = "ownit", catalog = "")
public class Seller {
    private String SellerID;
    private int id;
    private String name;
    private String address;
    private String alert;
    private int rating;
    private String telephone;
    private String advertisements;


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
    @Column(name="rating")
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
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
    @Column(name="advertisements")
    public String getAdvertisements() {
        return advertisements;
    }

    public void setAdvertisements(String advertisements) {
        this.advertisements = advertisements;
    }

    @Basic
    @Column(name="SellerID")
    public String getSellerID() {
        return SellerID;
    }

    public void setSellerID(String sellerID) {
        SellerID = sellerID;
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
    @Column(name="alert")
    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }
}
