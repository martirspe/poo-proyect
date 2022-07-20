package DAO;

import Formatos.Mensajes;

public class NombreObjetos extends ConectarBD {

    public NombreObjetos() {
    }

    public String RecuperarNombrecat(int id) {
        String nomcat = "";
        try {
            rs = st.executeQuery("SELECT nombre FROM categorias WHERE estado = 1 AND id = " + id);
            if (rs.next()) {
                nomcat = rs.getString(1);
            }
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el nombre de la categoria..." + e);
        }
        return nomcat;
    }

}
