package com.Final.Year.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "buyer_types")
public class BuyerTypeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(nullable = false)
    private String type;

//    @OneToMany
//    private List<BuyerModel> buyers;

    public BuyerTypeModel(long id, String type) {
        this.id = id;
        this.type = type;
//        this.buyers = buyers;
    }

    public BuyerTypeModel() {
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

//    public List<BuyerModel> getBuyers() {
//        return buyers;
//    }
//
//    public void setBuyers(List<BuyerModel> buyers) {
//        this.buyers = buyers;
//    }
}
