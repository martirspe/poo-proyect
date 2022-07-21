package DAO;

import Formatos.ManejadorTabla;
import Formatos.Mensajes;
import Modelo.Clientes;
import Modelo.DetalleVenta;
import Modelo.Empleados;
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
    
    public void MostrarVentasxClienteEnTabla(JTable tabla,int idCli){
        String[] titulo = {"N","CLIENTE","ID-VENTA", "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        tabla.setModel(modelo);
        
        try {
            rs = st.executeQuery(""
                    + "SELECT CONCAT(c.nombre, ' ', c.apellidos) as cliente,dv.id, p.nombre, dv.cantidad, dv.precio, dv.total FROM clientes c "
                    + "inner join ventas v on (v.cliente = c.id ) "
                    + "inner join detalle_ventas dv on (dv.venta = v.id ) "
                    + "inner join productos p on (p.id = dv.producto ) "
                    + "where c.id = "+idCli);
            int cont = 0;
            while (rs.next()) { //netx(): recupera un registro de la consulta si existe.
                cont++;
                DetalleVenta dv = new DetalleVenta();
                Productos pro = new Productos();
                Clientes cli = new Clientes();
                cli.setNombre(rs.getString(1));
                pro.setNombre(rs.getString(3));
                dv.setId(rs.getInt(2));
                dv.setProducto(pro);
                dv.setCliente(cli);
                dv.setCantidad(rs.getInt(4));
                dv.setPrecio(rs.getDouble(5));
                dv.setTotal(rs.getDouble(6));
           
                modelo.addRow(dv.RegistroDetalleVentaCliente(cont));
            }

            ManejadorTabla.FormatoTablaReporteVentasCli(tabla);
            conexion.close();

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla detalle ventas." + e);
        }
    }
    
    public void MostrarVentasxProdEnTabla(JTable tabla,int idpro){
        String[] titulo = {"N","ID", "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        tabla.setModel(modelo);
        
        try {
            rs = st.executeQuery(""
                    + "SELECT dv.id, p.nombre, dv.cantidad, "
                    + "dv.precio, dv.total FROM ventas v "
                    + "inner join detalle_ventas dv on (dv.venta = v.id ) "
                    + "inner join productos p on (p.id = dv.producto ) "
                    + "where p.id = "+idpro);
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
    
    public void MostrarVentasxEmplEnTabla(JTable tabla,int idven){
        String[] titulo = {"N","EMPLEADO","ID-VENTA", "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        tabla.setModel(modelo);
        
                try {
            rs = st.executeQuery(""
                    + "SELECT CONCAT(em.nombre, ' ', em.apellidos) as empleado,dv.id, p.nombre, dv.cantidad, dv.precio, dv.total FROM empleados em "
                    + "inner join ventas v on (v.empleado = em.id ) "
                    + "inner join detalle_ventas dv on (dv.venta = v.id ) "
                    + "inner join productos p on (p.id = dv.producto ) "
                    + "where em.id = "+idven);
            int cont = 0;
            while (rs.next()) { //netx(): recupera un registro de la consulta si existe.
                cont++;
                DetalleVenta dv = new DetalleVenta();
                Productos pro = new Productos();
                Empleados emp = new Empleados();
                emp.setNombre(rs.getString(1));
                pro.setNombre(rs.getString(3));
                dv.setId(rs.getInt(2));
                dv.setProducto(pro);
                dv.setEmpleados(emp);
                dv.setCantidad(rs.getInt(4));
                dv.setPrecio(rs.getDouble(5));
                dv.setTotal(rs.getDouble(6));
           
                modelo.addRow(dv.RegistroDetalleVentaEmple(cont));
            }

            ManejadorTabla.FormatoTablaReporteVentasCli(tabla);
            conexion.close();

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla detalle ventas." + e);
        }
    }
        
}
