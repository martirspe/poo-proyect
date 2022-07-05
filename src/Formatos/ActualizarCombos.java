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

}
