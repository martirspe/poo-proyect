package DAO;

//Librerías
import Formatos.ManejadorTabla;
import Modelo.Ventas;
import Modelo.Productos;
import Formatos.Mensajes;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class CRUDventas extends ConectarBD {

    String[] titulo = {"ID", "CÓDIGO", "NOMBRE", "MODELO", "MARCA", "CATEGORÍA", "CANTIDAD", "PRECIO"};
    DefaultTableModel modelo = new DefaultTableModel(null, titulo);
    DefaultTableModel modelo2 = new DefaultTableModel(null, titulo);

    public double sub_total, igv, total = 0;

    public CRUDventas() {
    }

    //Método que recibe un JTable y JLabel y muestra los registros en el JTable
    public void MostrarProductosEnTabla(JTable tabla) {
        tabla.setModel(modelo2);
        ManejadorTabla.FormatoTablaVentas(tabla);
    }

    public void limpiarTabla(JTable tabla) {
        for (int i = 0; i < tabla.getRowCount(); i++) {
            modelo.removeRow(i);
            modelo2.removeRow(i);
            i = i - 1;
        }
    }

    public void AgregarFilaEnTabla(Object row) {

        modelo.addRow((Object[]) row);
    }
    
    public void AgregarFilaEnTabla2(Object row) {

        modelo2.addRow((Object[]) row);
    }

    public Double CalcularSubTotal() {

        sub_total = 0;
        for (int i = 0; i < modelo.getRowCount(); i++) {
            sub_total = sub_total + (Double.parseDouble(modelo.getValueAt(i, 6).toString()) * Double.parseDouble(modelo.getValueAt(i, 7).toString()));
        }
        return sub_total;
    }

    public Double CalcularIGV() {
        igv = sub_total * 0.18;
        igv = Math.round(igv * 100.0) / 100.0;
        return igv;
    }

    public Double CalcularTotal() {
        total = sub_total + (sub_total * 0.18);
        return total;
    }

    public Productos ObtenerRegistroPro(int idcat) {
        Productos pro = null; //No hay datos asociados al objeto
        try {
            rs = st.executeQuery("SELECT id, codigo, nombre, modelo, marca, id_categoria, cantidad, precio, descripcion FROM productos WHERE estado = 1 AND id = " + idcat);
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
            } else {
                pro = null;
            }
            rs.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el producto." + e);
        }
        return pro;
    }

    //Insertando datos en la tabla ventas
    public void RegistrarVenta(Ventas ven) {
        try {
            ps = conexion.prepareStatement("INSERT INTO ventas (id_cliente, id_empleado, met_pago, igv, total, fecha, referencia, nota, estado)"
                    + " values(?,?,?,?,?,?,?,?,1);");
            ps.setInt(1, ven.getId_cliente());
            ps.setInt(2, ven.getId_empleado());
            ps.setString(3, ven.getMet_pago());
            ps.setDouble(4, igv);
            ps.setDouble(5, total);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(6, sdf.format(ven.getFecha()));
            ps.setString(7, ven.getReferencia());
            ps.setString(8, ven.getNota());
            ps.executeUpdate();
            ps.close();
            Mensajes.M1("¡La venta se ha registrado correctamente!");

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede registrar la venta." + e);
        }

        //Insertando datos en la tabla detalle_ventas
        String id_nuevaVenta = "";

        //Consultando ID de Venta recién creada
        try {

            String sql = "SELECT * FROM ventas ORDER BY id ASC";
            st = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = st.executeQuery(sql);

            rs.last();
            String[] ventas = new String[1];
            ventas[0] = rs.getString(1);
            id_nuevaVenta = ventas[0];

        } catch (Exception e) {
            System.err.println("Fallo al cargar Driver: " + e.getMessage());
        }

        //Insertar cada ítem en la tabla detalle_ventas
        for (int i = 0; i < modelo.getRowCount(); i++) {

            String insert4 = "INSERT INTO detalle_ventas(id_venta, id_producto, cantidad, precio) values (?,?,?,?)";

            try {
                ps = conexion.prepareStatement(insert4);
                ps.setString(1, id_nuevaVenta);
                ps.setString(2, modelo.getValueAt(i, 0).toString());
                ps.setString(3, modelo.getValueAt(i, 6).toString());
                ps.setString(4, modelo.getValueAt(i, 7).toString());
                ps.executeUpdate();
            } catch (Exception e) {
                System.err.println("Fallo al cargar Driver: " + e.getMessage());
            }
        }
    }
}
