package Controlador;

//Librerías
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Ventas;
import Modelo.Clientes;
import Modelo.Empleados;
import Modelo.Productos;
import DAO.CRUDventas;
import DAO.ListarCategorias;
import Formatos.ActualizarCombos;
import Formatos.FormatoVentas;

import Vista.FormVentas;

public class ControladorVentas implements ActionListener {

    //Atributos
    FormVentas vista;
    Productos pro;
    Empleados ven;
    Clientes cli;
    int idpro;
    int idven;
    int idcli;
    CRUDventas crud;

    public ControladorVentas(FormVentas fv) {
        vista = fv;
        this.vista.jbtnBCliente.addActionListener(this);
        this.vista.jbtnBProducto.addActionListener(this);
        this.vista.jbtnAProducto.addActionListener(this);
        this.vista.jbtnRVenta.addActionListener(this);
        FormatoVentas.Presentacion(fv);
        crud = new CRUDventas();
        crud.MostrarVentasEnTabla(vista.jtblDatos);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
