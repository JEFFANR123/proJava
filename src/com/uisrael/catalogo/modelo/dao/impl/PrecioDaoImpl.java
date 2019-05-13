/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.modelo.dao.impl;

import com.uisrael.catalogo.modelo.dao.IPrecioDao;
import com.uisrael.catalogo.modelo.entidades.Precio;
import java.util.List;

/**
 *
 * @author janrango
 */
public class PrecioDaoImpl implements IPrecioDao{

    @Override
    public void insertarPrecioDao(Precio nuevoPrecioDao) {
        System.out.println("Precio -  se inserta uno nuevo" + nuevoPrecioDao);
    }

    @Override
    public List<Precio> listadoPrecio() {
        System.out.println("Precio - se enlista el precio");
        return null;
    }
    
}
