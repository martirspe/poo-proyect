package DAO;

//Librerías
import Modelo.Ventas;
import Modelo.DetalleVenta;
import Formatos.Mensajes;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Formatos.ManejadorTabla;
import java.text.SimpleDateFormat;

public class CRUDventas extends ConectarBD {

    public CRUDventas() {
    }
    DetalleVenta dtven = new DetalleVenta();

    //Método que recibe un JTable y JLabel y miuestra los registros de la tabla en el JTable
    public void MostrarVentasEnTabla(JTable tabla) {
        String[] titulo = {"No.", "ID", "Cliente", "Vendedor", "M. Pago", "IGV", "Total", "Fecha", "Referencia"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        tabla.setModel(modelo);
        try {
            rs = st.executeQuery("SELECT id, id_cliente, id_empleado, met_pago, igv, total, fecha, referencia FROM ventas WHERE estado = 1");
            int cont = 0;
            while (rs.next()) {
                cont++;
                Ventas ven = new Ventas();
                ven.setId_venta(rs.getInt(1));
                ven.setId_cliente(rs.getInt(2));
                ven.setId_empleado(rs.getInt(3));
                ven.setMet_pago(rs.getString(4));
                ven.setIgv(rs.getDouble(5));
                ven.setTotal(rs.getDouble(6));
                ven.setFecha(rs.getDate(7));
                ven.setReferencia(rs.getString(8));
                modelo.addRow(ven.RegistroVentas(cont));
            }

            ManejadorTabla.FormatoTablaVentas(tabla);
            conexion.close();

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla ventas." + e);
        }

    }

    //Insertando datos en la tabla ventas
    public void RegistrarVenta(Ventas ven) {
        try {
            ps = conexion.prepareStatement("INSERT INTO ventas (id_cliente, id_empleado, met_pago, igv, total, fecha, referencia, nota, estado)"
                    + " values(?,?,?,?,?,?,?,?,?,?,1);");
            ps.setInt(1, ven.getId_cliente());
            ps.setInt(2, ven.getId_empleado());
            ps.setString(3, ven.getMet_pago());
            ps.setDouble(4, ven.getIgv());
            ps.setDouble(5, ven.getTotal());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(6, sdf.format(ven.getFecha()));
            ps.setString(7, ven.getReferencia());
            ps.setString(8, ven.getNota());
            ps.executeUpdate();
            ps.close();
//            Mensajes.M1("¡El producto se ha registrado correctamente!");

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede registrar la venta." + e);
        }
    }

    //Insertando datos en la tabla detalle_ventas
    public void RegistrarDetalleVenta(DetalleVenta ven) {
        try {
            ps = conexion.prepareStatement("INSERT INTO detalle_ventas (id_venta, producto, cantidad, descuento, precio)"
                    + " values(?,?,?,?,?);");
            ps.setInt(1, dtven.getId_venta());
            ps.setInt(2, dtven.getId_producto());
            ps.setInt(2, dtven.getCantidad());
            ps.setDouble(2, dtven.getDescuento());
            ps.setDouble(2, dtven.getPrecio());
            ps.executeUpdate();
            ps.close();
            Mensajes.M1("¡La venta se ha registrado correctamente!");

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede registrar la venta." + e);
        }
    }

}
