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
            Mensajes.M1("ERROR: no se puede recuperar el ID del cliente." + e);
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

    public Integer RecuperarIdEmp(String nom) {
        Integer id = null;
        try {
            rs = st.executeQuery("SELECT id FROM empleados WHERE estado = 1 AND CONCAT(nombre,' ', apellidos) = " + "'" + nom + "'");
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el ID del empleado." + e);
        }
        return id;
    }

    public String RecuperarApellidoEmp(String nom) {
        String ape = "";
        try {
            rs = st.executeQuery("SELECT apellidos FROM empleados WHERE estado = 1 AND CONCAT(nombre, ' ', apellidos) = " + "'" + nom + "'");
            if (rs.next()) {
                ape = rs.getString(1);
            }
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el apellido del empleado." + e);
        }
        return ape;
    }

}
