/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.LoginDAO;
import Formatos.Mensajes;
import Modelo.Login;
import static Principal.Main.formLogin;

import Vista.FormLogin;
import Vista.FormMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nike Rodriguez
 */
public class ControladorLogin implements ActionListener {

    //Atributos
    FormLogin vista;
    // Login login;
    Encryptador ecp = new Encryptador();
    LoginDAO dao = new LoginDAO();

    public static FormMenu fm;
    public static ControladorMenu cfm;

    public ControladorLogin(FormLogin fp) {
        vista = fp;
        this.vista.jButton1.addActionListener(this);
        try {
            String originalString = "rvera12345678912";
            String datoClave = "Scodwmx3YUVBt/2mBJsGDA==";//ecp.generateAES256Key();
            System.out.println("CLAVE original: " + datoClave);
            String encryptedString = ecp.encrypt(originalString, datoClave);
            System.out.println("Mensaje original: " + originalString);
            System.out.println("Mensaje encriptado: " + encryptedString);

            // fp.setExtendedState(JFrame.MAXIMIZED_BOTH);
            //fp.setDefaultCloseOperation(fp.EXIT_ON_CLOSE);
            fp.setDefaultCloseOperation(fp.DISPOSE_ON_CLOSE);

            fp.setLocationRelativeTo(null);
            fp.setVisible(true);
            fp.setTitle("INFOCOM");
        } catch (Exception e) {
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Validando Datos
        if (validandoDatos()) {
            //Ejecusión boton
            if (e.getSource() == vista.jButton1) {
                String usuarioIngresado = vista.jTextField1.getText();
                String passIngresado = new String(vista.jPasswordField1.getPassword());
                String passEncrypt = null;
                String datoClave = "Scodwmx3YUVBt/2mBJsGDA==";
                Login loginRecuperado = dao.ObteniendoCredenciales(usuarioIngresado);

                if (loginRecuperado != null && loginRecuperado.getUsuario() != null) {
                    try {
                        passEncrypt = ecp.encrypt(passIngresado, datoClave);
                    } catch (Exception ex) {
                        Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    //Validando que sean iguales
                    if (loginRecuperado.getUsuario().equals(vista.jTextField1.getText())
                            && loginRecuperado.getPass().equals(passEncrypt)) {
                        Login datosRecuperadosLogueado = dao.usuarioLogueado(loginRecuperado.getId_empleado());
                        Login lg = new Login();

                        lg.setNombre(datosRecuperadosLogueado.getNombre());
                        lg.setApellidos(datosRecuperadosLogueado.getApellidos());

                        fm = new FormMenu();
                        cfm = new ControladorMenu(fm);
                        cfm.recuperadoDatosSesion(lg);
                        formLogin.dispatchEvent(new WindowEvent(formLogin, WindowEvent.WINDOW_CLOSING));
                    } else {
                        Mensajes.M4("Error al Iniciar Sesión - Contraseña Incorrecta");
                    }
                } else {
                    Mensajes.M4("Usuario no Existe en la BD");
                }
            }
        }

    }

    private Boolean validandoDatos() {
        Boolean response = false;
        //Validando usuario
        if (vista.jTextField1.getText().equalsIgnoreCase("") || vista.jTextField1.getText() == null) {
            Mensajes.M4("Error - Debe Ingresar su Usuario");
        } else if (vista.jPasswordField1.getPassword().length <=0) {
            Mensajes.M4("Error - Debe Ingresar la Password");
        } else {
            response = true;
        }
        return response;
    }

}
