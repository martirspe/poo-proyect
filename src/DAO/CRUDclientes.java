package DAO;

//Librerías
import Modelo.Clientes;
import Formatos.Mensajes;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Formatos.ManejadorTabla;

public class CRUDclientes extends ConectarBD {

    public CRUDclientes() {
    }

    //Método que recibe un JTable y JLabel y miuestra los registros de la tabla en el JTable
    public void MostrarClientesEnTabla(JTable tabla) {
        String[] titulo = {"No.", "ID", "T. Documento", "No. Documento", "Nombre", "Apellidos", "Dirección", "Sexo", "Celular", "Correo"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulo);
        tabla.setModel(modelo);
        try {
            rs = st.executeQuery("SELECT id, tipo_doc, num_doc, nombre, apellidos, direccion, sexo, movil, email FROM clientes WHERE estado = 1;");
            int cont = 0;
            while (rs.next()) { //netx(): recupera un registro de la consulta si existe.
                cont++;
                Clientes cli = new Clientes();
                cli.setId(rs.getInt(1));
                cli.setTipo_doc(rs.getString(2));
                cli.setNum_doc(rs.getInt(3));
                cli.setNombre(rs.getString(4));
                cli.setApellidos(rs.getString(5));
                cli.setDireccion(rs.getString(6));
                cli.setSexo(rs.getString(7));
                cli.setMovil(rs.getInt(8));
                cli.setEmail(rs.getString(9));
                modelo.addRow(cli.RegistroCliente(cont));
            }

            ManejadorTabla.FormatoTablaClientes(tabla);
            conexion.close();

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar los registros de la tabla clientes." + e);
        }
    }

    //Método que recibe un cliducto y lo inserta en la tabla PRODUCTOS
    public void InsertarClientes(Clientes cli) {
        try {
            ps = conexion.prepareStatement("INSERT INTO clientes (tipo_doc, num_doc, nombre, apellidos, direccion, sexo, movil, email, estado)"
                    + " values(?,?,?,?,?,?,?,?,1);");
            ps.setString(1, cli.getTipo_doc());
            ps.setInt(2, cli.getNum_doc());
            ps.setString(3, cli.getNombre());
            ps.setString(4, cli.getApellidos());
            ps.setString(5, cli.getDireccion());
            ps.setString(6, cli.getSexo());
            ps.setInt(7, cli.getMovil());
            ps.setString(8, cli.getEmail());
            ps.executeUpdate();
            ps.close();
            Mensajes.M1("¡El cliducto se ha registrado correctamente!");

        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede registrar el cliducto." + e);
        }
    }

    public Clientes ObtenerRegistroCli(int idcli) {
        Clientes cli = null; //No hay datos asociados al objeto
        try {
            rs = st.executeQuery("SELECT id, tipo_doc, num_doc, nombre, apellidos, direccion, sexo, movil, email FROM clientes WHERE estado = 1 AND id = " + idcli);
            cli = new Clientes();
            if (rs.next()) {
                cli.setId(rs.getInt(1));
                cli.setTipo_doc(rs.getString(2));
                cli.setNum_doc(rs.getInt(3));
                cli.setNombre(rs.getString(4));
                cli.setApellidos(rs.getString(5));
                cli.setDireccion(rs.getString(6));
                cli.setSexo(rs.getString(7));
                cli.setMovil(rs.getInt(8));
                cli.setEmail(rs.getString(9));
            }
            rs.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede recuperar el registro." + e);
        }
        return cli;
    }

    public void ActualizarRegistroCli(Clientes cli) {
        try {
            ps = conexion.prepareStatement("UPDATE clientes SET tipo_doc = ?, num_doc = ?, nombre = ?, apellidos = ?, direccion = ?, sexo = ?, movil = ?, email = ? WHERE id = ?");
            ps.setString(1, cli.getTipo_doc());
            ps.setInt(2, cli.getNum_doc());
            ps.setString(3, cli.getNombre());
            ps.setString(4, cli.getApellidos());
            ps.setString(5, cli.getDireccion());
            ps.setString(6, cli.getSexo());
            ps.setInt(7, cli.getMovil());
            ps.setString(8, cli.getEmail());
            ps.setInt(9, cli.getId());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede actualizar el registro." + e);
        }
    }

    public void EliminarRegistroPro(int idcli) {
        try {
            ps = conexion.prepareStatement("UPDATE clientes SET estado = 0 WHERE id = ?");
            ps.setInt(1, idcli);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            Mensajes.M1("ERROR: no se puede eliminar el registro." + e);
        }
    }
}
