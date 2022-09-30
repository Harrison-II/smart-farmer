package com.Final.Year.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "farmers")
public class FarmerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @OneToOne(targetEntity = UserModel.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private UserModel user;

    @OneToMany
    private List<PostModel> posts;

    @ManyToOne(targetEntity = ProductCategoryModel.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private ProductCategoryModel speciality;

    public FarmerModel(long id, UserModel user, List<PostModel> posts, ProductCategoryModel speciality) {
        this.id = id;
        this.user = user;
        this.posts = posts;
        this.speciality = speciality;
    }

    public FarmerModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public List<PostModel> getPosts() {
        return posts;
    }

    public void setPosts(List<PostModel> posts) {
        this.posts = posts;
    }

    public ProductCategoryModel getSpeciality() {
        return speciality;
    }

    public void setSpeciality(ProductCategoryModel speciality) {
        this.speciality = speciality;
    }
}
