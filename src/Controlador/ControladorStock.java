/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.CRUDstock;
import DAO.ListarCategorias;
import Formatos.ActualizarCombos;
import Formatos.FormatoStock;
import Modelo.Productos;
import Vista.FormStock;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jguku
 */
public class ControladorStock implements ActionListener {
    FormStock vista;
    CRUDstock crud;
    int idstock;
    
    public ControladorStock(FormStock fs) {
        vista = fs;
        this.vista.btn_buscar.addActionListener(this);
        FormatoStock.Presentacion(fs);
        //FormatoProductos.Estado1(fs);
        //crud = new CRUDproductos();
        //crud.MostrarProductosEnTabla(vista.jtblDatos);
        vista.setVisible(true);
        
        //Cargar combo categorias
        ListarCategorias lc = new ListarCategorias();
        lc.ActualizarListaCategorias();
        ActualizarCombos.ActualizarComboCategoria(vista.jcbxCategorias);


    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == vista.btn_buscar){
            Productos stock = FormatoStock.LeerProductos(vista);
            crud = new CRUDstock();
            
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}