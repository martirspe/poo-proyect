package DAO;

//Libreria
import java.sql.*;
import Formatos.Mensajes;

public class ConectarBD implements Parametros {

    //Atributos
    public Connection conexion;
    public Statement st;
    public ResultSet rs;
    public PreparedStatement ps;

    public ConectarBD() {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(RUTA, USUARIO, CLAVE);
            st = conexion.createStatement();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede conectar a la BD." + e);
        }
    }
}
