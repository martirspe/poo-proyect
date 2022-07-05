package Principal;

//Librerías
import Vista.*;
import Controlador.*;
import Colecciones.*;

public class Main {

    //Categorías
    public static FormCategorias fcat;
    public static ControladorCategorias ccat;

    //Productos
    public static FormProductos fpro;
    public static ControladorProductos cpro;

    //Formulario Menú
    public static FormMenu fm;
    public static ControladorMenu cfm;

    //Colecciones de datos
    public static ListaCategorias Listacat;

    public static void main(String[] args) {
        fm = new FormMenu();
        cfm = new ControladorMenu(fm);
    }

}
