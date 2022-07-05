package Modelo;

public class Clientes extends Usuarios {

    //Cliente
    private String usuario;
    private String password;

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

}
