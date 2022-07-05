package DAO;

//Librerías
import Modelo.Categorias;
import Formatos.Mensajes;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Formatos.ManejadorTabla;

public class CRUDcategorias extends ConectarBD {

    public CRUDcategorias() {
    }

    //Método que recibe un JTable y JLabel y miuestra los registros de la tabla en el JTable
    public void MostrarCategoriasEnTabla(JTable tabla) {
        String[] titulo = {"No.", "ID", "Nombre", "Descripción"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        tabla.setModel(modelo);
        try {
            rs = st.executeQuery("SELECT id, nombre, descripcion FROM categorias WHERE estado = 1");
            int cont = 0;
            while (rs.next()) { //netx(): recupera un registro de la consulta si existe.
                cont++;
                Categorias cat = new Categorias();
                cat.setIdcat(rs.getInt(1));
                cat.setNombre(rs.getString(2));
                cat.setDescripcion(rs.getString(3));
                modelo.addRow(cat.RegistroCategoria(cont));
            }

            ManejadorTabla.FormatoTablaCategorias(tabla);
            conexion.close();

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla categorías." + e);
        }
    }

    public void InsertarCategoria(Categorias cat) {
        try {
            //Preparamos la consulta con parámetros
            ps = conexion.prepareStatement("INSERT INTO categorias(nombre, descripcion, estado) VALUES(?,?,1)");
            //Insertamos los parámetros
            ps.setString(1, cat.getNombre());
            ps.setString(2, cat.getDescripcion());
            ps.executeUpdate(); //Actualiza y ejecuta la consulta
            ps.close();

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede insertar el registro en categorías." + e);
        }
    }

    public Categorias ObtenerRegistroCat(int idcat) {
        Categorias cat = null; //No hay datos asociados al objeto
        try {
            rs = st.executeQuery("SELECT id, nombre, descripcion FROM categorias WHERE estado = 1 AND id = " + idcat);
            cat = new Categorias();
            if (rs.next()) {
                cat.setIdcat(rs.getInt(1));
                cat.setNombre(rs.getString(2));
                cat.setDescripcion(rs.getString(3));
            }
            rs.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el registro." + e);
        }
        return cat;
    }

    public void ActualizarRegistroCat(Categorias cat) {
        try {
            ps = conexion.prepareStatement("UPDATE categorias SET nombre = ?, descripcion = ? WHERE id = ?");
            ps.setString(1, cat.getNombre());
            ps.setString(2, cat.getDescripcion());
            ps.setInt(3, cat.getIdcat());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede actualizar el registro." + e);
        }
    }

    public void EliminarRegistroCat(int idcat) {
        try {
            ps = conexion.prepareStatement("UPDATE categorias SET estado = 0 WHERE id = ?");
            ps.setInt(1, idcat);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede eliminar el registro." + e);
        }
    }

}
