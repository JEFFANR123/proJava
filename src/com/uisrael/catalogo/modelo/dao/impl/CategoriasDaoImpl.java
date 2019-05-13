/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.modelo.dao.impl;

import com.uisrael.catalogo.modelo.dao.ICategoriasDao;
import com.uisrael.catalogo.modelo.entidades.Categorias;
import java.util.List;

/**
 *
 * @author janrango
 */
public class CategoriasDaoImpl implements ICategoriasDao {

    @Override
    public void InsertarCatergoriaMD(Categorias nuevaCategoria) {
        System.out.println("Categorias InsertarCategorias se obtiene desde MD" + nuevaCategoria);
    }

    @Override
    public List<Categorias> listarCategoriasMD() {
        System.out.println("Categorias Retorno de un listado de MD ");
        return null;
    }
    
}
