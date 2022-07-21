package DAO;

import Formatos.Mensajes;

public class NombreObjetos extends ConectarBD {

    public NombreObjetos() {
    }

    public String RecuperarNombreCat(int id) {
        String nom = "";
        try {
            rs = st.executeQuery("SELECT nombre FROM categorias WHERE estado = 1 AND id = " + id);
            if (rs.next()) {
                nom = rs.getString(1);
            }
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el nombre de la categoria." + e);
        }
        return nom;
    }

    public String RecuperarNombrePro(int cod) {
        String nompro = "";
        try {
            rs = st.executeQuery("SELECT codigo, nombre, modelo, marca, id_categoria, cantidad, precio FROM productos WHERE estado = 1 AND codigo = " + cod);
            if (rs.next()) {
                nompro = rs.getString(1);
            }
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el nombre del producto." + e);
        }
        return nompro;
    }

    public Integer RecuperarIdPro(String cod) {
        Integer id = null;
        try {
            rs = st.executeQuery("SELECT id FROM productos WHERE estado = 1 AND codigo = " + cod);
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el ID del producto." + e);
        }
        return id;
    }

    public Integer RecuperarIdCli(String numdoc) {
        Integer id = null;
        try {
            rs = st.executeQuery("SELECT id FROM clientes WHERE estado = 1 AND num_doc = " + numdoc);
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el ID del cliente." + e);
        }
        return id;
    }

    public String RecuperarNombreCli(int id) {
        String nom = "";
        try {
            rs = st.executeQuery("SELECT nombre FROM clientes WHERE estado = 1 AND id = " + id);
            if (rs.next()) {
                nom = rs.getString(1);
            }
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el nombre del cliente." + e);
        }
        return nom;
    }

    public String RecuperarNombreEmp(int id) {
        String nom = "";
        try {
            rs = st.executeQuery("SELECT nombre FROM empleados WHERE estado = 1 AND id = " + id);
            if (rs.next()) {
                nom = rs.getString(1);
            }
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el nombre del empleado." + e);
        }
        return nom;
    }

    public Integer RecuperarIdEmp(String nom) {
        Integer id = null;
        try {
//            rs = st.executeQuery("SELECT id FROM empleados WHERE estado = 1 AND CONCAT(nombre,' ',apellidos) = " + nom);
            rs = st.executeQuery("SELECT id FROM empleados WHERE estado = 1 AND nombre =" + nom);
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el ID del empleado." + e);
        }
        return id;
    }

}
