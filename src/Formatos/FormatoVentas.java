package Formatos;

//Librerías
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
        fv.jcbxFPago.setSelectedIndex(0);
        fv.jcbxMoneda.setSelectedIndex(0);
        fv.jcbxReferencia.setSelectedIndex(0);
        fv.jtxtTCambio.setText("");
        fv.jtxtCodigo.setText("");
        fv.jtxtProducto.setText("");
        fv.jspCantidad.setValue(0);
        fv.jcbxVendedor.setSelectedIndex(0);
        fv.jtxtTCambio.requestFocus();
    }

    public static Ventas LeerVentas(FormVentas fv) {
        return null;
    }
}
