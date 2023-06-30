package DAO;

//Librerías
import Modelo.Ventas;
import Modelo.Productos;
import Formatos.Mensajes;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Formatos.ManejadorTabla;
import Modelo.DetalleVentaIDs;
import java.text.SimpleDateFormat;

public class CRUDventas extends ConectarBD {

    public CRUDventas() {
    }

    //Método que recibe un JTable y JLabel y muestra los registros en el JTable
    public void MostrarProductosEnTabla(JTable tabla) {
        String[] titulo = {"#", "ID", "CÓDIGO", "NOMBRE", "MODELO", "MARCA", "CATEGORÍA", "STOCK", "PRECIO", "DESCRIPCIÓN"};
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

            ManejadorTabla.FormatoTablaProductos(tabla);
            conexion.close();

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla productos." + e);
        }
    }

    //Insertando datos en la tabla ventas
    public void RegistrarVenta(Ventas ven) {
        try {
            ps = conexion.prepareStatement("INSERT INTO ventas (id_cliente, id_empleado, met_pago, moneda, t_cambio, igv, total, fecha, referencia, nota, estado)"
                    + " values(?,?,?,?,?,?,?,?,?,?,1);");
            ps.setInt(1, ven.getId_cliente());
            ps.setInt(2, ven.getId_empleado());
            ps.setString(3, ven.getMet_pago());
            ps.setString(4, ven.getMoneda());
            ps.setDouble(5, ven.getT_cambio());
            ps.setDouble(6, ven.getIgv());
            ps.setDouble(7, ven.getTotal());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(8, sdf.format(ven.getFecha()));
            ps.setString(9, ven.getReferencia());
            ps.setString(10, ven.getNota());
            ps.executeUpdate();
            ps.close();
//            Mensajes.M1("¡El producto se ha registrado correctamente!");

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede registrar la venta." + e);
        }

        //Insertando datos en la tabla detalle_ventas
        DetalleVentaIDs dtven = new DetalleVentaIDs();
        if (dtven.getId_producto() != null) {

            try {
                ps = conexion.prepareStatement("INSERT INTO detalle_ventas (id_venta, producto, cantidad, precio)"
                        + " values(?,?,?,?,?);");
                ps.setInt(1, dtven.getId_venta());
                ps.setInt(2, dtven.getId_producto());
                ps.setInt(3, dtven.getCantidad());
                ps.setDouble(4, dtven.getPrecio());
                ps.executeUpdate();
                ps.close();
                Mensajes.M1("¡La venta se ha registrado correctamente!");

            } catch (Exception e) {
                Mensajes.M1("ERROR: no se puede registrar la venta." + e);
            }
        }
    }
}
