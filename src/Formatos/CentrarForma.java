package Formatos;

//Librerías
import java.awt.Dimension;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;

public class CentrarForma {

    public static void CFProductos(JDesktopPane pan, JInternalFrame inf) {
        Dimension desktopSize = pan.getSize();
        Dimension jifSize = inf.getSize();
        inf.setLocation((desktopSize.width - jifSize.width) / 2,
                (desktopSize.height - jifSize.height) / 2);
    }

    public static void CFCategorias(JDesktopPane pan, JInternalFrame inf) {
        Dimension desktopSize = pan.getSize();
        Dimension jifSize = inf.getSize();
        inf.setLocation((desktopSize.width - jifSize.width) / 2,
                (desktopSize.height - jifSize.height) / 2);
    }

    public static void CFClientes(JDesktopPane pan, JInternalFrame inf) {
        Dimension desktopSize = pan.getSize();
        Dimension jifSize = inf.getSize();
        inf.setLocation((desktopSize.width - jifSize.width) / 2,
                (desktopSize.height - jifSize.height) / 2);
    }

    public static void CFStock(JDesktopPane pan, JInternalFrame inf) {
        Dimension desktopSize = pan.getSize();
        Dimension jifSize = inf.getSize();
        inf.setLocation((desktopSize.width - jifSize.width) / 2,
                (desktopSize.height - jifSize.height) / 2);
    }

    public static void CFVentas(JDesktopPane pan, JInternalFrame inf) {
        Dimension desktopSize = pan.getSize();
        Dimension jifSize = inf.getSize();
        inf.setLocation((desktopSize.width - jifSize.width) / 2,
                (desktopSize.height - jifSize.height) / 2);
    }
    
    public static void CFDVentas(JDesktopPane pan, JInternalFrame inf) {
        Dimension desktopSize = pan.getSize();
        Dimension jifSize = inf.getSize();
        inf.setLocation((desktopSize.width - jifSize.width) / 2,
                (desktopSize.height - jifSize.height) / 2);
    }
}
