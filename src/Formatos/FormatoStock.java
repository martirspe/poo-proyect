package Formatos;

//Librerías
import Modelo.Productos;
import Vista.FormStock;

public class FormatoStock {

    public static void Presentacion(FormStock fp) {
        fp.setTitle("Gestión y control de Stock");
    }

    public static void LimpiarEntradas(FormStock fp) {
        fp.jtxtId.setText("");
        fp.jtxtId.setText("");
        fp.jtxtNombre.setText("");
        fp.jtxtMarca.setText("");
        fp.jtxtModelo.setText("");
        fp.jspStock.setValue(0);
        fp.jspStock.requestFocus();
    }

    public static void Estado1(FormStock fp) {
        fp.jbtnConsultar.setEnabled(true);
        fp.jbtnActualizar.setEnabled(false);
    }

    public static void Estado2(FormStock fp) {
        fp.jbtnConsultar.setEnabled(false);
        fp.jbtnActualizar.setEnabled(true);
    }

    public static Productos LeerProductos(FormStock fp) {
        Productos pro = new Productos();
        pro.setCodigo(fp.jtxtId.getText());
        pro.setNombre(fp.jtxtNombre.getText());
        pro.setModelo(fp.jtxtModelo.getText());
        pro.setMarca(fp.jtxtMarca.getText());
        pro.setStock(Integer.parseInt(fp.jspStock.getValue().toString()));
        return pro;
    }
}
