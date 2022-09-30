package com.Final.Year.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "connections")
public class ConnectionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private FarmerModel farmer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private BuyerModel buyer;

    @Column(nullable = false, updatable = false)
    private Date createdAt;

    @Column(nullable = false)
    private String status;

    public ConnectionModel(long id, FarmerModel farmer, BuyerModel buyer, Date createdAt, String status) {
        this.id = id;
        this.farmer = farmer;
        this.buyer = buyer;
        this.createdAt = createdAt;
        this.status = status;
    }

    public ConnectionModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public FarmerModel getFarmer() {
        return farmer;
    }

    public void setFarmer(FarmerModel farmer) {
        this.farmer = farmer;
    }

    public BuyerModel getBuyer() {
        return buyer;
    }

    public void setBuyer(BuyerModel buyer) {
        this.buyer = buyer;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
