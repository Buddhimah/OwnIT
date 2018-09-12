package com.ownit.Carrier;

import javax.persistence.*;

/**
 * Created by Buddhima on 8/18/2018.
 */
@Entity
@Table(name = "carrier", schema = "ownit", catalog = "")
public class Carrier {
    private int id;
    private String carrierID;
    private String name;
    private String address;
    private String telephone;
    private String alert;
    private int status;
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

    public void setTelephone(String

                                     telephone) {
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
    @Column(name="careerID")
    public String getCarrierID() {
        return carrierID;
    }

    public void setCarrierID(String carrierID) {
        this.carrierID = carrierID;
    }
    @Basic
    @Column(name="status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
