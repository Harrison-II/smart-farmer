package com.Final.Year.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "buyers")
public class BuyerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @ManyToOne
    @JoinColumn
    private BuyerTypeModel buyerType;

    @OneToOne(targetEntity = UserModel.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false)
    private UserModel user;

    @ManyToMany
    @JoinTable(name = "buyer_clusters", joinColumns = {@JoinColumn(nullable = false)}, inverseJoinColumns = @JoinColumn(nullable = false))
    private List<ClusterModel> clusters;

    public BuyerModel(long id, BuyerTypeModel buyerType, UserModel user, List<ClusterModel> clusters) {
        this.id = id;
        this.buyerType = buyerType;
        this.user = user;
        this.clusters = clusters;
    }

    public BuyerModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BuyerTypeModel getBuyerType() {
        return buyerType;
    }

    public void setBuyerType(BuyerTypeModel buyerType) {
        this.buyerType = buyerType;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public List<ClusterModel> getClusters() {
        return clusters;
    }

    public void setClusters(List<ClusterModel> clusters) {
        this.clusters = clusters;
    }
}
