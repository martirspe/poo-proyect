package Controlador;
import DAO.CRUDreporteVentas;
import Formatos.FormatoReporteVentas;
import Formatos.Mensajes;
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
        this.vista.btn_vclientes.addActionListener(this);
        this.vista.btn_vprod.addActionListener(this);
        this.vista.btn_vemplea.addActionListener(this);
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
        if (e.getSource() == vista.btn_vclientes) {
            idcli = Mensajes.M2("Ingrese el ID del cliente a buscar");
            crud = new CRUDreporteVentas();
            crud.MostrarVentasxClienteEnTabla(vista.jTable1,idcli);
        }
        if (e.getSource() == vista.btn_vprod) {
            idpro = Mensajes.M2("Ingrese el ID del producto a buscar");
            crud = new CRUDreporteVentas();
            crud.MostrarVentasxProdEnTabla(vista.jTable1,idpro);
        }
        if (e.getSource() == vista.btn_vemplea) {
            idven = Mensajes.M2("Ingrese el ID del empleado a buscar");
            crud = new CRUDreporteVentas();
            crud.MostrarVentasxEmplEnTabla(vista.jTable1,idven);
        }
        
    }
}
