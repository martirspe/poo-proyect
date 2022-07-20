package Controlador;
import DAO.CRUDreporteVentas;
import Formatos.FormatoReporteVentas;
import Vista.FormReporteVentas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorReporteVentas implements ActionListener{
        //Atributos
    FormReporteVentas vista;
    //Productos pro;
    //Empleados ven;
    //Clientes cli;
    int idpro;
    int idven;
    int idcli;
    CRUDreporteVentas crud;

    public ControladorReporteVentas(FormReporteVentas frv) {
        vista = frv;
        this.vista.btn_getVentas.addActionListener(this);
        //this.vista.jbtnBProducto.addActionListener(this);
        //this.vista.jbtnAProducto.addActionListener(this);
        //this.vista.jbtnRVenta.addActionListener(this);
        FormatoReporteVentas.Presentacion(frv);
        crud = new CRUDreporteVentas();
        //crud.MostrarVentasEnTabla(vista.jtblDatos);
        vista.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btn_getVentas) {
            System.out.println(vista.fecha_inicio.getText());
            System.out.println(vista.fecha_final.getText());
            System.out.println(vista.comboMoneda.getSelectedItem().toString());
            crud = new CRUDreporteVentas();
            crud.MostrarVentasEnTabla(vista.jTable1);
        }
    }
}
