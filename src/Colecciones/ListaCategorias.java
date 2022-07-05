package Colecciones;

//Librerías
import java.util.*;
import Modelo.*;

public class ListaCategorias {

    ArrayList<Categorias> Listacat;

    public ListaCategorias() {
        Listacat = new ArrayList();
    }

    public void AgregarCategoria(Categorias cat) {
        Listacat.add(cat);
    }

    public Categorias RecuperarCategoria(int pos) {
        return Listacat.get(pos);
    }

    public int CantidadCategorias() {
        return Listacat.size();
    }

    public String BuscarNombreCategoria(int idcat) {
        for (int i = 0; i < Listacat.size(); i++) {
            if (idcat == Listacat.get(i).getIdcat()) {
                return Listacat.get(i).getNombre();
            }
        }
        return null; // no existe el id
    }

    public int BuscarIdCategoria(String nomcat) {
        for (int i = 0; i < Listacat.size(); i++) {
            if (nomcat.equals(Listacat.get(i).getNombre())) {
                return Listacat.get(i).getIdcat();
            }
        }
        return -1;
    }
}
