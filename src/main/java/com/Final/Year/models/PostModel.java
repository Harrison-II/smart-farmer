package com.Final.Year.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
public class PostModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private ProductModel product;

    @Column(nullable = false)
    private Float price;

    @Column(nullable = false)
    private String location;

    @ManyToOne
    @JoinColumn(nullable = false)
    private FarmerModel farmer;

    @Column(nullable = false, updatable = false)
    private Date createdAt;

    public PostModel(long id, String title, String description, ProductModel product, Float price, String location, FarmerModel farmer, Date createdAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.product = product;
        this.price = price;
        this.location = location;
        this.farmer = farmer;
        this.createdAt = createdAt;
    }

    public PostModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public FarmerModel getFarmer() {
        return farmer;
    }

    public void setFarmer(FarmerModel farmer) {
        this.farmer = farmer;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
