package com.gunar.webservice.data;

import com.google.gson.annotations.SerializedName;

public class Producto {

    @SerializedName("cod")
    private String cod;
    @SerializedName("des")
    private String des;
    @SerializedName("uni")
    private String uni;
    @SerializedName("lin")
    private Object lin;
    @SerializedName("uem")
    private String uem;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public Object getLin() {
        return lin;
    }

    public void setLin(Object lin) {
        this.lin = lin;
    }

    public String getUem() {
        return uem;
    }

    public void setUem(String uem) {
        this.uem = uem;
    }

}