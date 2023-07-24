package Formatos;
//librerias

import javax.swing.JOptionPane;

public class Mensajes {

    public static void M1(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static int M2(String mensaje) {

        String result = JOptionPane.showInputDialog(mensaje);
        int res_int = 0;

        if (result != null) {
            res_int = Integer.parseInt(result);

        }

        return res_int;
    }

    public static int M3(String titulo, String mensaje) {
        return JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.OK_CANCEL_OPTION);
    }

    public static void M4(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", 0);
    }
}
