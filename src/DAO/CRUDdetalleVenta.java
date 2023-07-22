package DAO;

import Formatos.ManejadorTabla;
import Formatos.Mensajes;
import Modelo.DetalleVenta;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUDdetalleVenta extends ConectarBD {

    public CRUDdetalleVenta() {
    }

    public void MostrarVentasEnTabla(JTable tabla, String dateInit, String dateEnd) {
        String[] titulo = {"#", "ID", "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL", "VENDEDOR", "CLIENTE", "FECHA VENTA"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        tabla.setModel(modelo);
        String swhere = "";
        if (!dateInit.isEmpty()) {
            swhere += "WHERE v.fecha BETWEEN " + "'" + dateInit + "'";
            if (!dateEnd.isEmpty()) {
                swhere += " AND " + "'" + dateEnd + "'";
            }
        }
        try {
            rs = st.executeQuery(""
                    + "SELECT dv.id, p.nombre, dv.cantidad, dv.precio, (dv.cantidad * dv.precio) AS total, concat(e.nombre, \" \", e.apellidos) AS vendedor, concat(c.nombre, \" \", c.apellidos) AS cliente, v.fecha AS fecha_venta FROM detalle_ventas dv "
                    + "INNER JOIN productos p ON (p.id = dv.id_producto) "
                    + "INNER JOIN ventas v ON (v.id = dv.id_venta) "
                    + "INNER JOIN empleados e ON (e.id = v.id_empleado) "
                    + "INNER JOIN clientes c ON (c.id = v.id_cliente) "
                    + swhere);
            int cont = 0;
            while (rs.next()) { //netx(): recupera un registro de la consulta si existe.
                cont++;
                DetalleVenta dv = new DetalleVenta();
                dv.setId(rs.getInt(1));
                dv.setProducto(rs.getString(2));
                dv.setCantidad(rs.getInt(3));
                dv.setPrecio(rs.getDouble(4));
                dv.setTotal(rs.getDouble(5));
                dv.setVendedor(rs.getString(6));
                dv.setCliente(rs.getString(7));
                dv.setFecha(rs.getString(8));

                modelo.addRow(dv.RegistroDetalleVenta(cont));
            }

            ManejadorTabla.FormatoTablaDetalleVentas(tabla);
            conexion.close();

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla detalle ventas." + e);
        }
    }

    public void MostrarVentasVendedorEnTabla(JTable tabla, int idVen, String dateInit, String dateEnd) {
        String[] titulo = {"#", "ID", "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL", "VENDEDOR", "CLIENTE", "FECHA VENTA"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        tabla.setModel(modelo);
        String swhere = "";
        if (!dateInit.isEmpty()) {
            swhere += "AND v.fecha BETWEEN " + "'" + dateInit + "'" + "";
            if (!dateEnd.isEmpty()) {
                swhere += " AND " + "'" + dateEnd + "'";
            }
        }

        try {
            rs = st.executeQuery("SELECT id FROM empleados WHERE estado = 1 AND id = " + idVen);

            if (rs.next()) {
                try {
                    rs = st.executeQuery(""
                            + "SELECT dv.id, p.nombre, dv.cantidad, dv.precio, (dv.cantidad * dv.precio) AS total, concat(e.nombre, \" \", e.apellidos) AS vendedor, concat(c.nombre, \" \", c.apellidos) AS cliente, v.fecha AS fecha_venta FROM detalle_ventas dv "
                            + "INNER JOIN productos p ON (p.id = dv.id_producto) "
                            + "INNER JOIN ventas v ON (v.id = dv.id_venta) "
                            + "INNER JOIN empleados e ON (e.id = v.id_empleado) "
                            + "INNER JOIN clientes c ON (c.id = v.id_cliente) "
                            + "WHERE v.id_empleado = " + idVen + " "
                            + swhere);
                    int cont = 0;
                    while (rs.next()) { //netx(): recupera un registro de la consulta si existe.
                        cont++;
                        DetalleVenta dv = new DetalleVenta();
                        dv.setId(rs.getInt(1));
                        dv.setProducto(rs.getString(2));
                        dv.setCantidad(rs.getInt(3));
                        dv.setPrecio(rs.getDouble(4));
                        dv.setTotal(rs.getDouble(5));
                        dv.setVendedor(rs.getString(6));
                        dv.setCliente(rs.getString(7));
                        dv.setFecha(rs.getString(8));

                        modelo.addRow(dv.RegistroDetalleVentaVendedor(cont));
                    }

                    ManejadorTabla.FormatoTablaDetalleVentas(tabla);
                    conexion.close();

                } catch (Exception e) {
                    Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla detalle ventas." + e);
                }

            } else {
                Mensajes.M1("El vendedor con ID " + idVen + " no existe en la base de datos");
            }

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla detalle ventas." + e);
        }
    }

    public void MostrarVentasClienteEnTabla(JTable tabla, int idCli, String dateInit, String dateEnd) {
        String[] titulo = {"#", "ID", "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL", "VENDEDOR", "CLIENTE", "FECHA VENTA"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        tabla.setModel(modelo);
        String swhere = "";
        if (!dateInit.isEmpty()) {
            swhere += "AND v.fecha BETWEEN " + "'" + dateInit + "'";
            if (!dateEnd.isEmpty()) {
                swhere += " AND " + "'" + dateEnd + "'";
            }
        }

        try {
            rs = st.executeQuery("SELECT id FROM clientes WHERE estado = 1 AND id = " + idCli);

            if (rs.next()) {

                try {
                    rs = st.executeQuery(""
                            + "SELECT dv.id, p.nombre, dv.cantidad, dv.precio, (dv.cantidad * dv.precio) AS total, concat(e.nombre, \" \", e.apellidos) AS vendedor, concat(c.nombre, \" \", c.apellidos) AS cliente, v.fecha AS fecha_venta FROM detalle_ventas dv "
                            + "INNER JOIN productos p ON (p.id = dv.id_producto) "
                            + "INNER JOIN ventas v ON (v.id = dv.id_venta) "
                            + "INNER JOIN empleados e ON (e.id = v.id_empleado) "
                            + "INNER JOIN clientes c ON (c.id = v.id_cliente) "
                            + "WHERE v.id_cliente = " + idCli + " "
                            + swhere);
                    int cont = 0;
                    while (rs.next()) { //netx(): recupera un registro de la consulta si existe.
                        cont++;
                        DetalleVenta dv = new DetalleVenta();
                        dv.setId(rs.getInt(1));
                        dv.setProducto(rs.getString(2));
                        dv.setCantidad(rs.getInt(3));
                        dv.setPrecio(rs.getDouble(4));
                        dv.setTotal(rs.getDouble(5));
                        dv.setVendedor(rs.getString(6));
                        dv.setCliente(rs.getString(7));
                        dv.setFecha(rs.getString(8));

                        modelo.addRow(dv.RegistroDetalleVentaCliente(cont));
                    }

                    ManejadorTabla.FormatoTablaDetalleVentas(tabla);
                    conexion.close();

                } catch (Exception e) {
                    Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla detalle ventas." + e);
                }

            } else {
                Mensajes.M1("El cliente con ID " + idCli + " no existe en la base de datos");
            }

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla detalle ventas." + e);
        }
    }

    public void MostrarVentasProductoEnTabla(JTable tabla, int idPro, String dateInit, String dateEnd) {
        String[] titulo = {"#", "ID", "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL", "VENDEDOR", "CLIENTE", "FECHA VENTA"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        tabla.setModel(modelo);
        String swhere = "";
        if (!dateInit.isEmpty()) {
            swhere += "AND v.fecha BETWEEN " + "'" + dateInit + "'";
            if (!dateEnd.isEmpty()) {
                swhere += " AND " + "'" + dateEnd + "'";
            }
        }

        try {
            rs = st.executeQuery("SELECT id FROM productos WHERE estado = 1 AND id = " + idPro);

            if (rs.next()) {
                try {
                    rs = st.executeQuery(""
                            + "SELECT dv.id, p.nombre, dv.cantidad, dv.precio, (dv.cantidad * dv.precio) AS total, concat(e.nombre, \" \", e.apellidos) AS vendedor, concat(c.nombre, \" \", c.apellidos) AS cliente, v.fecha AS fecha_venta FROM detalle_ventas dv "
                            + "INNER JOIN productos p ON (p.id = dv.id_producto) "
                            + "INNER JOIN ventas v ON (v.id = dv.id_venta) "
                            + "INNER JOIN empleados e ON (e.id = v.id_empleado) "
                            + "INNER JOIN clientes c ON (c.id = v.id_cliente) "
                            + "WHERE p.id = " + idPro + " "
                            + swhere);
                    int cont = 0;
                    while (rs.next()) { //netx(): recupera un registro de la consulta si existe.
                        cont++;
                        DetalleVenta dv = new DetalleVenta();
                        dv.setId(rs.getInt(1));
                        dv.setProducto(rs.getString(2));
                        dv.setCantidad(rs.getInt(3));
                        dv.setPrecio(rs.getDouble(4));
                        dv.setTotal(rs.getDouble(5));
                        dv.setVendedor(rs.getString(6));
                        dv.setCliente(rs.getString(7));
                        dv.setFecha(rs.getString(8));

                        modelo.addRow(dv.RegistroDetalleVentaProducto(cont));
                    }

                    ManejadorTabla.FormatoTablaDetalleVentas(tabla);
                    conexion.close();

                } catch (Exception e) {
                    Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla detalle ventas." + e);
                }

            } else {
                Mensajes.M1("El producto con ID " + idPro + " no existe en la base de datos");
            }

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla detalle ventas." + e);
        }
    }

}
