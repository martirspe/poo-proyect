package Formatos;

//Librerías
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

public class ManejadorTabla {

    //Metodo que especifica un ancho de las columnas de tabla    
    public static void AnchoColumnas(JTable t, int numcolumna, int ancho) {
        TableColumn column;
        column = t.getColumnModel().getColumn(numcolumna);
        column.setPreferredWidth(ancho);
    }

    //Método que justifica los datos de una columna
    public static void JustificarCelda(JTable t, int numcolumna) {
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        t.getColumnModel().getColumn(numcolumna).setCellRenderer(modelocentrar);
    }

    //Método que la da formato a la JTable del tabla Categorías
    public static void FormatoTablaCategorias(JTable tabla) {
        AnchoColumnas(tabla, 0, 100);
        JustificarCelda(tabla, 0);
        AnchoColumnas(tabla, 1, 100);
        JustificarCelda(tabla, 1);
        AnchoColumnas(tabla, 2, 100);
        AnchoColumnas(tabla, 3, 250);
    }

    //Método que la da formato a la JTable del tabla Productos
    public static void FormatoTablaProductos(JTable tabla) {
        AnchoColumnas(tabla, 0, 10);
        JustificarCelda(tabla, 0);
        AnchoColumnas(tabla, 1, 10);
        JustificarCelda(tabla, 1);
        AnchoColumnas(tabla, 2, 40);
        JustificarCelda(tabla, 2);
        AnchoColumnas(tabla, 3, 100);
        AnchoColumnas(tabla, 4, 50);
        JustificarCelda(tabla, 4);
        AnchoColumnas(tabla, 5, 50);
        JustificarCelda(tabla, 5);
        AnchoColumnas(tabla, 6, 50);
        JustificarCelda(tabla, 6);
        AnchoColumnas(tabla, 7, 10);
        JustificarCelda(tabla, 7);
        AnchoColumnas(tabla, 8, 50);
        AnchoColumnas(tabla, 9, 200);
    }

    //Método que la da formato a la JTable del tabla Stock
    public static void FormatoTablaStock(JTable tabla) {
        AnchoColumnas(tabla, 0, 10);
        JustificarCelda(tabla, 0);
        AnchoColumnas(tabla, 1, 10);
        JustificarCelda(tabla, 1);
        AnchoColumnas(tabla, 2, 20);
        JustificarCelda(tabla, 2);
        AnchoColumnas(tabla, 3, 60);
        AnchoColumnas(tabla, 4, 40);
        JustificarCelda(tabla, 4);
        AnchoColumnas(tabla, 5, 30);
        JustificarCelda(tabla, 5);
        AnchoColumnas(tabla, 6, 30);
        JustificarCelda(tabla, 6);
        AnchoColumnas(tabla, 7, 10);
        JustificarCelda(tabla, 7);
        AnchoColumnas(tabla, 8, 10);
        JustificarCelda(tabla, 8);
        AnchoColumnas(tabla, 9, 200);
    }

    //Método que la da formato a la JTable del tabla Clientes
    public static void FormatoTablaClientes(JTable tabla) {
        AnchoColumnas(tabla, 0, 100);
        JustificarCelda(tabla, 0);
        AnchoColumnas(tabla, 1, 100);
        JustificarCelda(tabla, 1);
        AnchoColumnas(tabla, 2, 100);
        JustificarCelda(tabla, 2);
        AnchoColumnas(tabla, 3, 250);
        JustificarCelda(tabla, 3);
        AnchoColumnas(tabla, 4, 250);
        JustificarCelda(tabla, 4);
        AnchoColumnas(tabla, 5, 250);
        JustificarCelda(tabla, 5);
        AnchoColumnas(tabla, 6, 350);
        JustificarCelda(tabla, 6);
        AnchoColumnas(tabla, 7, 250);
        JustificarCelda(tabla, 7);
        AnchoColumnas(tabla, 8, 250);
        JustificarCelda(tabla, 8);
        AnchoColumnas(tabla, 9, 500);
        JustificarCelda(tabla, 9);
    }
    
    //Método que la da formato a la JTable del tabla Clientes
    public static void FormatoTablaVentas(JTable tabla) {
        AnchoColumnas(tabla, 0, 100);
        JustificarCelda(tabla, 0);
        AnchoColumnas(tabla, 1, 100);
        JustificarCelda(tabla, 1);
        AnchoColumnas(tabla, 2, 100);
        JustificarCelda(tabla, 2);
        AnchoColumnas(tabla, 3, 250);
        JustificarCelda(tabla, 3);
        AnchoColumnas(tabla, 4, 250);
        JustificarCelda(tabla, 4);
    }
    
<<<<<<< HEAD
<<<<<<< HEAD
    //Método que la da formato a la JTable del tabla Detalle de Ventas
    public static void FormatoTablaDetalleVentas(JTable tabla) {
        AnchoColumnas(tabla, 0, 50);
        JustificarCelda(tabla, 0);
        AnchoColumnas(tabla, 1, 50);
        JustificarCelda(tabla, 1);
        AnchoColumnas(tabla, 2, 150);
        JustificarCelda(tabla, 2);
        AnchoColumnas(tabla, 3, 90);
        JustificarCelda(tabla, 3);
        AnchoColumnas(tabla, 4, 100);
        JustificarCelda(tabla, 4);
        AnchoColumnas(tabla, 5, 100);
        JustificarCelda(tabla, 5);
        AnchoColumnas(tabla, 6, 250);
        JustificarCelda(tabla, 6);
        AnchoColumnas(tabla, 7, 200);
        JustificarCelda(tabla, 7);
        AnchoColumnas(tabla, 8, 130);
        JustificarCelda(tabla, 8);
=======
=======
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    public static void FormatoTablaReporteVentas(JTable tabla) {
        AnchoColumnas(tabla, 0, 100);
        JustificarCelda(tabla, 0);
        AnchoColumnas(tabla, 1, 100);
        JustificarCelda(tabla, 1);
        AnchoColumnas(tabla, 2, 100);
        JustificarCelda(tabla, 2);
        AnchoColumnas(tabla, 3, 250);
        JustificarCelda(tabla, 3);
        AnchoColumnas(tabla, 4, 250);
        JustificarCelda(tabla, 4);
        AnchoColumnas(tabla, 5, 250);
        JustificarCelda(tabla, 5);
    }
    
    public static void FormatoTablaReporteVentasCli(JTable tabla) {
        AnchoColumnas(tabla, 0, 100);
        JustificarCelda(tabla, 0);
        AnchoColumnas(tabla, 1, 100);
        JustificarCelda(tabla, 1);
        AnchoColumnas(tabla, 2, 100);
        JustificarCelda(tabla, 2);
        AnchoColumnas(tabla, 3, 250);
        JustificarCelda(tabla, 3);
        AnchoColumnas(tabla, 4, 250);
        JustificarCelda(tabla, 4);
        AnchoColumnas(tabla, 5, 250);
        JustificarCelda(tabla, 5);
        AnchoColumnas(tabla, 6, 250);
        JustificarCelda(tabla, 6);
<<<<<<< HEAD
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
=======
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    }
}
