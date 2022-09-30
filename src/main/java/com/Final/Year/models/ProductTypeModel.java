package com.Final.Year.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product_types")
public class ProductTypeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(nullable = false)
    private String type;

//    @OneToMany
//    private List<ProductCategoryModel> productCategories;

    public ProductTypeModel(long id, String type) {
        this.id = id;
        this.type = type;
//        this.productCategories = productCategories;
    }

    public ProductTypeModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public List<ProductCategoryModel> getProductCategories() {
//        return productCategories;
//    }
//
//    public void setProductCategories(List<ProductCategoryModel> productCategories) {
//        this.productCategories = productCategories;
//    }
}
