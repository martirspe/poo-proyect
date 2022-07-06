package Formatos;

import Modelo.Productos;
import Principal.Main;
import Vista.FormStock;

public class FormatoStock {
    public static void Presentacion(FormStock fs) {
        fs.setTitle("Mantenimiento de Stock");
    }
    public static Productos LeerProductos(FormStock fs) {
        Productos pro = new Productos();
        pro.setCodigo(fs.field_codigo.getText());
        pro.setNombre(fs.fied_nombre.getText());
        pro.setModelo(fs.field_modelo.getText());
        pro.setMarca(fs.fiel_marca.getText());
        //Lee los ID de las categorías
        pro.setIdpro(Main.Listacat.BuscarIdCategoria(fs.jcbxCategorias.getSelectedItem().toString()));
        pro.setPrecio(Double.parseDouble(fs.field_precio.getText()));

        return pro;
    }
    
}
