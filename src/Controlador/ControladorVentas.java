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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel tmp = new DefaultTableModel();

    public ControladorVentas(FormVentas fv) {
        vista = fv;
        this.vista.jbtnBCliente.addActionListener(this);
        this.vista.jbtnBProducto.addActionListener(this);
        this.vista.jbtnAProducto.addActionListener(this);
        this.vista.jbtnRVenta.addActionListener(this);
        FormatoVentas.Presentacion(fv);
        FormatoVentas.Estado1(fv);
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

    private void TotalPagar(FormVentas fv) {
        Double tpagar = 0.00;
        Integer numFila = fv.jtblDatos.getRowCount();
        for (int i = 0; i < numFila; i++) {
            Double cal = Double.parseDouble(String.valueOf(fv.jtblDatos.getModel().getValueAt(i, 7)));
            tpagar = tpagar + cal;
        }
        fv.jtxtTotal.setText(String.format("%.2f", tpagar));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnRVenta) {
            Ventas ven = FormatoVentas.LeerVentas(vista);
            CRUDventas crud = new CRUDventas();
            crud.RegistrarVenta(ven);

            DetalleVenta dvent = FormatoVentas.LeerDetalleVenta(vista);
            crud.RegistrarDetalleVenta(dvent);

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
            idpro = no.RecuperarIdPro(vista.jtxtCodigo.getText());
            crudpro = new CRUDproductos();
            pro = crudpro.ObtenerRegistroPro(idpro);
            Integer cont = 0;
            Integer cant = Integer.parseInt(vista.jspCantidad.getValue().toString());
            Double price = Double.parseDouble(vista.jspPrecio.getValue().toString());
            Double subtotal = cant * price;
            Double igv = subtotal * 0.18;
            Double total = subtotal + igv;
            vista.jtxtSubTotal.setText(String.valueOf(subtotal));
            vista.jtxtIgv.setText(String.valueOf(igv));
            vista.jtxtTotal.setText(String.valueOf(total));
            if (pro.getStock() >= cant) {
                cont++;
                tmp = (DefaultTableModel) vista.jtblDatos.getModel();
                for (int i = 0; i < vista.jtblDatos.getRowCount(); i++) {
                    if (vista.jtblDatos.getValueAt(i, 1).equals(vista.jtxtCodigo.getText())) {
                        JOptionPane.showMessageDialog(null, "El producto ya esta registrado");
                        return;
                    }
                }
                ArrayList list = new ArrayList();
                list.add(cont);
                list.add(pro.getCodigo());
                list.add(pro.getNombre());
                list.add(pro.getModelo());
                list.add(pro.getMarca());
                Integer idcat = pro.getCategoria();
                NombreObjetos nc = new NombreObjetos();
                vista.jtxtDireccion.setText(cli.getDireccion());
                String nomcat = nc.RecuperarNombreCat(idcat);
                list.add(nomcat);
                list.add(cant);
                list.add(price);
                Object[] O = new Object[10];
                O[0] = list.get(1);
                O[1] = list.get(2);
                O[2] = list.get(3);
                O[3] = list.get(4);
                O[4] = list.get(5);
                O[5] = list.get(6);
                O[6] = list.get(7);
                tmp.addRow(O);
                vista.jtblDatos.setModel(tmp);
            } else {
                JOptionPane.showMessageDialog(null, "Stock no disponible");
            }
            FormatoVentas.Estado4(vista);
//            if (pro == null) {
//                Mensajes.M1("El ID " + idpro + "no existe en la tabla productos");
//            } else {
//                vista.jtxtCodigo.setText(String.valueOf(pro.getCodigo()));
//                vista.jtxtProducto.setText(pro.getNombre());
//            }
//            Mensajes.M1("Se ha añadido el producto a la list de compras");
//            FormatoVentas.Estado4(vista);
        }

//        if (e.getSource() == vista.jbtnAProducto) {
//            NombreObjetos no = new NombreObjetos();
//            Mensajes.M1("Se ha añadido el producto a la list de compras");
//            no.RecuperarNombrePro(idpro);
//            crudpro = new CRUDproductos();
//            pro = crudpro.ObtenerRegistroPro(idpro);
//            if (pro == null) {
//                Mensajes.M1("El ID " + idpro + "no existe en la tabla productos");
//            } else {
//                vista.jtxtCodigo.setText(String.valueOf(pro.getIdpro()));
//                vista.jtxtProducto.setText(pro.getNombre());
//            }
//            FormatoVentas.Estado4(vista);
//        }
    }
}
