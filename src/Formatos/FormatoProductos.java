package Formatos;

//Librerías
import Modelo.Productos;
import Principal.Main;
import Vista.FormProductos;

public class FormatoProductos {

    public static void Presentacion(FormProductos fp) {
        fp.setTitle("Mantenimiento de Productos");
    }

    public static void LimpiarEntradas(FormProductos fp) {
        fp.jtxtCodigo.setText("");
        fp.jtxtNombre.setText("");
        fp.jtxtMarca.setText("");
        fp.jtxtModelo.setText("");
        fp.jspPrecio.setValue(0);
        fp.jspStock.setValue(0);
        fp.jtxtaDescripcion.setText("");
        fp.jtxtCodigo.requestFocus();
    }

    public static void Estado1(FormProductos fp) {
        fp.jbtnRegistrar.setEnabled(true);
        fp.jbtnConsultar.setEnabled(true);
        fp.jbtnActualizar.setEnabled(false);
        fp.jbtnEliminar.setEnabled(false);
    }

    public static void Estado2(FormProductos fp) {
        fp.jbtnRegistrar.setEnabled(false); //setEnabled(): habilita un objeto
        fp.jbtnConsultar.setEnabled(true);
        fp.jbtnActualizar.setEnabled(true);
        fp.jbtnEliminar.setEnabled(true);
    }

    public static Productos LeerProductos(FormProductos fp) {
        Productos pro = new Productos();
        pro.setCodigo(fp.jtxtCodigo.getText());
        pro.setNombre(fp.jtxtNombre.getText());
        pro.setModelo(fp.jtxtModelo.getText());
        pro.setMarca(fp.jtxtMarca.getText());
        //Lee los ID de las categorías
        pro.setCategoria(Main.Listacat.BuscarIdCategoria(fp.jcbxCategorias.getSelectedItem().toString()));
        pro.setStock(Integer.parseInt(fp.jspStock.getValue().toString()));
        pro.setPrecio(Double.parseDouble(fp.jspPrecio.getValue().toString()));
        pro.setDescripcion(fp.jtxtaDescripcion.getText());
        return pro;
    }
}
