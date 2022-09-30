package com.Final.Year.models;

import javax.persistence.*;

@Entity
@Table(name = "product_categories")
public class ProductCategoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(nullable = false)
    private String category;

    @ManyToOne
    @JoinColumn(nullable = false)
    private ProductTypeModel productType;

    public ProductCategoryModel(long id, String category, ProductTypeModel productType) {
        this.id = id;
        this.category = category;
        this.productType = productType;
    }

    public ProductCategoryModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ProductTypeModel getProductType() {
        return productType;
    }

    public void setProductType(ProductTypeModel productType) {
        this.productType = productType;
    }
}
