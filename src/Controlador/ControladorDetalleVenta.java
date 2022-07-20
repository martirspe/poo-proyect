package Controlador;

//Librerías
import DAO.CRUDdetalleVenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Ventas;
import DAO.CRUDventas;
import Formatos.FormatoDetalleVentas;
import Formatos.Mensajes;
import Modelo.DetalleVenta;
import Vista.FormReporteVentas;

public class ControladorDetalleVenta implements ActionListener {

    //Atributos
    FormReporteVentas vista;
    Ventas ven;
    DetalleVenta dtven;
    int idven;
    int iddtven;
    CRUDventas crudven;
    CRUDdetalleVenta cruddtven;

    public ControladorDetalleVenta(FormReporteVentas fr) {
        vista = fr;
        this.vista.jbtnCVentas.addActionListener(this);
        FormatoDetalleVentas.Presentacion(fr);
        crudven = new CRUDventas();
        crudven.MostrarVentasEnTabla(vista.jtblDatos);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
