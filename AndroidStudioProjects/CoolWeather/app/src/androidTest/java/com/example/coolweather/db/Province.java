package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by sf on 17/3/22.
 */
public class Province extends DataSupport {

    private int id;
    private String provieceName;
    private int proviceCode;


    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvieceName() {
        return provieceName;
    }

    public void setProvieceName(String provieceName) {
        this.provieceName = provieceName;
    }

    public int getProviceCode() {
        return proviceCode;
    }

    public void setProviceCode(int proviceCode) {
        this.proviceCode = proviceCode;
    }
}
