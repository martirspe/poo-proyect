package Principal;

import DAO.NombreObjetos;

public class RetornarIds {

    public static void main(String[] args) {

        //Recuperar ID de producto a través del código.
        NombreObjetos no = new NombreObjetos();
        Integer id = no.RecuperarIdPro("LT100");
        System.out.println("El ID del producto es: " + id);


        //Recuperar Nombre del cliente a través del ID.
//        NombreObjetos nc = new NombreObjetos();
//        String nombre = nc.RecuperarNombreCli(1);
//        System.out.println("El nombre del cliente es: " + nombre);
    }

}
