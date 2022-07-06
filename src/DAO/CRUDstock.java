package DAO;

import Formatos.Mensajes;
import Modelo.Productos;

public class CRUDstock extends ConectarBD  {
    public Productos ObtenerStockProductos(Productos stock) {
        Productos pro = null; //No hay datos asociados al objeto
        try {
            String sWhere = ""; 
            
            if(stock.getCategoria() > 0){
                sWhere += "AND categoria = "+stock.getCategoria();
            }
            if(Integer.parseInt(stock.getCodigo()) > 0){
                sWhere += "AND id = "+stock.getCodigo();
            }
            
            rs = st.executeQuery("SELECT id, codigo, nombre, modelo, marca, categoria, cantidad, precio, descripcion FROM productos WHERE estado = 1" + sWhere);
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
            Mensajes.M1("ERROR: no se puede recuperar el registro." + e);
        }
        return pro;
    }
}
