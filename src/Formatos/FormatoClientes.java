package Formatos;

//Librerías
import Modelo.Clientes;
import Vista.FormClientes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FormatoClientes {

    public static void Presentacion(FormClientes fcli) {
        fcli.setTitle("Mantenimiento de Clientes/Empresas");
    }

    public static void LimpiarEntradas(FormClientes fcli) {
        fcli.jtxtId.setText("");
        fcli.jcbxTipoDoc.setSelectedIndex(0);
        fcli.jtxtNumDoc.setText("");
        fcli.jtxtNombreRazon.setText("");
        fcli.jtxtApellidos.setText("");
        fcli.jtxtDireccion.setText("");
        fcli.jtxtCorreo.setText("");
        fcli.jtxtCelular.setText("");
        fcli.jcbxSexo.setSelectedIndex(0);
        fcli.jtxtNumDoc.requestFocus();
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
        if (validaciones(fcli.jtxtCorreo.getText(), fcli.jcbxTipoDoc.getSelectedItem().toString(), fcli.jtxtNumDoc.getText(), fcli.jtxtCelular.getText())) {
            cli.setTipo_doc(fcli.jcbxTipoDoc.getSelectedItem().toString());
            cli.setNum_doc(fcli.jtxtNumDoc.getText());
            cli.setNombre(fcli.jtxtNombreRazon.getText());
            cli.setApellidos(fcli.jtxtApellidos.getText());
            cli.setDireccion(fcli.jtxtDireccion.getText());
            cli.setEmail(fcli.jtxtCorreo.getText());
            cli.setMovil(fcli.jtxtCelular.getText());
            cli.setSexo(fcli.jcbxSexo.getSelectedItem().toString());
        }else{
            cli = null;
        }

        return cli;
    }

    private  static boolean validaciones(String correo, String TipoDoc, String numDoc, String Telefono) {

        Boolean validaEmail;
        validaEmail = correo(correo);
        Boolean validaNumDoc;
        validaNumDoc = numDoc(TipoDoc, numDoc);
        Boolean validaTel;
        validaTel = telefono(Telefono);
        if (!validaEmail) {
            Mensajes.M4("Error Email - Email No Valido");
            return false;
        } else if (!validaNumDoc) {
            Mensajes.M4("Error Numero de Documento - Debe tener en cuenta los caracteres segun el tipo de documento.");
            return false;
        } else if (!validaTel) {
            Mensajes.M4("Error Telefono - El formato Telfono en PE es de 9 Digitos");
            return false;
        } else {
            return true;
        }
        //return false;
    }

    //correo
    private static boolean correo(String dato) {
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(dato);
        return mather.find() == true;
    }

    private static boolean telefono(String dato) {
        return dato.length() <= 9;
        

    }

    private static boolean numDoc(String tipo, String dato) {
        switch (tipo) {
            case "DNI":
                if (dato.length() >= 9) {
                    return false;
                }
            //break;
            case "RUC":
                if (dato.length() >= 12) {
                    return false;
                }
            //break;
            default:
                return true;
        }
    }

}
