package DAO;

//Librerías
import Formatos.ManejadorTabla;
import Formatos.Mensajes;
import Modelo.Productos;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUDstock extends ConectarBD {

    public CRUDstock() {
    }

    //Método que recibe un JTable y JLabel y miuestra los registros de la tabla en el JTable
    public void MostrarStockEnTabla(JTable tabla) {
        String[] titulo = {"No.", "ID", "Código", "Nombre", "Modelo", "Marca", "Categoría", "Stock", "Precio", "Descripción"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        tabla.setModel(modelo);
        try {
            rs = st.executeQuery("SELECT id, codigo, nombre, modelo, marca, id_categoria, cantidad, precio, descripcion FROM productos WHERE estado = 1");
            int cont = 0;
            while (rs.next()) { //netx(): recupera un registro de la consulta si existe.
                cont++;
                Productos pro = new Productos();
                pro.setIdpro(rs.getInt(1));
                pro.setCodigo(rs.getString(2));
                pro.setNombre(rs.getString(3));
                pro.setModelo(rs.getString(4));
                pro.setMarca(rs.getString(5));
                pro.setCategoria(rs.getInt(6));
                pro.setStock(rs.getInt(7));
                pro.setPrecio(rs.getDouble(8));
                pro.setDescripcion(rs.getString(9));
                modelo.addRow(pro.RegistroProducto(cont));
            }

            ManejadorTabla.FormatoTablaStock(tabla);
            conexion.close();

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla productos." + e);
        }
    }

    public Productos ObtenerRegistroPro(int idcat) {
        Productos pro = null; //No hay datos asociados al objeto
        try {
            rs = st.executeQuery("SELECT id, codigo, nombre, modelo, marca, cantidad FROM productos WHERE estado = 1 AND id = " + idcat);
            pro = new Productos();
            if (rs.next()) {
                pro.setIdpro(rs.getInt(1));
                pro.setCodigo(rs.getString(2));
                pro.setNombre(rs.getString(3));
                pro.setModelo(rs.getString(4));
                pro.setMarca(rs.getString(5));
                pro.setStock(rs.getInt(6));
            } else {
                pro = null;
            }
            rs.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el producto." + e);
        }
        return pro;
    }

    public void ActualizarRegistroPro(Productos pro) {
        try {
            ps = conexion.prepareStatement("UPDATE productos SET cantidad = ? WHERE id = ?");
            ps.setInt(1, pro.getStock());
            ps.setInt(2, pro.getIdpro());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede actualizar el stock del producto." + e);
        }
    }

}
