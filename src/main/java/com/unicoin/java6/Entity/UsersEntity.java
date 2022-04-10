package com.unicoin.java6.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "quanlot", catalog = "")
public class UsersEntity {
    @Id
    @Column(name = "username")
    private String username;
    @Basic
    @Column(name = "fullname")
    private String fullname;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "status")
    private boolean status;
    @Basic
    @Column(name = "role")
    private int role;

    public String getUsername() {
        return username;
    }

    public void setUsername() {
        this.username = this.username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity users = (UsersEntity) o;
        return status == users.status && role == users.role && Objects.equals(username, users.username) && Objects.equals(fullname, users.fullname) && Objects.equals(password, users.password) && Objects.equals(email, users.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, fullname, password, email, status, role);
    }
}
