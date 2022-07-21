package Modelo;

public class Empleados extends Usuario {

    //Atributos
    private Integer id_empleado;
    private String cargo;
    private Integer estado;

    public Empleados() {
    }

    public Integer getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
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

    public Object[] RegistroCliente(int num) {
        Object[] fila = {num, id_empleado, super.getTipo_doc(), super.getNum_doc(),
            super.getNombre(), super.getApellidos(), super.getDireccion(), super.getSexo(),
            super.getMovil(), super.getEmail(), cargo, estado};
        return fila;
    }

}
