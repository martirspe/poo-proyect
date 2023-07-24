package Controlador;

//Librerías
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Clientes;
import DAO.CRUDclientes;
import Formatos.FormatoClientes;
import Formatos.Mensajes;
import Vista.FormClientes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        //soloNumeros();

        vista.jtxtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloNumeros(evt);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnRegistrar) {
            Clientes cli = FormatoClientes.LeerClientes(vista);
            if (cli != null) {
                CRUDclientes crud = new CRUDclientes();
                crud.InsertarClientes(cli);
                crud.MostrarClientesEnTabla(vista.jtblDatos);
                FormatoClientes.LimpiarEntradas(vista);
            }

        }
        if (e.getSource() == vista.jbtnConsultar) {
            idcli = Mensajes.M2("Ingrese el ID del cliente a buscar");
            if (idcli != 0) {
                crud = new CRUDclientes();
                cli = crud.ObtenerRegistroCli(idcli);
                if (cli == null) {
                    Mensajes.M1("El ID " + idcli + " no existe en la tabla clientes");
                } else {
                    vista.jtxtId.setText(String.valueOf(cli.getId_cliente()));
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
        }
        if (e.getSource() == vista.jbtnActualizar) {
            cli = FormatoClientes.LeerClientes(vista);
            if (cli != null) {
                cli.setId_cliente(Integer.valueOf(vista.jtxtId.getText()));
                crud = new CRUDclientes();
                crud.ActualizarRegistroCli(cli);
                Mensajes.M1("Cliente actualizado.");
                crud.MostrarClientesEnTabla(vista.jtblDatos);
                FormatoClientes.LimpiarEntradas(vista);
                FormatoClientes.Estado1(vista);
            }
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

    //Solo numeros
    private void soloNumeros(java.awt.event.KeyEvent evnt) {
        int valor = evnt.getKeyChar();
        boolean numeros = valor >= 48 && valor <= 57;
        if (!numeros) {
            evnt.consume();
        }
    }

}
