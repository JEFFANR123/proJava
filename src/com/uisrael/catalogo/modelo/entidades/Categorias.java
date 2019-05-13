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
public class Categorias {

private int idCategorias;
private String nombre;
private String fechaLanzamiento;
private String resumen;

public Categorias(){
}
    
public Categorias (int idCategorias, String nombre, String fechaLanzamiento, String resumen){

this.idCategorias = idCategorias;
this.nombre = nombre;
this.fechaLanzamiento = fechaLanzamiento;
this.resumen = resumen;

}

public int getIdCategorias(){
	return idCategorias;
}

public void setIdCategorias(int idCategorias){
	this.idCategorias = idCategorias;

}

public String getNombre(){
	return nombre;
}

public void setNombre (String nombre){
	this.nombre = nombre;
}

public String getFechaLanzamiento(){
	return fechaLanzamiento;
}

public void setFechaLanzamiento(String fechaLanzamiento){
	this.fechaLanzamiento = fechaLanzamiento;
}

public String getResumen(){
	return resumen;
}

public void setResumen (String resumen){
this.resumen = resumen;   
}

    @Override
    public String toString() {
        return "Categorias{" + "idCategorias=" + idCategorias + ", nombre=" + nombre + ", fechaLanzamiento=" + fechaLanzamiento + ", resumen=" + resumen + '}';
    }


}
