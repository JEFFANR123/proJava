/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debersemana2;

import com.uisrael.catalogo.controlador.ICatalogoControlador;
import com.uisrael.catalogo.controlador.ICategoriasControlador;
import com.uisrael.catalogo.controlador.IDetalleControlador;
import com.uisrael.catalogo.controlador.IMaterialControlador;
import com.uisrael.catalogo.controlador.IOfertaControlador;
import com.uisrael.catalogo.controlador.IPrecioControlador;
import com.uisrael.catalogo.controlador.IProductoControlador;
import com.uisrael.catalogo.controlador.ITipoProductoControlador;
import com.uisrael.catalogo.controlador.impl.CatalogoControladorImpl;
import com.uisrael.catalogo.controlador.impl.CategoriasControladorImpl;
import com.uisrael.catalogo.controlador.impl.DetalleControladorImpl;
import com.uisrael.catalogo.controlador.impl.MaterialContorladorImpl;
import com.uisrael.catalogo.controlador.impl.OfertaControladorImpl;
import com.uisrael.catalogo.controlador.impl.PrecioControladorImpl;
import com.uisrael.catalogo.controlador.impl.ProductoControladorImpl;
import com.uisrael.catalogo.controlador.impl.TipoProductoControladorImpl;
import com.uisrael.catalogo.modelo.entidades.Catalogo;
import com.uisrael.catalogo.modelo.entidades.Categorias;
import com.uisrael.catalogo.modelo.entidades.Detalle;
import com.uisrael.catalogo.modelo.entidades.Material;
import com.uisrael.catalogo.modelo.entidades.Oferta;
import com.uisrael.catalogo.modelo.entidades.Precio;
import com.uisrael.catalogo.modelo.entidades.Producto;
import com.uisrael.catalogo.modelo.entidades.TipoProducto;

/**
 *
 * @author janrango
 */
public class DeberSemana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Producto nuevoProducto = new Producto();
       
       nuevoProducto.setIdProducto(1);
       nuevoProducto.setNombre("MueblesInterior");
       nuevoProducto.setMaterial("Madera");
       nuevoProducto.setTipo_producto("Repiza");
       nuevoProducto.setCategorias("Cocina");
       nuevoProducto.setPrecio("100");
       nuevoProducto.setDetalle("Muebles 2018");
       
        IProductoControlador productoControlador = new ProductoControladorImpl();
       productoControlador.insertarProductoCtrl(nuevoProducto);
       
       //>-----------------------------< >-------------------------------<
       
       Material nuevoMaterial = new Material();
       nuevoMaterial.setIdMaterial(1);
       nuevoMaterial.setNombre("Madera");
       nuevoMaterial.setColor("Cafe");
       nuevoMaterial.setDurabilidad("Alta");
       nuevoMaterial.setResistencia("Media");
       
        IMaterialControlador materialControlador = new MaterialContorladorImpl();
        materialControlador.insertarMaterialCtrl(nuevoMaterial);
       
        //>-----------------------------< >-------------------------------<
        
        TipoProducto nuevoTipoProducto = new TipoProducto();
        nuevoTipoProducto.setIdTipoProducto(1);
        nuevoTipoProducto.setNombre("Sillas");
        nuevoTipoProducto.setColor("Cafe,Verde");
        
        ITipoProductoControlador nuevoTipoProductoControlador = new TipoProductoControladorImpl();
        nuevoTipoProductoControlador.insertarTipoProductoCtrl(nuevoTipoProducto);
        
       //>-----------------------------< >-------------------------------<
       
       Categorias nuevaCategoria = new Categorias();
       nuevaCategoria.setIdCategorias(1);
       nuevaCategoria.setNombre("Banio");
       nuevaCategoria.setResumen("Todo en banieras");
       nuevaCategoria.setFechaLanzamiento("05/05/2018");
       
       ICategoriasControlador nuevaCategoriaControlador = new CategoriasControladorImpl();
       nuevaCategoriaControlador.insertarCategoriasCrtl(nuevaCategoria);
       
       //>-----------------------------< >-------------------------------<
       
       Precio nuevoPrecio = new Precio();
       nuevoPrecio.setIdprecio(1);
       nuevoPrecio.setPrecioInicial("100");
       nuevoPrecio.setIva("12");
       nuevoPrecio.setPrecioFinal("120");
       
       IPrecioControlador nuevoPrecioCtrl = new PrecioControladorImpl();
       nuevoPrecioCtrl.insertarPrecioCtrl(nuevoPrecio);
       nuevoPrecioCtrl.listarPrecioCtrl();
       
       //>-----------------------------< >-------------------------------<
       
       Detalle nuevoDetalle = new Detalle();
       nuevoDetalle.setIdDetalle(1);
       nuevoDetalle.setNombre("Primer Detalle");
       nuevoDetalle.setResumen("Revista del verano de 2016");
       
        IDetalleControlador nuevoDetalleIns = new DetalleControladorImpl();
        nuevoDetalleIns.insertarDetalleCtrl(nuevoDetalle);
        
        //>-----------------------------< >-------------------------------<
        Catalogo nuevoCatalogo = new Catalogo();
        nuevoCatalogo.setIdCatalogo(1);
        nuevoCatalogo.setNombre("Verano");
        nuevoCatalogo.setFechaLanzamientoCatalogo("Noviembre 2017");
        nuevoCatalogo.setIdDetalle(1);
        nuevoCatalogo.setIdOferta(1);
        
        ICatalogoControlador nuevoCataCtrl = new CatalogoControladorImpl();
        nuevoCataCtrl.insertarCatalogoCtrl(nuevoCatalogo);
        nuevoCataCtrl.listarCatalogoCtrl();
        
        //>-----------------------------< >-------------------------------<
          
        Oferta nuevaOferta = new Oferta();
        nuevaOferta.setIdOferta(1);
        nuevaOferta.setNombre("Dia de las Madres");
        nuevaOferta.setCondicion("Ninguna");
        nuevaOferta.setFechainicial("Abril");
        nuevaOferta.setFechaVencimiento("Mayo");
        
        IOfertaControlador nuevaOfertaCtrl = new OfertaControladorImpl();
        nuevaOfertaCtrl.insertarOfertaCtrl(nuevaOferta);
        nuevaOfertaCtrl.listarOferta();
    }
    
}
