package com.example.nestedrecyclerview.Models;

public class HorizontalModel {

    String name, description;

    public HorizontalModel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public HorizontalModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
