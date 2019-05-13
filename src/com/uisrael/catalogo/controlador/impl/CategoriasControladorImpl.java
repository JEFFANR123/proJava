/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.controlador.impl;

import com.uisrael.catalogo.controlador.ICategoriasControlador;
import com.uisrael.catalogo.modelo.dao.ICategoriasDao;
import com.uisrael.catalogo.modelo.dao.impl.CategoriasDaoImpl;
import com.uisrael.catalogo.modelo.entidades.Categorias;
import java.util.List;

/**
 *
 * @author janrango
 */
public class CategoriasControladorImpl implements ICategoriasControlador{

    @Override
    public void insertarCategoriasCrtl(Categorias nuevaCategoria) {
        ICategoriasDao categoriaDao = new CategoriasDaoImpl();
        categoriaDao.InsertarCatergoriaMD(nuevaCategoria);
    }

    @Override
    public List<Categorias> listarCategoriasCrtl() {
        ICategoriasDao categoriasDao = new CategoriasDaoImpl();
        return categoriasDao.listarCategoriasMD();
    }
    
}
