package Modelo;

//Librería
import java.text.DecimalFormat;
import DAO.NombreObjetos;

public class Productos {

    //Atributos
<<<<<<< HEAD
    private Integer id_producto;
=======
    private Integer idpro;
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    private String codigo;
    private String nombre;
    private String modelo;
    private String marca;
<<<<<<< HEAD
    private Integer id_categoria;
=======
    private Integer categoria;
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    private Integer stock;
    private Double precio;
    private String descripcion;
    private Integer estado;

    public Productos() {
    }

    public Integer getIdpro() {
<<<<<<< HEAD
        return id_producto;
    }

    public void setIdpro(Integer id_producto) {
        this.id_producto = id_producto;
=======
        return idpro;
    }

    public void setIdpro(Integer idpro) {
        this.idpro = idpro;
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getCategoria() {
<<<<<<< HEAD
        return id_categoria;
    }

    public void setCategoria(Integer id_categoria) {
        this.id_categoria = id_categoria;
=======
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
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

    public Object[] RegistroProducto(int num) {
        DecimalFormat df = new DecimalFormat("S/ ##0.00");
        NombreObjetos no = new NombreObjetos();
<<<<<<< HEAD
        Object[] fila = {num, id_producto, codigo, nombre, modelo, marca, no.RecuperarNombreCat(id_categoria), stock, df.format(precio), descripcion};
=======
        Object[] fila = {num, idpro, codigo, nombre, modelo, marca, no.RecuperarNombrecat(categoria), stock, df.format(precio), descripcion};
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
        return fila;
    }

}
