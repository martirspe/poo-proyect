package Formatos;

//Librería
import Vista.FormCategorias;
import Modelo.Categorias;

public class FormatoCategorias {

    public static void Presentacion(FormCategorias fc) {
        fc.setTitle("Mantenimiento de Categorías");
    }

    public static void LimpiarEntradas(FormCategorias fc) {
        fc.jtxtId.setText("");
        fc.jtxtCategoria.setText("");
        fc.jtxtaDescripcion.setText("");
        fc.jtxtaDescripcion.setText("");
        fc.jtxtCategoria.requestFocus();
    }

    public static void Estado1(FormCategorias fc) {
        fc.jbtnRegistrar.setEnabled(true);
        fc.jbtnConsultar.setEnabled(true);
        fc.jbtnActualizar.setEnabled(false);
        fc.jbtnEliminar.setEnabled(false);
    }

    public static void Estado2(FormCategorias fc) {
        fc.jbtnRegistrar.setEnabled(false); //setEnabled(): habilita un objeto
        fc.jbtnConsultar.setEnabled(true);
        fc.jbtnActualizar.setEnabled(true);
        fc.jbtnEliminar.setEnabled(true);
    }

    public static Categorias LeerCategorias(FormCategorias fc) {
        Categorias cat = new Categorias();
        cat.setNombre(fc.jtxtCategoria.getText());
        cat.setDescripcion(fc.jtxtaDescripcion.getText());
        return cat;
    }
}
