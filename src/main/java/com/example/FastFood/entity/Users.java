package com.example.FastFood.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "Users")
public class Users {
    @Id
    private int id;
    @Column(name = "user_name")
    private String user_name;
    @Column(name = "password")
    private String password;
    @Column(name = "fullname")
    private String fullname;
    @Column(name = "create_date")
    private Date create_date;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Roles roles;
    @OneToMany(mappedBy = "users")
    private Set<RatingFood> listRatingFood;
    @OneToMany(mappedBy = "users")
    private Set<RatingRestaurant> listRatingRestaurant;
    @OneToMany(mappedBy = "users")
    private Set<Orders> listOrders;

    public Set<Orders> getListOrders() {
        return listOrders;
    }

    public void setListOrders(Set<Orders> listOrders) {
        this.listOrders = listOrders;
    }

    public Set<RatingFood> getListRatingFood() {
        return listRatingFood;
    }

    public void setListRatingFood(Set<RatingFood> listRatingFood) {
        this.listRatingFood = listRatingFood;
    }

    public Set<RatingRestaurant> getListRatingRestaurant() {
        return listRatingRestaurant;
    }

    public void setListRatingRestaurant(Set<RatingRestaurant> listRatingRestaurant) {
        this.listRatingRestaurant = listRatingRestaurant;
    }

    public Set<RatingFood> getListRating() {
        return listRatingFood;
    }

    public void setListRating(Set<RatingFood> listRating) {
        this.listRatingFood = listRatingFood;
    }

    public int getId() {
        return id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public String getFullname() {
        return fullname;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}
