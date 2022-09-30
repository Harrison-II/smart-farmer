package com.Final.Year.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clusters")
public class ClusterModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private String name;

    @Column
    private double centroid_x;

    @Column
    private double centroid_y;

//    @ManyToMany
//    private List<BuyerModel> buyers;

    public ClusterModel(long id, String name, double centroid_x, double centroid_y) {
        this.id = id;
        this.name = name;
        this.centroid_x = centroid_x;
        this.centroid_y = centroid_y;
//        this.buyers = buyers;
    }

    public ClusterModel() {
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

    public double getCentroid_x() {
        return centroid_x;
    }

    public void setCentroid_x(double centroid_x) {
        this.centroid_x = centroid_x;
    }

    public double getCentroid_y() {
        return centroid_y;
    }

    public void setCentroid_y(double centroid_y) {
        this.centroid_y = centroid_y;
    }

//    public List<BuyerModel> getBuyers() {
//        return buyers;
//    }
//
//    public void setBuyers(List<BuyerModel> buyers) {
//        this.buyers = buyers;
//    }
}
