package DAO;

//Librerías
import Principal.Main;
import Colecciones.ListaVendedores;
import Modelo.Empleados;
import Formatos.Mensajes;

public class ListarVendedores extends ConectarBD {

    public ListarVendedores() {
    }

    //Método que actualiza la coleccion ListaCategorias
    public void ActualizarListaVendedores() {
        Main.Listaven = new ListaVendedores();
        try {
            rs = st.executeQuery("SELECT nombre, apellidos FROM empleados WHERE estado = 1;");
            while (rs.next()) {
                Empleados ven = new Empleados();
                ven.setId(rs.getInt(1));
                ven.setNombre(rs.getString(2));
                ven.setApellidos(rs.getString(3));
                ven.setEstado(rs.getInt(4));
                Main.Listaven.AgregarVendedor(ven);
            }
            rs.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede actualizar la coleccion vendedores." + e);
        }
    }
}
