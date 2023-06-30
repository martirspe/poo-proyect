package Modelo;

public class Categorias {

    //Atributos
    private Integer id_categoria;
    private String nombre;
    private String descripcion;
    private Integer estado;

    public Categorias() {
    }

    public Integer getIdcat() {
        return id_categoria;
    }

    public void setIdcat(Integer id_categoria) {
        this.id_categoria = id_categoria;
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
        Object[] fila = {num, id_categoria, nombre, descripcion};
        return fila;
    }

}
