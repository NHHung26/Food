package com.example.FastFood.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity(name = "Catgory")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name_cate")
    private String name_cate;
    @Column(name = "create_date")
    private Date create_date;

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
        return name_cate;
    }

    public void setCategory_name(String category_name) {
        this.name_cate = name_cate;
    }

    public Date getCategory_date() {
        return create_date;
    }

    public void setCategory_date(Date category_date) {
        this.create_date = create_date;
    }
}
