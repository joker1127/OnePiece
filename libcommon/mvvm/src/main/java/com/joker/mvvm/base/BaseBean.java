package com.joker.mvvm.base;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;


public class BaseBean implements Serializable {


    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}



