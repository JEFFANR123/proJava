/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.controlador;

import com.uisrael.catalogo.modelo.entidades.Producto;
import java.util.List;

/**
 *
 * @author janrango
 */
public interface IProductoControlador {
    public void insertarProductoCtrl(Producto nuevoProducto);
    public List<Producto> listarProductoCtrl();
    
    
}
