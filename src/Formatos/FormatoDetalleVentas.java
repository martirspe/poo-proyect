package Formatos;

//Librerías
import Vista.FormReporteVentas;

public class FormatoDetalleVentas {

    public static void Presentacion(FormReporteVentas fr) {
        fr.setTitle("Reporte de ventas");
    }

    public static void LimpiarEntradas(FormReporteVentas fr) {
        fr.jdcFInicio.setDateFormatString("");
        fr.jdcFFin.setDateFormatString("");
        fr.jcbxMoneda.setSelectedIndex(0);
        fr.jtblDatos.setValueAt(fr, 0, 0);
    }
}
