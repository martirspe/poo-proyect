package DAO;

import Formatos.ManejadorTabla;
import Formatos.Mensajes;
import Modelo.Productos;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CRUDstock extends ConectarBD  {
    public void ObtenerStockProductos(Productos stock,JTable tabla) {
        try {
            String[] titulo = {"No.", "ID", "Código", "Nombre", "Modelo", "Marca", "Categoría", "Stock", "Precio", "Descripción"};
            DefaultTableModel modelo = new DefaultTableModel(null, titulo);
            tabla.setModel(modelo);
            String sWhere = ""; 
            
            if(stock.getCategoria()!= null && stock.getCategoria() > 0){
                sWhere += " AND categoria = "+stock.getCategoria();
            }
            if(!stock.getCodigo().isEmpty()){
                sWhere += " AND codigo LIKE '%"+stock.getCodigo()+"%'";
            }
            if(!stock.getMarca().isEmpty()){
                sWhere += " AND marca LIKE '%"+stock.getMarca()+"%'";
            }
            if(!stock.getNombre().isEmpty()){
                sWhere += " AND nombre LIKE '%"+stock.getNombre()+"%'";
            }
            if(!stock.getModelo().isEmpty()){
                sWhere += " AND modelo LIKE '%"+stock.getModelo()+"%'";
            }
            if(stock.getPrecio()!= null && stock.getPrecio()> 0){
                sWhere += " AND precio = "+stock.getPrecio();
            }
            
            rs = st.executeQuery("SELECT id, codigo, nombre, modelo, marca, categoria, cantidad, precio, descripcion FROM productos WHERE estado = 1 " + sWhere);
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
            rs.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el registro." + e);
        }
        //return pro;
    }
}
