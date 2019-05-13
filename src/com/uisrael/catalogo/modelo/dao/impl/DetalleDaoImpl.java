/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.modelo.dao.impl;

import com.uisrael.catalogo.modelo.dao.IDetalleDao;
import com.uisrael.catalogo.modelo.entidades.Detalle;
import java.util.List;

/**
 *
 * @author janrango
 */
public class DetalleDaoImpl implements IDetalleDao{

    @Override
    public void insertarDetalleDao(Detalle nuevoDetalleDao) {
        System.out.println("Detalle insertarDetalleDao- nuevo detalle" + nuevoDetalleDao);
    }

    @Override
    public List<Detalle> listarDetalle() {
        System.out.println("Detalle - listar");
        return null;
    }
    
}
