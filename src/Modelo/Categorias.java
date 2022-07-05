package Modelo;

public class Categorias {

    //Atributos
    private Integer idcat;
    private String nombre;
    private String descripcion;
    private Integer estado;

    public Categorias() {
    }

    public Integer getIdcat() {
        return idcat;
    }

    public void setIdcat(Integer idcat) {
        this.idcat = idcat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Object[] RegistroCategoria(int num) {
        Object[] fila = {num, idcat, nombre, descripcion};
        return fila;
    }

}
