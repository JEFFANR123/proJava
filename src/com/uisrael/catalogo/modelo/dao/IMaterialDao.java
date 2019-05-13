/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.catalogo.modelo.dao;

import com.uisrael.catalogo.modelo.entidades.Material;
import java.util.List;

/**
 *
 * @author janrango
 */
public interface IMaterialDao {
    
    public void insertarMaterialMD(Material nuevoMaterial);
    
    public List<Material> listarMaterial();
    
    
}
