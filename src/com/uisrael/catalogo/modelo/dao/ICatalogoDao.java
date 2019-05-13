/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.modelo.dao;

import com.uisrael.catalogo.modelo.entidades.Catalogo;
import java.util.List;

/**
 *
 * @author janrango
 */
public interface ICatalogoDao {
    public void insertarCatalogoDao(Catalogo nuevoCatalogo);
    public List<Catalogo> listarCatalogo();
    
}
