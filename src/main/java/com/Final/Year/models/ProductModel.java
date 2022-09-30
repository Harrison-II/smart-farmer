package com.Final.Year.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(nullable = false)
    private ProductCategoryModel productCategory;

    @ManyToOne
    @JoinColumn(nullable = false)
    private FarmerModel farmer;

    @OneToMany(cascade = CascadeType.ALL)
    private List<PostModel> posts;

    public ProductModel(long id, String name, ProductCategoryModel productCategory, FarmerModel farmer, List<PostModel> posts) {
        this.id = id;
        this.name = name;
        this.productCategory = productCategory;
        this.farmer = farmer;
        this.posts = posts;
    }

    public ProductModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategoryModel getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategoryModel productCategory) {
        this.productCategory = productCategory;
    }

    public FarmerModel getFarmer() {
        return farmer;
    }

    public void setFarmer(FarmerModel farmer) {
        this.farmer = farmer;
    }

    public List<PostModel> getPosts() {
        return posts;
    }

    public void setPosts(List<PostModel> posts) {
        this.posts = posts;
    }
}
