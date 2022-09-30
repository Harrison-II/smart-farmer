package com.Final.Year.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column(nullable = false)
    private String role;

//    @OneToMany(targetEntity = UserModel.class, fetch = FetchType.LAZY)
//    private List<UserModel> users;

    public Role(long id, String role) {
        this.id = id;
        this.role = role;
//        this.users = users;
    }

    public Role() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

//    public List<UserModel> getUsers() {
//        return users;
//    }
//
//    public void setUsers(List<UserModel> users) {
//        this.users = users;
//    }
}
