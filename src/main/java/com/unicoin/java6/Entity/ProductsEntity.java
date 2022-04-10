package com.unicoin.java6.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "products", schema = "quanlot", catalog = "")
public class ProductsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "quanlot_id")
    private int quanlotId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "quantity")
    private int quantity;
    @Basic
    @Column(name = "color_id")
    private int colorId;
    @Basic
    @Column(name = "category_id")
    private int categoryId;
    @Basic
    @Column(name = "price")
    private double price;
    @Basic
    @Column(name = "size")
    private int size;
    @Basic
    @Column(name = "avatar")
    private String avatar;

    public int getQuanlotId() {
        return quanlotId;
    }

    public void setQuanlotId(int quanlotId) {
        this.quanlotId = quanlotId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductsEntity that = (ProductsEntity) o;
        return quanlotId == that.quanlotId && quantity == that.quantity && colorId == that.colorId && categoryId == that.categoryId && Double.compare(that.price, price) == 0 && size == that.size && Objects.equals(name, that.name) && Objects.equals(avatar, that.avatar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quanlotId, name, quantity, colorId, categoryId, price, size, avatar);
    }
}
