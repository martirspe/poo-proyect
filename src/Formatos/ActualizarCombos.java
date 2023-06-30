package Formatos;

//Librerías
import javax.swing.JComboBox;
import Principal.Main;

public class ActualizarCombos {

    public static void ActualizarComboCategoria(JComboBox combo) {
        for (int i = 0; i < Main.Listacat.CantidadCategorias(); i++) {
            combo.addItem(Main.Listacat.RecuperarCategoria(i).getNombre());
        }
    }

    public static void ActualizarComboVendedor(JComboBox combo) {
        for (int i = 0; i < Main.Listaven.CantidadVendedores(); i++) {
<<<<<<< HEAD
            combo.addItem(Main.Listaven.RecuperarVendedor(i).getNombre() + " " + Main.Listaven.RecuperarVendedor(i).getApellidos());
=======
            combo.addItem(Main.Listaven.RecuperarVendedor(i).getNombre());
            combo.addItem(Main.Listaven.RecuperarVendedor(i).getApellidos());
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
        }
    }

}
