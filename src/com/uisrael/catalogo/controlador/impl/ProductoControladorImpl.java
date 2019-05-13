/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.controlador.impl;

import com.uisrael.catalogo.controlador.IProductoControlador;
import com.uisrael.catalogo.modelo.dao.IProductoDao;
import com.uisrael.catalogo.modelo.dao.impl.ProductoDaoImpl;
import com.uisrael.catalogo.modelo.entidades.Producto;
import java.util.List;

/**
 *
 * @author janrango
 */
public class ProductoControladorImpl implements IProductoControlador {

    @Override
    public void insertarProductoCtrl(Producto nuevoProducto) {
    IProductoDao productoDao = new ProductoDaoImpl();
    productoDao.insertarProductoMD(nuevoProducto);


    }

    @Override
    public List<Producto> listarProductoCtrl() {
        IProductoDao productoDao = new ProductoDaoImpl();
        return productoDao.listarProductoMD();

    }
    
}
