/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.controlador.impl;

import com.uisrael.catalogo.controlador.IOfertaControlador;
import com.uisrael.catalogo.modelo.dao.IOfertaDao;
import com.uisrael.catalogo.modelo.dao.impl.OfertaDaoImpl;
import com.uisrael.catalogo.modelo.entidades.Oferta;
import java.util.List;

/**
 *
 * @author janrango
 */
public class OfertaControladorImpl implements IOfertaControlador{

    @Override
    public void insertarOfertaCtrl(Oferta nuevaOferta) {
    IOfertaDao nuevaOfertaDao = new OfertaDaoImpl();
    nuevaOfertaDao.insertarOferta(nuevaOferta);
    }

    @Override
    public List<Oferta> listarOferta() {
   IOfertaDao nuevaOfertaDao = new OfertaDaoImpl();
   return nuevaOfertaDao.listarOferta();
   }
    
    
}
