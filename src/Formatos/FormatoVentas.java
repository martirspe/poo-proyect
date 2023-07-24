package Formatos;

//Librerías
import DAO.NombreObjetos;
import Modelo.Clientes;
import Modelo.DetalleVentaIDs;
import Modelo.Empleados;
import Modelo.Productos;
import Modelo.Ventas;
import Principal.Main;
import Vista.FormVentas;

public class FormatoVentas {

    public static void Presentacion(FormVentas fv) {
        fv.setTitle("Registro de Ventas");
    }

    public static void LimpiarEntradas(FormVentas fv) {
        fv.jcbxTDocumento.setSelectedIndex(0);
        fv.jtxtNDocumento.setText("");
        fv.jtxtCliente.setText("");
        fv.jtxtDireccion.setText("");
        fv.jcbxVendedor.setSelectedIndex(0);
        fv.jcbxReferencia.setSelectedIndex(0);
        fv.jtxtCodigo.setText("");
        fv.jtxtProducto.setText("");
        fv.jspCantidad.setValue(0);
        fv.jspPrecio.setValue(0);
        fv.jcbxVendedor.setSelectedIndex(0);
        fv.SubTotalVen.setText("");
        fv.Igv.setText("");
        fv.Total.setText("");
    }

    public static void Estado1(FormVentas fp) {
        fp.jbtnBCliente.setEnabled(true);
        fp.jbtnBProducto.setEnabled(false);
        fp.jbtnAProducto.setEnabled(false);
        fp.jbtnRVenta.setEnabled(false);
    }

    public static void Estado2(FormVentas fp) {
        fp.jbtnBCliente.setEnabled(true);
        fp.jbtnBProducto.setEnabled(true);
        fp.jbtnAProducto.setEnabled(false);
        fp.jbtnRVenta.setEnabled(false);
    }

    public static void Estado3(FormVentas fp) {
        fp.jbtnBCliente.setEnabled(true);
        fp.jbtnBProducto.setEnabled(true);
        fp.jbtnAProducto.setEnabled(true);
        fp.jbtnRVenta.setEnabled(false);
    }

    public static void Estado4(FormVentas fp) {
        fp.jbtnBCliente.setEnabled(true);
        fp.jbtnBProducto.setEnabled(true);
        fp.jbtnAProducto.setEnabled(true);
        fp.jbtnRVenta.setEnabled(true);
    }

    public static Ventas LeerVentas(FormVentas fv) {

        //Creación de Objetos
        Ventas ven = new Ventas();
        Clientes cli = new Clientes();
        Empleados emp = new Empleados();
        Productos pro = new Productos();

        //Buscamos el ID del cliente
        NombreObjetos oc = new NombreObjetos();
        Integer idcli = oc.RecuperarIdCli(fv.jtxtNDocumento.getText());
        ven.setId_cliente(idcli);
        cli.setNum_doc(fv.jtxtNDocumento.getText());
        cli.setNombre(fv.jtxtCliente.getText());
        cli.setDireccion(fv.jtxtDireccion.getText());

        //Buscamos el ID del empleado
        NombreObjetos oe = new NombreObjetos();
        Integer idemp = oe.RecuperarIdEmp(fv.jcbxVendedor.getSelectedItem().toString());
        ven.setId_empleado(idemp);

        emp.setNombre(fv.jtxtCliente.getText());

        //Buscamos el apellido del empleado
        NombreObjetos ae = new NombreObjetos();
        String ape = ae.RecuperarApellidoEmp(fv.jcbxVendedor.getSelectedItem().toString());
        
        emp.setApellidos(ape);
        //Calcular el total de la venta
        Double totven = Double.parseDouble(fv.jspCantidad.getValue().toString()) * Double.parseDouble(fv.jspPrecio.getValue().toString());

        //Asignando datos al objeto ventas
        ven.setMet_pago(fv.jcbxFPago.getSelectedItem().toString());
        ven.setIgv(0.18);
        ven.setTotal(totven);
        ven.setFecha(fv.jdcFecha.getDate());
        ven.setReferencia(fv.jcbxReferencia.getSelectedItem().toString());
        ven.setNota(fv.jtxtObservacion.getText());

        return ven;

    }

    public static DetalleVentaIDs LeerDetalleVenta(FormVentas fv) {
        DetalleVentaIDs dtven = new DetalleVentaIDs();

        //Buscamos el ID del producto
        NombreObjetos op = new NombreObjetos();
        Integer idpro = op.RecuperarIdPro(fv.jtxtCodigo.getText());
        dtven.setId_producto(idpro);
        dtven.setCantidad(Integer.parseInt(fv.jspCantidad.getValue().toString()));
        dtven.setPrecio(Double.parseDouble(fv.jspPrecio.getValue().toString()));

        return dtven;
    }
}
