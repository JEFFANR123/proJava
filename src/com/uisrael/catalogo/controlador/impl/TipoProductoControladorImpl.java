/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.controlador.impl;

import com.uisrael.catalogo.controlador.ITipoProductoControlador;
import com.uisrael.catalogo.modelo.dao.ITipoProductoDao;
import com.uisrael.catalogo.modelo.dao.impl.TipoProductoDaoImpl;
import com.uisrael.catalogo.modelo.entidades.TipoProducto;
import java.util.List;

/**
 *
 * @author janrango
 */
public class TipoProductoControladorImpl implements ITipoProductoControlador {

    @Override
    public void insertarTipoProductoCtrl(TipoProducto nuevoTipoProducto) {
        ITipoProductoDao tipoProductoControlador = new TipoProductoDaoImpl();
        tipoProductoControlador.insertarTipoProductoMD(nuevoTipoProducto);
    }

    @Override
    public List<TipoProducto> listarTipoProductoCtrl() {
        ITipoProductoControlador listarTipoProductoControlador = new TipoProductoControladorImpl();
        return listarTipoProductoControlador.listarTipoProductoCtrl();
        
    }
    
}
