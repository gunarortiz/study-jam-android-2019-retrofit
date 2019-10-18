package com.gunar.webservice.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Base {

    @SerializedName("productos")
    private List<Producto> productos = null;
    @SerializedName("success")
    private Integer success;

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

}