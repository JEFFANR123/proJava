/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.modelo.dao.impl;

import com.uisrael.catalogo.modelo.dao.IMaterialDao;
import com.uisrael.catalogo.modelo.entidades.Material;
import java.util.List;


/**
 *
 * @author janrango
 */
public class MaterialDaoImpl implements IMaterialDao{

    @Override
    public void insertarMaterialMD(Material nuevoMaterial) {
        System.out.println("Material LLamada de nuevoMaterial desde MDI"+ nuevoMaterial);
    }

    @Override
    public List<Material> listarMaterial() {
        System.out.println("Material Se lista los datos desde DMI");
        return null;
    }
    
    
    
    
}
