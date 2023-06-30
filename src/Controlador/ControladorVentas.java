package Controlador;

//Librerías
<<<<<<< HEAD
import DAO.CRUDclientes;
import DAO.CRUDproductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Clientes;
import Modelo.Empleados;
import Modelo.Ventas;
import DAO.CRUDventas;
import DAO.ListarVendedores;
import DAO.NombreObjetos;
import Formatos.ActualizarCombos;
import Formatos.FormatoVentas;
import Formatos.Mensajes;
import Modelo.Productos;

import Vista.FormVentas;
import java.util.Calendar;
import java.util.GregorianCalendar;
=======
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
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c

public class ControladorVentas implements ActionListener {

    //Atributos
    FormVentas vista;
<<<<<<< HEAD
    Ventas ven;
    Productos pro;
    Empleados emp;
=======
    Productos pro;
    Empleados ven;
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    Clientes cli;
    int idpro;
    int idven;
    int idcli;
<<<<<<< HEAD
    CRUDventas crudven;
    CRUDclientes crudcli;
    CRUDproductos crudpro;
=======
    CRUDventas crud;
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c

    public ControladorVentas(FormVentas fv) {
        vista = fv;
        this.vista.jbtnBCliente.addActionListener(this);
        this.vista.jbtnBProducto.addActionListener(this);
        this.vista.jbtnAProducto.addActionListener(this);
        this.vista.jbtnRVenta.addActionListener(this);
        FormatoVentas.Presentacion(fv);
<<<<<<< HEAD

        //FormatoVentas.Estado1(fv);
        crudven = new CRUDventas();
        crudven.MostrarProductosEnTabla(vista.jtblDatos);
        vista.setVisible(true);

        //Coloca la fecha actual sobre JDateChooser
        Calendar cal = new GregorianCalendar();
        vista.jdcFecha.setCalendar(cal);

        //Cargamos los combos
        ListarVendedores lv = new ListarVendedores();
        lv.ActualizarListaVendedores();
        ActualizarCombos.ActualizarComboVendedor(vista.jcbxVendedor);
=======
        crud = new CRUDventas();
        crud.MostrarVentasEnTabla(vista.jtblDatos);
        vista.setVisible(true);
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    }

    @Override
    public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
        
        //Registra las ventas
        if (e.getSource() == vista.jbtnRVenta) {
            Ventas ven = FormatoVentas.LeerVentas(vista);
            CRUDventas crud = new CRUDventas();
            crud.RegistrarVenta(ven);

            crud.MostrarProductosEnTabla(vista.jtblDatos);
            FormatoVentas.LimpiarEntradas(vista);
        }
        
        //Añade el cliente al formulario de ventas
        if (e.getSource() == vista.jbtnBCliente) {
            idcli = Mensajes.M2("Ingrese el ID del cliente a buscar");
            crudcli = new CRUDclientes();
            cli = crudcli.ObtenerRegistroCli(idcli);
            if (cli == null) {
                Mensajes.M1("El ID " + idcli + "no existe en la tabla productos");
            } else {
                vista.jcbxTDocumento.setSelectedItem(cli.getTipo_doc());
                vista.jtxtNDocumento.setText(String.valueOf(cli.getNum_doc()));
                vista.jtxtCliente.setText(cli.getNombre());
                vista.jtxtDireccion.setText(cli.getDireccion());
            }
            //FormatoVentas.Estado2(vista);
        }
        
        //Añade el producto al formulario de ventas
        if (e.getSource() == vista.jbtnBProducto) {
            idpro = Mensajes.M2("Ingrese el ID del producto a buscar");
            crudpro = new CRUDproductos();
            pro = crudpro.ObtenerRegistroPro(idpro);
            if (pro == null) {
                Mensajes.M1("El ID " + idpro + "no existe en la tabla productos");
            } else {
                vista.jtxtCodigo.setText(String.valueOf(pro.getCodigo()));
                vista.jtxtProducto.setText(pro.getNombre());
            }
            //FormatoVentas.Estado3(vista);
        }

        //Añade el producto a la lista de compras
        if (e.getSource() == vista.jbtnAProducto) {
            NombreObjetos no = new NombreObjetos();
            Mensajes.M1("Se ha añadido el producto a la lista de compras");
            no.RecuperarNombrePro(idpro);
            crudpro = new CRUDproductos();
            pro = crudpro.ObtenerRegistroPro(idpro);
            if (pro == null) {
                Mensajes.M1("El ID " + idpro + "no existe en la tabla productos");
            } else {
                vista.jtxtCodigo.setText(String.valueOf(pro.getCodigo()));
                vista.jtxtProducto.setText(pro.getNombre());
            }
            //FormatoVentas.Estado3(vista);
        }
    }
=======
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
}
