package com.finalproject.Fantastic.Footwear.model;

import javax.persistence.*;
import java.net.URL;


@Entity
@Table(name = "Shoes")
public class Shoes {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Shoe_Name")
    private String shoeName;

    @Column(name = "Brand")
    private String brandName;

    @Column(name = "Size")
    private Double size;

    @Column(name = "Price")
    private Double price;

    private URL image ;





    public Shoes() {

    }

    public Shoes(String shoeName, String brandName, Double size, Double price, URL image) {
        this.shoeName = shoeName;
        this.brandName = brandName;
        this.size = size;
        this.price = price;


        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShoeName() {
        return shoeName;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public URL getImage() {
        return image;
    }

    public void setImage(URL image) {
        this.image = image;
    }
}
