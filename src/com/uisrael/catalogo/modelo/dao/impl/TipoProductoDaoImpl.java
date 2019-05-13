/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.modelo.dao.impl;

import com.uisrael.catalogo.modelo.dao.ITipoProductoDao;
import com.uisrael.catalogo.modelo.entidades.TipoProducto;
import java.util.List;

/**
 *
 * @author janrango
 */
public class TipoProductoDaoImpl implements ITipoProductoDao {

    @Override
    public void insertarTipoProductoMD(TipoProducto nuevoTipoProducto) {
        System.out.println("Tipo Producto Se llama a Insertar desde MD" + nuevoTipoProducto);

    }

    @Override
    public List<TipoProducto> listarTipoProducto() {
        System.out.println("Tipo Producto Se llama a listarTipoProducto MD");
        return null;
    }
    
}
