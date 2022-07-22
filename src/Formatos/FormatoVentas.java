package Formatos;

//Librerías
import DAO.NombreObjetos;
import Modelo.DetalleVenta;
import Modelo.Ventas;
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
        fv.jtxtSubTotal.setText("");
        fv.jtxtIgv.setText("");
        fv.jtxtTotal.setText("");
        fv.jcbxVendedor.setSelectedIndex(0);
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
        Ventas ven = new Ventas();

        //Buscamos el ID del cliente
        NombreObjetos oc = new NombreObjetos();
        Integer idcli = oc.RecuperarIdCli(fv.jtxtNDocumento.getText());
        ven.setId_cliente(idcli);

        //Buscamos el ID del empleado
        NombreObjetos oe = new NombreObjetos();
        Integer idemp = oe.RecuperarIdEmp(fv.jcbxVendedor.getSelectedItem().toString());
        ven.setId_empleado(idemp);

        //Asignando datos al objeto ventas
        ven.setMet_pago(fv.jcbxFPago.getSelectedItem().toString());
        ven.setTotal(Double.parseDouble(fv.jtxtTotal.getText()));
        ven.setFecha(fv.jdcFecha.getDate());
        ven.setReferencia(fv.jcbxReferencia.getSelectedItem().toString());
        ven.setNota(fv.jtxtObservacion.getText());

        return ven;

    }

    public static DetalleVenta LeerDetalleVenta(FormVentas fv) {
        DetalleVenta dtven = new DetalleVenta();

        //Buscamos el ID del producto
        NombreObjetos op = new NombreObjetos();
        Integer idpro = op.RecuperarIdPro(fv.jtxtCodigo.getText());
        dtven.setId_producto(idpro);

        dtven.setCantidad(Integer.parseInt(fv.jspCantidad.getValue().toString()));
        dtven.setPrecio(Double.parseDouble(fv.jspPrecio.getValue().toString()));

        return dtven;
    }
}
