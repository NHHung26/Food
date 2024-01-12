package com.example.FastFood.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "Roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "role_name")
    private String role_name;
    @Column(name = "create_date")
    private Date create_date;
    @OneToMany(mappedBy = "roles")
    private Set<Users> listUsers;

    public Set<Users> getListUsers() {
        return listUsers;
    }

    public void setListUsers(Set<Users> listUsers) {
        this.listUsers = listUsers;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public int getId() {
        return id;
    }

    public String getRole_name() {
        return role_name;
    }

    public Date getCreate_date() {
        return create_date;
    }
}
