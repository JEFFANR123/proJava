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
public class Catalogo {
    private int idCatalogo;
    private String nombre;
    private int idDetalle;
    private String fechaLanzamientoCatalogo;
    private int idOferta;

    public Catalogo() {
    }

    public Catalogo(int idCatalogo, String nombre, int idDetalle, String fechaLanzamientoCatalogo, int idOferta) {
        this.idCatalogo = idCatalogo;
        this.nombre = nombre;
        this.idDetalle = idDetalle;
        this.fechaLanzamientoCatalogo = fechaLanzamientoCatalogo;
        this.idOferta = idOferta;
    }

    public int getIdCatalogo() {
        return idCatalogo;
    }

    public void setIdCatalogo(int idCatalogo) {
        this.idCatalogo = idCatalogo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getFechaLanzamientoCatalogo() {
        return fechaLanzamientoCatalogo;
    }

    public void setFechaLanzamientoCatalogo(String fechaLanzamientoCatalogo) {
        this.fechaLanzamientoCatalogo = fechaLanzamientoCatalogo;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    @Override
    public String toString() {
        return "Catalogo{" + "idCatalogo=" + idCatalogo + ", nombre=" + nombre + ", idDetalle=" + idDetalle + ", fechaLanzamientoCatalogo=" + fechaLanzamientoCatalogo + ", idOferta=" + idOferta + '}';
    }
    
}
