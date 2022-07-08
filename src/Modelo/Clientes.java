package Modelo;

public class Clientes extends Usuario {

    //Cliente
    private String usuario;
    private String password;
    private Integer estado;

    public Clientes() {
    }

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
        Object[] fila = {num, super.getId(), super.getTipo_doc(), super.getNum_doc(),
            super.getNombre(), super.getApellidos(), super.getDireccion(), super.getSexo(), super.getMovil(), super.getEmail(), usuario, password};
        return fila;
    }
}
