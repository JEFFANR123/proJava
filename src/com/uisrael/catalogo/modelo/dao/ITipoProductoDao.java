/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.modelo.dao;

import com.uisrael.catalogo.modelo.entidades.TipoProducto;
import java.util.List;

/**
 *
 * @author janrango
 */
public interface ITipoProductoDao {
    
    public void insertarTipoProductoMD(TipoProducto nuevoTipoProducto);
    public List<TipoProducto> listarTipoProducto();
    
}
