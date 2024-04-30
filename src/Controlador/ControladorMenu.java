package Controlador;

//Librerías
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import Formatos.*;
import Modelo.Login;
import Vista.*;
import Principal.*;
import static Principal.Main.cLogin;
import static Principal.Main.fm;
import static Principal.Main.formLogin;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Timer;

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
        vista.jMenuItem1.addActionListener(this);
        fm.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //fm.setDefaultCloseOperation(fm.EXIT_ON_CLOSE);
        fm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        fm.setVisible(true);
        fm.setTitle("INFOCOM S.A.C");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.jmiMantenimientoProductos) {
            Main.fpro = new FormProductos();
            Main.cpro = new ControladorProductos(Main.fpro);
            vista.jdpContenedor.removeAll();
            vista.jdpContenedor.updateUI();
            vista.jdpContenedor.add(Main.fpro);
            CentrarForma.CFProductos(vista.jdpContenedor, Main.fpro);
        }

        if (e.getSource() == vista.jmiMantenimientoCategorias) {
            Main.fcat = new FormCategorias();
            Main.ccat = new ControladorCategorias(Main.fcat);
            vista.jdpContenedor.removeAll();
            vista.jdpContenedor.updateUI();
            vista.jdpContenedor.add(Main.fcat);
            CentrarForma.CFCategorias(vista.jdpContenedor, Main.fcat);
        }

        if (e.getSource() == vista.jmiMantenimientoClientes) {
            Main.fcli = new FormClientes();
            Main.ccli = new ControladorClientes(Main.fcli);
            vista.jdpContenedor.removeAll();
            vista.jdpContenedor.updateUI();
            vista.jdpContenedor.add(Main.fcli);
            CentrarForma.CFClientes(vista.jdpContenedor, Main.fcli);
        }

        if (e.getSource() == vista.jmiMantenimientoStock) {
            Main.fstock = new FormStock();
            Main.cstock = new ControladorStock(Main.fstock);
            vista.jdpContenedor.removeAll();
            vista.jdpContenedor.updateUI();
            vista.jdpContenedor.add(Main.fstock);
            CentrarForma.CFStock(vista.jdpContenedor, Main.fstock);
        }

        if (e.getSource() == vista.jmiRegistroVentas) {
            Main.fventas = new FormVentas();
            Main.cventas = new ControladorVentas(Main.fventas);
            vista.jdpContenedor.removeAll();
            vista.jdpContenedor.updateUI();
            vista.jdpContenedor.add(Main.fventas);
            CentrarForma.CFVentas(vista.jdpContenedor, Main.fventas);
        }

        if (e.getSource() == vista.jmiReporteVentas) {
            Main.rventas = new FormReporteVentas();
            Main.crventas = new ControladorDetalleVenta(Main.rventas);
            vista.jdpContenedor.removeAll();
            vista.jdpContenedor.updateUI();
            vista.jdpContenedor.add(Main.rventas);
            CentrarForma.CFDVentas(vista.jdpContenedor, Main.rventas);
        }
        if (e.getSource() == vista.jMenuItem1) {
            formLogin = new FormLogin();
            cLogin = new ControladorLogin(formLogin);
            vista.dispatchEvent(new WindowEvent(vista, WindowEvent.WINDOW_CLOSING));
        }

    }

    public void recuperadoDatosSesion(Login login) {
        vista.jlUsuarioDatos.setText(login.getNombre() + " " + login.getApellidos());
        // Formateamos la fecha y hora actual y la mostramos en el JTextField
        Timer timer;
        timer = new Timer(1000, (ActionEvent e) -> {
            // Obtenemos la fecha y hora actual
            Date now1 = new Date();
            // Creamos un formato para mostrar la fecha y hora con segundos
            SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            // Formateamos la fecha y hora actual y la mostramos en el JTextField
            vista.jlFechaHoraDatos.setText(dateFormat1.format(now1));
        });
        // Iniciamos el timer
        timer.start();
    }

}
