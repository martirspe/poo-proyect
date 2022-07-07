package Controlador;

//Librerías
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import Formatos.*;
import Vista.*;
import Principal.*;

public class ControladorMenu implements ActionListener {

    FormMenu vista;

    public ControladorMenu(FormMenu fm) {
        vista = fm;
        vista.jmiMantenimientoClientes.addActionListener(this);
        vista.jmiMantenimientoCategorias.addActionListener(this);
        vista.jmiMantenimientoProductos.addActionListener(this);
        vista.jmiMantenimientoStock.addActionListener(this);
        vista.jmiRegistroVentas.addActionListener(this);
        vista.jmiReporteVentas.addActionListener(this);
        fm.setExtendedState(JFrame.MAXIMIZED_BOTH);

        fm.setDefaultCloseOperation(fm.EXIT_ON_CLOSE);
        fm.setVisible(true);
        fm.setTitle("INFOCOM S.A.C");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jmiMantenimientoCategorias) {
            Main.fcat = new FormCategorias();
            Main.ccat = new ControladorCategorias(Main.fcat);
            vista.jdpContenedor.add(Main.fcat);
            CentrarForma.CPanel(vista.jdpContenedor, Main.fcat);
        }

        if (e.getSource() == vista.jmiMantenimientoClientes) {
            Main.fcli = new FormClientes();
            Main.ccli = new ControladorClientes(Main.fcli);
            vista.jdpContenedor.add(Main.fcli);
            CentrarForma.CPanel(vista.jdpContenedor, Main.fcli);
        }

        if (e.getSource() == vista.jmiMantenimientoProductos) {
            Main.fpro = new FormProductos();
            Main.cpro = new ControladorProductos(Main.fpro);
            vista.jdpContenedor.add(Main.fpro);
            CentrarForma.CPanel(vista.jdpContenedor, Main.fpro);
        }

        if (e.getSource() == vista.jmiMantenimientoStock) {
            Main.fstock = new FormStock();
            Main.cstock = new ControladorStock(Main.fstock);
            vista.jdpContenedor.add(Main.fstock);
            CentrarForma.CPanel(vista.jdpContenedor, Main.fstock);
        }
    }

}
