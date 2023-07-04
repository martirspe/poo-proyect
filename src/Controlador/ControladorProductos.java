package Controlador;

//Librerías
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Productos;
import DAO.CRUDproductos;
import DAO.ListarCategorias;
import Formatos.ActualizarCombos;
import Formatos.FormatoProductos;
import Formatos.Mensajes;
import Vista.FormProductos;

public class ControladorProductos implements ActionListener {

    //Atributos
    FormProductos vista;
    Productos pro;
    int idpro;
    CRUDproductos crud;

    public ControladorProductos(FormProductos fp) {
        vista = fp;
        this.vista.jbtnRegistrar.addActionListener(this);
        this.vista.jbtnConsultar.addActionListener(this);
        this.vista.jbtnActualizar.addActionListener(this);
        this.vista.jbtnEliminar.addActionListener(this);
        FormatoProductos.Presentacion(fp);
        FormatoProductos.Estado1(fp);
        crud = new CRUDproductos();
        crud.MostrarProductosEnTabla(vista.jtblDatos);
        vista.setVisible(true);

        //Cargamos los combos
        ListarCategorias lc = new ListarCategorias();
        lc.ActualizarListaCategorias();
        ActualizarCombos.ActualizarComboCategoria(vista.jcbxCategorias);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnRegistrar) {
            Productos prod = FormatoProductos.LeerProductos(vista);
            CRUDproductos crud = new CRUDproductos();
            crud.InsertarProducto(prod);
            crud.MostrarProductosEnTabla(vista.jtblDatos);
            FormatoProductos.LimpiarEntradas(vista);
        }
        if (e.getSource() == vista.jbtnConsultar) {
            idpro = Mensajes.M2("Ingrese el ID del producto a buscar");
            
            if (idpro != 0) {
            crud = new CRUDproductos();
            pro = crud.ObtenerRegistroPro(idpro);
            if (pro == null) {
                Mensajes.M1("El ID " + idpro + " no existe en la tabla productos");
            } else {
                vista.jtxtId.setText(String.valueOf(pro.getIdpro()));
                vista.jtxtCodigo.setText(String.valueOf(pro.getCodigo()));
                vista.jtxtNombre.setText(pro.getNombre());
                vista.jtxtModelo.setText(pro.getModelo());
                vista.jtxtMarca.setText(pro.getMarca());
                vista.jcbxCategorias.setSelectedItem(pro.getCategoria());
                vista.jspStock.setValue(pro.getStock());
                vista.jspPrecio.setValue(pro.getPrecio());
                vista.jtxtaDescripcion.setText(pro.getDescripcion());
                FormatoProductos.Estado2(vista);
            }
            }
        }
        if (e.getSource() == vista.jbtnActualizar) {
            pro = FormatoProductos.LeerProductos(vista);
            pro.setIdpro(Integer.parseInt(vista.jtxtId.getText()));
            crud = new CRUDproductos();
            crud.ActualizarRegistroPro(pro);
            Mensajes.M1("Producto actualizado.");
            crud.MostrarProductosEnTabla(vista.jtblDatos);
            FormatoProductos.LimpiarEntradas(vista);
            FormatoProductos.Estado1(vista);
        }

        if (e.getSource() == vista.jbtnEliminar) {
            int respuesta = Mensajes.M3("¡Confirmar!", "¿Desea eliminar el producto?");
            if (respuesta == 0) {
                idpro = Integer.parseInt(vista.jtxtId.getText());
                crud = new CRUDproductos();
                crud.EliminarRegistroPro(idpro);
                Mensajes.M1("Producto eliminado.");
                crud.MostrarProductosEnTabla(vista.jtblDatos);
                FormatoProductos.LimpiarEntradas(vista);
                FormatoProductos.Estado1(vista);
            }
        }
    }
}
