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
public class Precio {
    
    private int idprecio;
    private String precioInicial;
    private String iva;
    private String precioFinal;

    public Precio() {
    }

    public Precio(int idprecio, String precioInicial, String iva, String precioFinal) {
        this.idprecio = idprecio;
        this.precioInicial = precioInicial;
        this.iva = iva;
        this.precioFinal = precioFinal;
    }

    public int getIdprecio() {
        return idprecio;
    }

    public void setIdprecio(int idprecio) {
        this.idprecio = idprecio;
    }

    public String getPrecioInicial() {
        return precioInicial;
    }

    public void setPrecioInicial(String precioInicial) {
        this.precioInicial = precioInicial;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(String precioFinal) {
        this.precioFinal = precioFinal;
    }

    @Override
    public String toString() {
        return "Precio{" + "idprecio=" + idprecio + ", precioInicial=" + precioInicial + ", iva=" + iva + ", precioFinal=" + precioFinal + '}';
    }
    
    
    
}
