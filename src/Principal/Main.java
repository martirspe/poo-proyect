package Principal;

//Librerías
import Vista.*;
import Controlador.*;
import Colecciones.*;

public class Main {

    //Categorías
    public static FormCategorias fcat;
    public static ControladorCategorias ccat;

    //Clientes
    public static FormClientes fcli;
    public static ControladorClientes ccli;

    //Productos
    public static FormProductos fpro;
    public static ControladorProductos cpro;

    //Stock
    public static FormStock fstock;
    public static ControladorStock cstock;

    //Ventas
    public static FormVentas fventas;
    public static ControladorVentas cventas;

    //Reporte de Ventas
    public static FormReporteVentas rventas;
    public static ControladorDetalleVenta crventas;

    //Formulario Menú
    public static FormMenu fm;
    public static ControladorMenu cfm;
    
        //Formulario Menú
    public static FormReporteVentas FRventas;
    public static ControladorReporteVentas crventas;


    //Colecciones de datos
    public static ListaCategorias Listacat;
    public static ListaVendedores Listaven;

    public static void main(String[] args) {
        fm = new FormMenu();
        cfm = new ControladorMenu(fm);
    }

}
