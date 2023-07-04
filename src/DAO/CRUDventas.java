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
    
    String[] titulo = {"ID", "CÓDIGO", "NOMBRE", "MODELO", "MARCA", "CATEGORÍA", "CANTIDAD", "PRECIO"};
    DefaultTableModel modelo = new DefaultTableModel(null, titulo);
    
    double sub_total, igv, total = 0;

    public CRUDventas() {
    }

    //Método que recibe un JTable y JLabel y muestra los registros en el JTable
    public void MostrarProductosEnTabla(JTable tabla) {
        
        tabla.setModel(modelo);
    }
    
    public void AgregarFilaEnTabla(Object row) {
        
        modelo.addRow((Object[]) row);
    }
    
    public Double CalcularSubTotal () {
            
            sub_total=0;
            for(int i = 0; i < modelo.getRowCount(); i++)
            {
                sub_total = sub_total + (Double.parseDouble(modelo.getValueAt(i, 6).toString()) * Double.parseDouble(modelo.getValueAt(i, 7).toString()));
            }
            return sub_total;
    }
    
    public Double CalcularIGV () {
        igv=sub_total*0.18;
        return igv;
    }
    
    public Double CalcularTotal () {
        total=sub_total+(sub_total*0.18);
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
            ps.setDouble(4, ven.getIgv());
            ps.setDouble(5, ven.getTotal());
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
