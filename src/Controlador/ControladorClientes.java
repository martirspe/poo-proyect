package Controlador;

//Librerías
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Clientes;
import DAO.CRUDclientes;
import Formatos.FormatoClientes;
import Formatos.Mensajes;
import Vista.FormClientes;

public class ControladorClientes implements ActionListener {

    //Atributos
    FormClientes vista;
    Clientes cli;
    int idcli;
    CRUDclientes crud;

    public ControladorClientes(FormClientes fp) {
        vista = fp;
        this.vista.jbtnRegistrar.addActionListener(this);
        this.vista.jbtnConsultar.addActionListener(this);
        this.vista.jbtnActualizar.addActionListener(this);
        this.vista.jbtnEliminar.addActionListener(this);
        FormatoClientes.Presentacion(fp);
        FormatoClientes.Estado1(fp);
        crud = new CRUDclientes();
        crud.MostrarClientesEnTabla(vista.jtblDatos);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnRegistrar) {
            Clientes cli = FormatoClientes.LeerClientes(vista);
            CRUDclientes crud = new CRUDclientes();
            crud.InsertarClientes(cli);
            crud.MostrarClientesEnTabla(vista.jtblDatos);
            FormatoClientes.LimpiarEntradas(vista);
        }
        if (e.getSource() == vista.jbtnConsultar) {
            idcli = Mensajes.M2("Ingrese el ID del cliente a buscar");
            crud = new CRUDclientes();
            cli = crud.ObtenerRegistroCli(idcli);
            if (cli == null) {
                Mensajes.M1("El ID " + idcli + "no existe en la tabla clientes");
            } else {
<<<<<<< HEAD
                vista.jtxtId.setText(String.valueOf(cli.getId_cliente()));
=======
                vista.jtxtId.setText(String.valueOf(cli.getId()));
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
                vista.jcbxTipoDoc.setSelectedItem(cli.getTipo_doc());
                vista.jtxtNumDoc.setText(String.valueOf(cli.getNum_doc()));
                vista.jtxtNombreRazon.setText(cli.getNombre());
                vista.jtxtApellidos.setText(cli.getApellidos());
                vista.jtxtDireccion.setText(cli.getDireccion());
                vista.jtxtCorreo.setText(cli.getEmail());
                vista.jtxtCelular.setText(String.valueOf(cli.getMovil()));
                vista.jcbxSexo.setSelectedItem(cli.getSexo());
                FormatoClientes.Estado2(vista);
            }
        }
        if (e.getSource() == vista.jbtnActualizar) {
            cli = FormatoClientes.LeerClientes(vista);
<<<<<<< HEAD
            cli.setId_cliente(Integer.parseInt(vista.jtxtId.getText()));
=======
            cli.setId(Integer.parseInt(vista.jtxtId.getText()));
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
            crud = new CRUDclientes();
            crud.ActualizarRegistroCli(cli);
            Mensajes.M1("Cliente actualizado.");
            crud.MostrarClientesEnTabla(vista.jtblDatos);
            FormatoClientes.LimpiarEntradas(vista);
            FormatoClientes.Estado1(vista);
        }

        if (e.getSource() == vista.jbtnEliminar) {
            int respuesta = Mensajes.M3("¡Confirmar!", "¿Desea eliminar el cliente?");
            if (respuesta == 0) {
                idcli = Integer.parseInt(vista.jtxtId.getText());
                crud = new CRUDclientes();
                crud.EliminarRegistroPro(idcli);
                Mensajes.M1("Cliente eliminado.");
                crud.MostrarClientesEnTabla(vista.jtblDatos);
                FormatoClientes.LimpiarEntradas(vista);
                FormatoClientes.Estado1(vista);
            }
        }
    }
}
