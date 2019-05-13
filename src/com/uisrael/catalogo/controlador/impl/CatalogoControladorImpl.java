/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.controlador.impl;

import com.uisrael.catalogo.controlador.ICatalogoControlador;
import com.uisrael.catalogo.modelo.dao.ICatalogoDao;
import com.uisrael.catalogo.modelo.dao.impl.CatalogoDaoImpl;
import com.uisrael.catalogo.modelo.entidades.Catalogo;
import java.util.List;

/**
 *
 * @author janrango
 */
public class CatalogoControladorImpl implements ICatalogoControlador{

    @Override
    public void insertarCatalogoCtrl(Catalogo nuevCatalogo) {
    ICatalogoDao nuevoCatalogo = new CatalogoDaoImpl();
    nuevoCatalogo.insertarCatalogoDao(nuevCatalogo);
    }

    @Override
    public List<Catalogo> listarCatalogoCtrl() {
    ICatalogoDao nuevoCatalogo = new CatalogoDaoImpl();
    return nuevoCatalogo.listarCatalogo();
   }
    
}
