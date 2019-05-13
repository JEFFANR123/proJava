/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.modelo.dao.impl;

import com.uisrael.catalogo.modelo.dao.IOfertaDao;
import com.uisrael.catalogo.modelo.entidades.Oferta;
import java.util.List;

/**
 *
 * @author janrango
 */
public class OfertaDaoImpl implements IOfertaDao{

    @Override
    public void insertarOferta(Oferta nuevaOferta) {
        System.out.println("Oferta Dao ingresando nueva Oferta"+ nuevaOferta);
    }

    @Override
    public List<Oferta> listarOferta() {
        System.out.println("Oferta Listar Oferta");
        return null;
    }
    
}
