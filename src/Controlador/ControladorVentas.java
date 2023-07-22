package Controlador;

//Librerías
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DAO.*;
import Modelo.*;
import Formatos.*;
import Vista.FormVentas;

public class ControladorVentas implements ActionListener {

    //Atributos
    FormVentas vista;
    Productos pro;
    Clientes cli;
    int idpro;
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
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //Registra las ventas
        if (e.getSource() == vista.jbtnRVenta) {
            Ventas ven = FormatoVentas.LeerVentas(vista);
            //CRUDventas crud = new CRUDventas();
            //crud.RegistrarVenta(ven);
            crudven.RegistrarVenta(ven);

            crudven.MostrarProductosEnTabla(vista.jtblDatos);
            FormatoVentas.LimpiarEntradas(vista);
            crudven.limpiarTabla(vista.jtblDatos);
        }

        //Añade el cliente al formulario de ventas
        if (e.getSource() == vista.jbtnBCliente) {
            idcli = Mensajes.M2("Ingrese el ID del cliente a buscar");

            if (idcli != 0) {
                crudcli = new CRUDclientes();
                cli = crudcli.ObtenerRegistroCli(idcli);
                if (cli == null) {
                    Mensajes.M1("El ID " + idcli + " no existe en la tabla clientes");
                } else {
                    vista.jcbxTDocumento.setSelectedItem(cli.getTipo_doc());
                    vista.jtxtNDocumento.setText(String.valueOf(cli.getNum_doc()));
                    vista.jtxtCliente.setText(cli.getNombre());
                    vista.jtxtDireccion.setText(cli.getDireccion());
                }
            }
            //FormatoVentas.Estado2(vista);
        }

        //Añade el producto al formulario de ventas
        if (e.getSource() == vista.jbtnBProducto) {
            idpro = Mensajes.M2("Ingrese el ID del producto a buscar");

            if (idpro != 0) {
                crudpro = new CRUDproductos();
                pro = crudpro.ObtenerRegistroPro(idpro);
                if (pro == null) {
                    Mensajes.M1("El ID " + idpro + " no existe en la tabla productos");
                } else {
                    vista.jtxtCodigo.setText(String.valueOf(pro.getCodigo()));
                    vista.jtxtProducto.setText(pro.getNombre());
                    vista.jspPrecio.setValue(pro.getPrecio());
                }
            }
            //FormatoVentas.Estado3(vista);
        }

        //Añade el producto a la lista de compras
        if (e.getSource() == vista.jbtnAProducto) {

            NombreObjetos no = new NombreObjetos();
            Object[] modeloTabla = new Object[8];

            if (pro == null) {
                Mensajes.M1("El ID " + idpro + " no existe en la tabla productos");
            } else {

                modeloTabla[0] = String.valueOf(pro.getIdpro());
                modeloTabla[1] = String.valueOf(pro.getCodigo());
                modeloTabla[2] = pro.getNombre();
                modeloTabla[3] = pro.getModelo();
                modeloTabla[4] = pro.getMarca();
                modeloTabla[5] = no.RecuperarNombreCat(pro.getCategoria());
                modeloTabla[6] = vista.jspCantidad.getValue();
                modeloTabla[7] = pro.getPrecio();

                crudven.AgregarFilaEnTabla(modeloTabla);
            }

            crudven.CalcularSubTotal();
            crudven.CalcularIGV();
            crudven.CalcularTotal();

            vista.SubTotalVen.setText("S/" + crudven.sub_total);
            vista.Igv.setText("S/" + Math.round(crudven.igv * 100.0) / 100.0);
            vista.Total.setText("S/" + Math.round(crudven.total * 100.0) / 100.0);

        }
    }
}
