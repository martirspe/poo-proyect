/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Formatos.Mensajes;
import Modelo.Login;
import java.sql.SQLException;

/**
 *
 * @author Nike Rodriguez
 */
public class LoginDAO extends ConectarBD {

    public Login ObteniendoCredenciales(String usuario) {

        Login login = null; //No hay datos asociados al objeto
        try {
            rs = st.executeQuery("SELECT id,usuario,password FROM empleados WHERE estado = 1 AND usuario = '" + usuario + "'");
            login = new Login();
            if (rs.next()) {
                login.setId_empleado(rs.getInt(1));
                login.setUsuario(rs.getString(2));
                login.setPass(rs.getString(3));
            } else {
                login = null;
            }
            rs.close();
        } catch (SQLException e) {
            Mensajes.M1("ERROR: no se puede recuperar el Empleado." + e);
        }
        return login;
    }

    public Login usuarioLogueado(Integer id) {

        Login login = null; //No hay datos asociados al objeto
        try {
            rs = st.executeQuery("SELECT nombre, apellidos FROM empleados WHERE estado = 1 AND id = '" + id + "'");
            login = new Login();
            if (rs.next()) {
                login.setNombre(rs.getString(1));
                login.setApellidos(rs.getString(2));
            } else {
                login = null;
            }
            rs.close();
        } catch (SQLException e) {
            Mensajes.M1("ERROR: no se puede recuperar datos del Empleado." + e);
        }
        return login;
    }
}
