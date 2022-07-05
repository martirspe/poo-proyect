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
        AnchoColumnas(tabla, 0, 100);
        JustificarCelda(tabla, 0);
        AnchoColumnas(tabla, 1, 100);
        JustificarCelda(tabla, 1);
        AnchoColumnas(tabla, 2, 250);
        JustificarCelda(tabla, 2);
        AnchoColumnas(tabla, 3, 500);
        JustificarCelda(tabla, 3);
    }
}
