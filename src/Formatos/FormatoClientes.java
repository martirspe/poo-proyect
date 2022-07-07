package Formatos;

//Librerías
import Modelo.Clientes;
import Vista.FormClientes;

public class FormatoClientes {

    public static void Presentacion(FormClientes fcli) {
        fcli.setTitle("Mantenimiento de Clientes/Empresas");
    }

    public static void LimpiarEntradas(FormClientes fcli) {
        fcli.jtxtId.setText("");
        fcli.jcbxTipoDoc.setSelectedIndex(0);
        fcli.jspNumDoc.setValue(0);
        fcli.jtxtNombreRazon.setText("");
        fcli.jtxtApellidos.setText("");
        fcli.jtxtDireccion.setText("");
        fcli.jtxtCorreo.setText("");
        fcli.jspCelular.setValue(0);
        fcli.jcbxSexo.setSelectedIndex(0);
        fcli.jspNumDoc.requestFocus();
    }

    public static void Estado1(FormClientes fcli) {
        fcli.jbtnRegistrar.setEnabled(true);
        fcli.jbtnConsultar.setEnabled(true);
        fcli.jbtnActualizar.setEnabled(false);
        fcli.jbtnEliminar.setEnabled(false);
    }

    public static void Estado2(FormClientes fcli) {
        fcli.jbtnRegistrar.setEnabled(false); //setEnabled(): habilita un objeto
        fcli.jbtnConsultar.setEnabled(true);
        fcli.jbtnActualizar.setEnabled(true);
        fcli.jbtnEliminar.setEnabled(true);
    }

    public static Clientes LeerClientes(FormClientes fcli) {
        Clientes cli = new Clientes();
        cli.setTipo_doc(fcli.jcbxTipoDoc.getSelectedItem().toString());
        cli.setNum_doc(Integer.parseInt(fcli.jspNumDoc.getValue().toString()));
        cli.setNombre(fcli.jtxtNombreRazon.getText());
        cli.setApellidos(fcli.jtxtApellidos.getText());
        cli.setDireccion(fcli.jtxtDireccion.getText());
        cli.setEmail(fcli.jtxtCorreo.getText());
        cli.setMovil(Integer.parseInt(fcli.jspCelular.getValue().toString()));
        cli.setSexo(fcli.jcbxSexo.getSelectedItem().toString());
        return cli;
    }
}
