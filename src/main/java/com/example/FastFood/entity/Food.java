package com.example.FastFood.entity;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Set;

@Entity(name = "Food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String image;

    private String time_ship;
    private int price;
    @ManyToOne
    @JoinColumn(name = "cate_id")
    private Category category;
    @OneToMany(mappedBy = "food")
    private  Set<OrderItem> listOrderItem;

    public Set<OrderItem> getListOrderItem() {
        return listOrderItem;
    }

    public void setListOrderItem(Set<OrderItem> listOrderItem) {
        this.listOrderItem = listOrderItem;
    }

    @OneToMany(mappedBy = "food")
    private Set<RatingFood> listRating;

    public Set<RatingFood> getListRating() {
        return listRating;
    }

    public void setListRating(Set<RatingFood> listRating) {
        this.listRating = listRating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTime_ship() {
        return time_ship;
    }

    public void setTime_ship(String time_ship) {
        this.time_ship = time_ship;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
