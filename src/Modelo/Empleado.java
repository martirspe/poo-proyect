package Modelo;

public class Empleado extends Usuario {

    //Atributos
    private String cargo;

    public Empleado() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
