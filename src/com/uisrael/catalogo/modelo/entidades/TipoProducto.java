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
public class TipoProducto {
    private int idTipoProducto;
    private String nombre;
    private String color;

    public TipoProducto() {
    }

    public TipoProducto(int idTipoProducto, String nombre, String color) {
        this.idTipoProducto = idTipoProducto;
        this.nombre = nombre;
        this.color = color;
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TipoProducto{" + "idTipoProducto=" + idTipoProducto + ", nombre=" + nombre + ", color=" + color + '}';
    }
    
    
}
