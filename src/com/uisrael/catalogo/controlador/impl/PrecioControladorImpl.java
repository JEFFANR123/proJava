/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.controlador.impl;

import com.uisrael.catalogo.controlador.IPrecioControlador;
import com.uisrael.catalogo.modelo.dao.IPrecioDao;
import com.uisrael.catalogo.modelo.dao.impl.PrecioDaoImpl;
import com.uisrael.catalogo.modelo.entidades.Precio;
import java.util.List;

/**
 *
 * @author janrango
 */
public class PrecioControladorImpl implements IPrecioControlador{

    @Override
    public void insertarPrecioCtrl(Precio nuevoPrecioCtrl) {
        IPrecioDao preciodao = new PrecioDaoImpl();
        preciodao.insertarPrecioDao(nuevoPrecioCtrl);
    }

    @Override
    public List<Precio> listarPrecioCtrl() {
    IPrecioDao preciodao = new PrecioDaoImpl();
    return preciodao.listadoPrecio();
    }
    
}
