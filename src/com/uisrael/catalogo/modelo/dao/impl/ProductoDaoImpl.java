/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.modelo.dao.impl;

import com.uisrael.catalogo.modelo.dao.IProductoDao;
import com.uisrael.catalogo.modelo.entidades.Producto;
import java.util.List;

/**
 *
 * @author janrango
 */
public class ProductoDaoImpl implements IProductoDao{

    @Override
    public void insertarProductoMD(Producto nuevoProducto) {
        System.out.println("Producto MD Insertar Producto "+ nuevoProducto);
    }

    @Override
    public List<Producto> listarProductoMD() {
        System.out.println("Producto MD listar Productos");
        return null;
    }
    
}
