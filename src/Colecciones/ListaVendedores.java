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
<<<<<<< HEAD
            if (idven == Listaven.get(i).getId_empleado()) {
=======
            if (idven == Listaven.get(i).getId()) {
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
                return Listaven.get(i).getNombre();
            }
        }
        return null;
    }

    public int BuscarIdVendedor(String nomven) {
        for (int i = 0; i < Listaven.size(); i++) {
            if (nomven.equals(Listaven.get(i).getNombre())) {
<<<<<<< HEAD
                return Listaven.get(i).getId_empleado();
=======
                return Listaven.get(i).getId();
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
            }
        }
        return -1;
    }
}
