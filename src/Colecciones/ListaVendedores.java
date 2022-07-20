package Colecciones;

//Librerías
import java.util.*;
import Modelo.*;

public class ListaVendedores {

    ArrayList<Empleados> Listaven;

    public ListaVendedores() {
        Listaven = new ArrayList();
    }

    public void AgregarVendedor(Empleados ven) {
        Listaven.add(ven);
    }

    public Empleados RecuperarVendedor(int pos) {
        return Listaven.get(pos);
    }

    public int CantidadVendedores() {
        return Listaven.size();
    }

    public String BuscarNombreVendedor(int idven) {
        for (int i = 0; i < Listaven.size(); i++) {
            if (idven == Listaven.get(i).getId()) {
                return Listaven.get(i).getNombre();
            }
        }
        return null;
    }

    public int BuscarIdVendedor(String nomven) {
        for (int i = 0; i < Listaven.size(); i++) {
            if (nomven.equals(Listaven.get(i).getNombre())) {
                return Listaven.get(i).getId();
            }
        }
        return -1;
    }
}
