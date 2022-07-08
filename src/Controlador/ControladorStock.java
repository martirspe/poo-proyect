package Controlador;

//Librerías
import DAO.CRUDstock;
import DAO.ListarCategorias;
import Formatos.ActualizarCombos;
import Formatos.FormatoStock;
import Modelo.Productos;
import Vista.FormStock;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorStock implements ActionListener {

    FormStock vista;
    CRUDstock crud;
    Productos pro;

    public ControladorStock(FormStock fs) {
        vista = fs;
        this.vista.btn_buscar.addActionListener(this);
        FormatoStock.Presentacion(fs);
        //FormatoProductos.Estado1(fs);
        //crud = new CRUDproductos();
        //crud.MostrarProductosEnTabla(vista.jtblDatos);
        vista.setVisible(true);

        //Cargar combo categorias
        ListarCategorias lc = new ListarCategorias();
        lc.ActualizarListaCategorias();
        ActualizarCombos.ActualizarComboCategoria(vista.jcbxCategorias);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btn_buscar) {
            Productos stock = FormatoStock.LeerProductos(vista);
            crud = new CRUDstock();
            crud.ObtenerStockProductos(stock, vista.table_stock);
            FormatoStock.LimpiarEntradas(vista);
        }
    }
}
