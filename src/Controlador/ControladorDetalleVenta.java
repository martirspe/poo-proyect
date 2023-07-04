package Controlador;

//Librerías
import DAO.CRUDdetalleVenta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Formatos.FormatoDetalleVentas;
import Formatos.Mensajes;
import Vista.FormReporteVentas;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import static java.util.Objects.isNull;

public class ControladorDetalleVenta implements ActionListener {

    //Atributos
    int idpro;
    int idven;
    int idcli;
    FormReporteVentas vista;
    CRUDdetalleVenta crud;

    public ControladorDetalleVenta(FormReporteVentas frv) {
        vista = frv;
        this.vista.jbtnCVentas.addActionListener(this);
        this.vista.jbntVCliente.addActionListener(this);
        this.vista.jbntVProducto.addActionListener(this);
        this.vista.jbntVVendedor.addActionListener(this);
        FormatoDetalleVentas.Presentacion(frv);
        crud = new CRUDdetalleVenta();
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String dateInit = "", dateEnd = "";
        if (!isNull(vista.jdcFInicio.getDate())) {
            Date dInit = vista.jdcFInicio.getDate();
            Date dEnd = vista.jdcFFin.getDate();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateInit = dateFormat.format(dInit);
            dateEnd = dateFormat.format(dEnd);
        }

        if (e.getSource() == vista.jbtnCVentas) {
            crud = new CRUDdetalleVenta();
            crud.MostrarVentasEnTabla(vista.jtblDatos, dateInit, dateEnd);
        }
        
        if (e.getSource() == vista.jbntVVendedor) {
            idven = Mensajes.M2("Ingrese el ID del vendedor a buscar");
            
            if (idven != 0) {
                crud = new CRUDdetalleVenta();
                crud.MostrarVentasVendedorEnTabla(vista.jtblDatos, idven, dateInit, dateEnd);
            }
        }
        
        if (e.getSource() == vista.jbntVCliente) {
            idcli = Mensajes.M2("Ingrese el ID del cliente a buscar");
            
            if (idcli != 0) {
            crud = new CRUDdetalleVenta();
            crud.MostrarVentasClienteEnTabla(vista.jtblDatos, idcli, dateInit, dateEnd);
            }
        }
        
        if (e.getSource() == vista.jbntVProducto) {
            idpro = Mensajes.M2("Ingrese el ID del producto a buscar");
            if (idpro != 0) {
            crud = new CRUDdetalleVenta();
            crud.MostrarVentasProductoEnTabla(vista.jtblDatos, idpro, dateInit, dateEnd);
            }
        }
    }
}
