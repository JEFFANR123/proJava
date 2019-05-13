/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.modelo.dao;

import com.uisrael.catalogo.modelo.entidades.Producto;
import java.util.List;

/**
 *
 * @author janrango
 */
public interface IProductoDao {
    
    public void insertarProductoMD(Producto nuevoProducto);
    public List<Producto> listarProductoMD();
}
