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
public class Material {
    private int idMaterial;
    private String nombre;
    private String color;
    private String durabilidad;
    private String resistencia;

    public Material() {
    }

    public Material(int idMaterial, String nombre, String color, String durabilidad, String resistencia) {
        this.idMaterial = idMaterial;
        this.nombre = nombre;
        this.color = color;
        this.durabilidad = durabilidad;
        this.resistencia = resistencia;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
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

    public String getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(String durabilidad) {
        this.durabilidad = durabilidad;
    }

    public String getResistencia() {
        return resistencia;
    }

    public void setResistencia(String resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Material{" + "idMaterial=" + idMaterial + ", nombre=" + nombre + ", color=" + color + ", durabilidad=" + durabilidad + ", resistencia=" + resistencia + '}';
    }
    
        
}
