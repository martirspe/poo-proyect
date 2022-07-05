package Controlador;

//Librerías
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DAO.CRUDcategorias;
import Formatos.*;
import Modelo.Categorias;
import Vista.FormCategorias;

public class ControladorCategorias implements ActionListener {

    FormCategorias vista;
    Categorias cate;
    int idcat;
    CRUDcategorias crud;

    public ControladorCategorias(FormCategorias fc) {
        this.vista = fc;
        this.vista.jbtnRegistrar.addActionListener(this);
        this.vista.jbtnConsultar.addActionListener(this);
        this.vista.jbtnActualizar.addActionListener(this);
        this.vista.jbtnEliminar.addActionListener(this);
        FormatoCategorias.Presentacion(fc);
        FormatoCategorias.Estado1(fc);
        crud = new CRUDcategorias();
        crud.MostrarCategoriasEnTabla(vista.jtblDatos);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnRegistrar) {
            cate = FormatoCategorias.LeerCategorias(vista);
            crud = new CRUDcategorias();
            crud.InsertarCategoria(cate);
            FormatoCategorias.LimpiarEntradas(vista);
            Mensajes.M1("Registro insertado correctamente");
            crud.MostrarCategoriasEnTabla(vista.jtblDatos);
        }
        if (e.getSource() == vista.jbtnConsultar) {
            idcat = Mensajes.M2("Ingrese el Id de la categoría a buscar");
            crud = new CRUDcategorias();
            cate = crud.ObtenerRegistroCat(idcat);
            if (cate == null) {
                Mensajes.M1("El id " + idcat + " no existe en la tabla categorias");
            } else {
                vista.jtxtId.setText(String.valueOf(cate.getIdcat()));
                vista.jtxtCategoria.setText(cate.getNombre());
                vista.jtxtaDescripcion.setText(cate.getDescripcion());
                FormatoCategorias.Estado2(vista);
            }
        }
        if (e.getSource() == vista.jbtnActualizar) {
            cate = FormatoCategorias.LeerCategorias(vista);
            cate.setIdcat(Integer.parseInt(vista.jtxtId.getText()));
            crud = new CRUDcategorias();
            crud.ActualizarRegistroCat(cate);
            Mensajes.M1("Datos actualizados.");
            crud.MostrarCategoriasEnTabla(vista.jtblDatos);
            FormatoCategorias.LimpiarEntradas(vista);
            FormatoCategorias.Estado1(vista);
        }
        if (e.getSource() == vista.jbtnEliminar) {
            int respuesta = Mensajes.M3("¡Confirmar!", "¿Desea eliminar el registro?");
            if (respuesta == 0) {
                idcat = Integer.parseInt(vista.jtxtId.getText());
                crud = new CRUDcategorias();
                crud.EliminarRegistroCat(idcat);
                Mensajes.M1("Registro eliminado.");
                crud.MostrarCategoriasEnTabla(vista.jtblDatos);
                FormatoCategorias.LimpiarEntradas(vista);
                FormatoCategorias.Estado1(vista);
            }
        }
    }
}
