package com.example.FastFood.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "MenuRestaurant")
public class MenuRestaurant {
    @Id
    private int cate_id;
    @ManyToOne
    @JoinColumn(name = "cate_id")
    private Category category;
    @Id
    private int res_id;
    @ManyToOne
    @JoinColumn(name = "res_id")
    private Restaurant restaurant;
}
