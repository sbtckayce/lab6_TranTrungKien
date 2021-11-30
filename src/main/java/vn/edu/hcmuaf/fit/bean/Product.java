package vn.edu.hcmuaf.fit.bean;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String name;
    private String decription;
    private String oldPrice;
    private String newPrice;
    private int quantity;
    private String img;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }


    public Product(String id, String name, String decription, String oldPrice, String newPrice, int quantity, String img) {
        this.id = id;
        this.name = name;
        this.decription = decription;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
        this.quantity = quantity;
        this.img = img;
    }
    public Product(){

    }
    @Override
    public String toString() {
        return id + "," + name + "," + decription + "," + oldPrice + "," + newPrice + "," + quantity + "," + img;

    }
}
