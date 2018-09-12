package com.ownit.Advertisement;

/**
 * Created by Buddhima on 8/18/2018.
 */
import com.ownit.Seller.Seller;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name = "advertisement", schema = "ownit", catalog = "")
public class Advertisement {
    private int id;
    private String adid;
    private String itemname;
    private String seller;
    private String price;

    private int quantityavailable;

    @Basic
    @Column(name="itemname")
    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }


    @Basic
    @Column(name="price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    @Basic
    @Column(name="quantity")
    public int getQuantityavailable() {
        return quantityavailable;
    }

    public void setQuantityavailable(int quantityavailable) {
        this.quantityavailable = quantityavailable;
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
    @Column(name="seller")
    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
    @Basic
    @Column(name="adid")
    public String getAdid() {
        return adid;
    }

    public void setAdid(String adid) {
        this.adid = adid;
    }
}
