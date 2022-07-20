package DAO;

import Formatos.ManejadorTabla;
import Formatos.Mensajes;
import Modelo.DetalleVenta;
import Modelo.Productos;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUDreporteVentas extends ConectarBD{
    public CRUDreporteVentas() {
    }
    
    public void MostrarVentasEnTabla(JTable tabla){
        String[] titulo = {"N","ID", "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        tabla.setModel(modelo);
        try {
            rs = st.executeQuery(""
                    + "SELECT dv.id, p.nombre, dv.cantidad, dv.precio, dv.total FROM detalle_ventas dv "
                    + "inner join productos p on (p.id = dv.producto )");
            int cont = 0;
            while (rs.next()) { //netx(): recupera un registro de la consulta si existe.
                cont++;
                DetalleVenta dv = new DetalleVenta();
                Productos pro = new Productos();
                pro.setNombre(rs.getString(2));
                dv.setId(rs.getInt(1));
                dv.setProducto(pro);
                dv.setCantidad(rs.getInt(3));
                dv.setPrecio(rs.getDouble(4));
                dv.setTotal(rs.getDouble(5));
           
                modelo.addRow(dv.RegistroDetalleVenta(cont));
            }

            ManejadorTabla.FormatoTablaReporteVentas(tabla);
            conexion.close();

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla detalle ventas." + e);
        }
    }
    
        
}
