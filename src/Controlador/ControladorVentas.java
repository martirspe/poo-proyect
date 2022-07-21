package Controlador;

//Librerías
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
import Modelo.DetalleVenta;
import Modelo.Productos;

import Vista.FormVentas;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ControladorVentas implements ActionListener {

    //Atributos
    FormVentas vista;
    Ventas ven;
    Productos pro;
    Empleados emp;
    Clientes cli;
    int idpro;
    int idven;
    int idcli;
    CRUDventas crudven;
    CRUDclientes crudcli;
    CRUDproductos crudpro;

    public ControladorVentas(FormVentas fv) {
        vista = fv;
        this.vista.jbtnBCliente.addActionListener(this);
        this.vista.jbtnBProducto.addActionListener(this);
        this.vista.jbtnAProducto.addActionListener(this);
        this.vista.jbtnRVenta.addActionListener(this);
        FormatoVentas.Presentacion(fv);
        FormatoVentas.Estado1(fv);
        crudven = new CRUDventas();
        crudven.MostrarVentasEnTabla(vista.jtblDatos);
        vista.setVisible(true);

        //Coloca la fecha actual sobre JDateChooser
        Calendar cal = new GregorianCalendar();
        vista.jdcFecha.setCalendar(cal);

        //Cargamos los combos
        ListarVendedores lv = new ListarVendedores();
        lv.ActualizarListaVendedores();
        ActualizarCombos.ActualizarComboVendedor(vista.jcbxVendedor);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnRVenta) {
            Ventas ven = FormatoVentas.LeerVentas(vista);
            CRUDventas crud = new CRUDventas();
            crud.RegistrarVenta(ven);

            DetalleVenta dvent = FormatoVentas.LeerDetalleVenta(vista);
            crud.RegistrarDetalleVenta(dvent);

            crud.MostrarVentasEnTabla(vista.jtblDatos);
            FormatoVentas.LimpiarEntradas(vista);
        }

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
            FormatoVentas.Estado2(vista);
        }

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
            FormatoVentas.Estado3(vista);
        }

        if (e.getSource() == vista.jbtnAProducto) {
            NombreObjetos no = new NombreObjetos();
            Mensajes.M1("Se ha añadido el producto a la lista de compras");
            no.RecuperarNombrePro(idpro);
            crudpro = new CRUDproductos();
            pro = crudpro.ObtenerRegistroPro(idpro);
            if (pro == null) {
                Mensajes.M1("El ID " + idpro + "no existe en la tabla productos");
            } else {
                vista.jtxtCodigo.setText(String.valueOf(pro.getIdpro()));
                vista.jtxtProducto.setText(pro.getNombre());
            }
            FormatoVentas.Estado4(vista);
        }
    }
}
