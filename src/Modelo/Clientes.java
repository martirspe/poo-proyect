package Modelo;

public class Clientes extends Usuario {

    //Cliente
<<<<<<< HEAD
    private Integer id_cliente;
=======
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    private String usuario;
    private String password;
    private Integer estado;

    public Clientes() {
    }

<<<<<<< HEAD
    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

=======
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Object[] RegistroCliente(int num) {
<<<<<<< HEAD
        Object[] fila = {num, id_cliente, super.getTipo_doc(), super.getNum_doc(),
=======
        Object[] fila = {num, super.getId(), super.getTipo_doc(), super.getNum_doc(),
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
            super.getNombre(), super.getApellidos(), super.getDireccion(), super.getSexo(),
            super.getMovil(), super.getEmail(), usuario, password};
        return fila;
    }
}
