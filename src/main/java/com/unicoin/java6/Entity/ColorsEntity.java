package com.unicoin.java6.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "colors", schema = "quanlot", catalog = "")
public class ColorsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "color_id")
    private int colorId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "status")
    private boolean status;

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColorsEntity that = (ColorsEntity) o;
        return colorId == that.colorId && status == that.status && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(colorId, name, status);
    }
}
