package DAO;

//Librerías
import Principal.Main;
import Colecciones.ListaVendedores;
import Modelo.Empleados;
import Formatos.Mensajes;

public class ListarVendedores extends ConectarBD {

    public ListarVendedores() {
    }

<<<<<<< HEAD
    //Método que actualiza la coleccion de vendedores
=======
    //Método que actualiza la coleccion ListaCategorias
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    public void ActualizarListaVendedores() {
        Main.Listaven = new ListaVendedores();
        try {
            rs = st.executeQuery("SELECT nombre, apellidos FROM empleados WHERE estado = 1;");
            while (rs.next()) {
                Empleados ven = new Empleados();
<<<<<<< HEAD
                ven.setNombre(rs.getString(1));
                ven.setApellidos(rs.getString(2));
=======
                ven.setId(rs.getInt(1));
                ven.setNombre(rs.getString(2));
                ven.setApellidos(rs.getString(3));
                ven.setEstado(rs.getInt(4));
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
                Main.Listaven.AgregarVendedor(ven);
            }
            rs.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede actualizar la coleccion vendedores." + e);
        }
    }
}
