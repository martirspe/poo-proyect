package DAO;

//Librerías
import Principal.Main;
import Colecciones.ListaCategorias;
import Modelo.Categorias;
import Formatos.Mensajes;

public class ListarCategorias extends ConectarBD {

    public ListarCategorias() {
    }

    //Método que actualiza la coleccion ListaCategorias
    public void ActualizarListaCategorias() {
        Main.Listacat = new ListaCategorias();
        try {
            rs = st.executeQuery("SELECT * FROM categorias WHERE estado = 1");
            while (rs.next()) {
                Categorias cat = new Categorias();
                cat.setIdcat(rs.getInt(1));
                cat.setNombre(rs.getString(2));
                cat.setDescripcion(rs.getString(3));
                cat.setEstado(rs.getInt(4));
                Main.Listacat.AgregarCategoria(cat);
            }
            rs.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede actualizar la coleccion categorias." + e);
        }
    }
}
