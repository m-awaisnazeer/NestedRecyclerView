package com.example.nestedrecyclerview.Models;

import java.util.ArrayList;

public class VerticalModel {

    ArrayList<HorizontalModel> modelArrayList;
    String Category;

    public VerticalModel(ArrayList<HorizontalModel> modelArrayList, String category) {
        this.modelArrayList = modelArrayList;
        Category = category;
    }

    public VerticalModel() {
    }

    public ArrayList<HorizontalModel> getModelArrayList() {
        return modelArrayList;
    }

    public void setModelArrayList(ArrayList<HorizontalModel> modelArrayList) {
        this.modelArrayList = modelArrayList;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
