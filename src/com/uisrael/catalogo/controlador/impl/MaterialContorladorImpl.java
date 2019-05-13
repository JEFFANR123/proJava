/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.controlador.impl;

import com.uisrael.catalogo.controlador.IMaterialControlador;
import com.uisrael.catalogo.modelo.dao.IMaterialDao;
import com.uisrael.catalogo.modelo.dao.impl.MaterialDaoImpl;
import com.uisrael.catalogo.modelo.entidades.Material;
import java.util.List;

/**
 *
 * @author janrango
 */
public class MaterialContorladorImpl implements IMaterialControlador{

    @Override
    public void insertarMaterialCtrl(Material nuevoMaterial) {
      IMaterialDao materialDao = new MaterialDaoImpl();
      materialDao.insertarMaterialMD(nuevoMaterial);
    }

    @Override
    public List<Material> listarMaterial() {
        IMaterialDao materialDao = new MaterialDaoImpl();
        return materialDao.listarMaterial();
        
    }
    
}
