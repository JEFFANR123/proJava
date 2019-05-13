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
public class Oferta {
    private int idOferta;
    private String nombre;
    private String fechainicial;
    private String fechaVencimiento;
    private String condicion;

    public Oferta() {
    }

    public Oferta(int idOferta, String nombre, String fechainicial, String fechaVencimiento, String condicion) {
        this.idOferta = idOferta;
        this.nombre = nombre;
        this.fechainicial = fechainicial;
        this.fechaVencimiento = fechaVencimiento;
        this.condicion = condicion;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechainicial() {
        return fechainicial;
    }

    public void setFechainicial(String fechainicial) {
        this.fechainicial = fechainicial;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    @Override
    public String toString() {
        return "Oferta{" + "idOferta=" + idOferta + ", nombre=" + nombre + ", fechainicial=" + fechainicial + ", fechaVencimiento=" + fechaVencimiento + ", condicion=" + condicion + '}';
    }
 
    
}
