/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.controlador.impl;

import com.uisrael.catalogo.controlador.IDetalleControlador;
import com.uisrael.catalogo.modelo.dao.IDetalleDao;
import com.uisrael.catalogo.modelo.dao.impl.DetalleDaoImpl;
import com.uisrael.catalogo.modelo.entidades.Detalle;
import java.util.List;

/**
 *
 * @author janrango
 */
public class DetalleControladorImpl implements IDetalleControlador {

    @Override
    public void insertarDetalleCtrl(Detalle nuevoDetalleCtrl) {
    IDetalleDao detalleDao = new DetalleDaoImpl();
    detalleDao.insertarDetalleDao(nuevoDetalleCtrl);
          
    }

    @Override
    public List<Detalle> listarDetalleCtrl() {
    IDetalleDao detalleDao = new DetalleDaoImpl();
    return detalleDao.listarDetalle();
    }
    
    
}
