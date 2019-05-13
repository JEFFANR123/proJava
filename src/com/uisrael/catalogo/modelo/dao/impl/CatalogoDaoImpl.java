/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.modelo.dao.impl;

import com.uisrael.catalogo.modelo.dao.ICatalogoDao;
import com.uisrael.catalogo.modelo.entidades.Catalogo;
import java.util.List;

/**
 *
 * @author janrango
 */
public class CatalogoDaoImpl implements ICatalogoDao{

    @Override
    public void insertarCatalogoDao(Catalogo nuevoCatalogo) {
        System.out.println("Catalogo IDao agrega nuevo Catalogo"+ nuevoCatalogo);
    }

    @Override
    public List<Catalogo> listarCatalogo() {
        System.out.println("Catalogo IDao enlistar");
        return null;
    }
    
}
