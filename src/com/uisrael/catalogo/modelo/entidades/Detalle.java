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
public class Detalle {
    
    private int idDetalle;
    private String nombre;
    private String resumen;

    public Detalle() {
    }

    public Detalle(int idDetalle, String nombre, String resumen) {
        this.idDetalle = idDetalle;
        this.nombre = nombre;
        this.resumen = resumen;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    @Override
    public String toString() {
        return "Detalle{" + "idDetalle=" + idDetalle + ", nombre=" + nombre + ", resumen=" + resumen + '}';
    }
    
    
    
}
