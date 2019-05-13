/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.modelo.entidades;

/**
 *
 * @author janrango
 */
public class Producto {
        private int idProducto;
        private String nombre;
        private String material;
        private String tipo_producto;
        private String categorias;
        private String precio;
        private String detalle;

    public Producto() {
    }

    public Producto(int idProducto, String nombre, String material, String tipo_producto, String categorias, String precio, String detalle) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.material = material;
        this.tipo_producto = tipo_producto;
        this.categorias = categorias;
        this.precio = precio;
        this.detalle = detalle;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public String getCategorias() {
        return categorias;
    }

    public void setCategorias(String categorias) {
        this.categorias = categorias;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", material=" + material + ", tipo_producto=" + tipo_producto + ", categorias=" + categorias + ", precio=" + precio + ", detalle=" + detalle + '}';
    }

}
