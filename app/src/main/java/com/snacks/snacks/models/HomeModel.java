package com.snacks.snacks.models;

import com.snacks.snacks.utils.SerializedName;

import java.io.Serializable;

public class HomeModel implements Serializable {

    @SerializedName("id")
    private Integer id;

    @SerializedName("name")
    private String name;

    @SerializedName("role")
    private Integer role;

    @SerializedName("available")
    private Integer available;


    public HomeModel(Integer id, String name, Integer role, Integer available){

        this.id = id;
        this.name = name;
        this.role = role;
        this.available = available;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getRole() {
        return role;
    }

    public Integer getAvailable() {
        return available;
    }
}
