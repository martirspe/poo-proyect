package Formatos;

//Librerías
import Modelo.Productos;
import Principal.Main;
import Vista.FormStock;

public class FormatoStock {

    public static void Presentacion(FormStock fs) {
        fs.setTitle("Gestión de Stock");
    }

    public static void LimpiarEntradas(FormStock fs) {
        fs.field_codigo.setText("");
        fs.fied_nombre.setText("");
        fs.field_modelo.setText("");
        fs.fiel_marca.setText("");
        fs.field_precio.setText("");
        fs.jcbxCategorias.setSelectedIndex(0);
    }

    public static Productos LeerProductos(FormStock fs) {
        Productos pro = new Productos();
        pro.setCodigo(fs.field_codigo.getText());
        pro.setNombre(fs.fied_nombre.getText());
        pro.setModelo(fs.field_modelo.getText());
        pro.setMarca(fs.fiel_marca.getText());
        //Lee los ID de las categorías
        pro.setCategoria(Main.Listacat.BuscarIdCategoria(fs.jcbxCategorias.getSelectedItem().toString()));
        //pro.setPrecio(Double.parseDouble(fs.field_precio.getText()));

        return pro;
    }
}
