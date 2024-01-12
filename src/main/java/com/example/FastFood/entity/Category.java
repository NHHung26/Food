package com.example.FastFood.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "Catgory")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "category_name")
    private String category_name;
    @Column(name = "category_date")
    private Date category_date;

    @OneToMany(mappedBy = "category")
    private Set<Food> listFood;
    @OneToMany(mappedBy = "category")
    private Set<MenuRestaurant> listMenuRestaurant;

    public Set<MenuRestaurant> getListMenuRestaurant() {
        return listMenuRestaurant;
    }

    public void setListMenuRestaurant(Set<MenuRestaurant> listMenuRestaurant) {
        this.listMenuRestaurant = listMenuRestaurant;
    }

    public Set<Food> getListFood() {
        return listFood;
    }

    public void setListFood(Set<Food> listFood) {
        this.listFood = listFood;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public Date getCategory_date() {
        return category_date;
    }

    public void setCategory_date(Date category_date) {
        this.category_date = category_date;
    }
}
