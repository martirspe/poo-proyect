package Modelo;

public class Categorias {

    //Atributos
<<<<<<< HEAD
    private Integer id_categoria;
=======
    private Integer idcat;
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    private String nombre;
    private String descripcion;
    private Integer estado;

    public Categorias() {
    }

    public Integer getIdcat() {
<<<<<<< HEAD
        return id_categoria;
    }

    public void setIdcat(Integer id_categoria) {
        this.id_categoria = id_categoria;
=======
        return idcat;
    }

    public void setIdcat(Integer idcat) {
        this.idcat = idcat;
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
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
<<<<<<< HEAD
        Object[] fila = {num, id_categoria, nombre, descripcion};
=======
        Object[] fila = {num, idcat, nombre, descripcion};
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
        return fila;
    }

}
