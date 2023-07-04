package Controlador;

//Librerías
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Productos;
import DAO.CRUDstock;
import Vista.FormStock;
import Formatos.Mensajes;
import Formatos.FormatoStock;

public class ControladorStock implements ActionListener {

    //Atributos
    FormStock vista;
    Productos pro;
    int idpro;
    CRUDstock crud;

    public ControladorStock(FormStock fp) {
        vista = fp;
        this.vista.jbtnConsultar.addActionListener(this);
        this.vista.jbtnActualizar.addActionListener(this);
        FormatoStock.Presentacion(fp);
        FormatoStock.Estado1(fp);
        crud = new CRUDstock();
        crud.MostrarStockEnTabla(vista.jtblDatos);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.jbtnConsultar) {
            idpro = Mensajes.M2("Ingrese el ID del producto a buscar");
            
            if (idpro != 0) {
            crud = new CRUDstock();
            pro = crud.ObtenerRegistroPro(idpro);
            if (pro == null) {
                Mensajes.M1("El ID " + idpro + " no existe en la tabla productos");
            } else {
                vista.jtxtId.setText(String.valueOf(pro.getIdpro()));
                vista.jtxtCodigo.setText(String.valueOf(pro.getCodigo()));
                vista.jtxtNombre.setText(pro.getNombre());
                vista.jtxtModelo.setText(pro.getModelo());
                vista.jtxtMarca.setText(pro.getMarca());
                vista.jspStock.setValue(pro.getStock());
                FormatoStock.Estado2(vista);
            }
            }
        }
        if (e.getSource() == vista.jbtnActualizar) {
            pro = FormatoStock.LeerProductos(vista);
            pro.setIdpro(Integer.parseInt(vista.jtxtId.getText()));
            crud = new CRUDstock();
            crud.ActualizarRegistroPro(pro);
            Mensajes.M1("Stock del producto actualizado.");
            crud.MostrarStockEnTabla(vista.jtblDatos);
            FormatoStock.LimpiarEntradas(vista);
            FormatoStock.Estado1(vista);
        }
    }
}
