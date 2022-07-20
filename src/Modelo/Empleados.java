package Modelo;

public class Empleados extends Usuario {

    //Atributos
    private String cargo;
    private Integer estado;

    public Empleados() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
