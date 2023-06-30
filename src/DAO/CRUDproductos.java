package DAO;

//Librerías
import Modelo.Productos;
import Formatos.Mensajes;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Formatos.ManejadorTabla;

public class CRUDproductos extends ConectarBD {

    public CRUDproductos() {
    }

    //Método que recibe un JTable y JLabel y miuestra los registros de la tabla en el JTable
    public void MostrarProductosEnTabla(JTable tabla) {
<<<<<<< HEAD
        String[] titulo = {"#", "ID", "CÓDIGO", "NOMBRE", "MODELO", "MARCA", "CATEGORÍA", "STOCK", "PRECIO", "DESCRIPCIÓN"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        tabla.setModel(modelo);
        try {
            rs = st.executeQuery("SELECT id, codigo, nombre, modelo, marca, id_categoria, cantidad, precio, descripcion FROM productos WHERE estado = 1");
=======
        String[] titulo = {"No.", "ID", "Código", "Nombre", "Modelo", "Marca", "Categoría", "Stock", "Precio", "Descripción"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        tabla.setModel(modelo);
        try {
            rs = st.executeQuery("SELECT id, codigo, nombre, modelo, marca, categoria, cantidad, precio, descripcion FROM productos WHERE estado = 1");
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
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

            ManejadorTabla.FormatoTablaProductos(tabla);
            conexion.close();

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla productos." + e);
        }
    }

    //Método que recibe un producto y lo inserta en la tabla PRODUCTOS
    public void InsertarProducto(Productos pro) {
        try {
<<<<<<< HEAD
            ps = conexion.prepareStatement("INSERT INTO productos (codigo, nombre, modelo, marca, id_categoria, cantidad, precio, descripcion, estado)"
=======
            ps = conexion.prepareStatement("INSERT INTO productos (codigo, nombre, modelo, marca, categoria, cantidad, precio, descripcion, estado)"
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
                    + " values(?,?,?,?,?,?,?,?,1);");
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getModelo());
            ps.setString(4, pro.getMarca());
            ps.setInt(5, pro.getCategoria());
            ps.setInt(6, pro.getStock());
            ps.setDouble(7, pro.getPrecio());
            ps.setString(8, pro.getDescripcion());
            ps.executeUpdate();
            ps.close();
            Mensajes.M1("¡El producto se ha registrado correctamente!");

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede registrar el producto." + e);
        }
    }

    public Productos ObtenerRegistroPro(int idcat) {
        Productos pro = null; //No hay datos asociados al objeto
        try {
<<<<<<< HEAD
            rs = st.executeQuery("SELECT id, codigo, nombre, modelo, marca, id_categoria, cantidad, precio, descripcion FROM productos WHERE estado = 1 AND id = " + idcat);
=======
            rs = st.executeQuery("SELECT id, codigo, nombre, modelo, marca, categoria, cantidad, precio, descripcion FROM productos WHERE estado = 1 AND id = " + idcat);
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
            pro = new Productos();
            if (rs.next()) {
                pro.setIdpro(rs.getInt(1));
                pro.setCodigo(rs.getString(2));
                pro.setNombre(rs.getString(3));
                pro.setModelo(rs.getString(4));
                pro.setMarca(rs.getString(5));
                pro.setCategoria(rs.getInt(6));
                pro.setStock(rs.getInt(7));
                pro.setPrecio(rs.getDouble(8));
                pro.setDescripcion(rs.getString(9));
            }
            rs.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el producto." + e);
        }
        return pro;
    }

    public void ActualizarRegistroPro(Productos pro) {
        try {
<<<<<<< HEAD
            ps = conexion.prepareStatement("UPDATE productos SET codigo = ?, nombre = ?, modelo = ?, marca = ?, id_categoria = ?, cantidad = ?, precio = ?, descripcion = ? WHERE id = ?");
=======
            ps = conexion.prepareStatement("UPDATE productos SET codigo = ?, nombre = ?, modelo = ?, marca = ?, categoria = ?, cantidad = ?, precio = ?, descripcion = ? WHERE id = ?");
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
            ps.setString(1, pro.getCodigo());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getModelo());
            ps.setString(4, pro.getMarca());
            ps.setInt(5, pro.getCategoria());
            ps.setInt(6, pro.getStock());
            ps.setDouble(7, pro.getPrecio());
            ps.setString(8, pro.getDescripcion());
            ps.setInt(9, pro.getIdpro());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede actualizar el producto." + e);
        }
    }

    public void EliminarRegistroPro(int idcat) {
        try {
            ps = conexion.prepareStatement("UPDATE productos SET estado = 0 WHERE id = ?");
            ps.setInt(1, idcat);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede eliminar el producto." + e);
        }
    }

}
