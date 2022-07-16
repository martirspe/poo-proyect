package Modelo;

//Librería
import java.text.DecimalFormat;
import DAO.NombreObjetos;

public class Productos {

    //Atributos
    private Integer idpro;
    private String codigo;
    private String nombre;
    private String modelo;
    private String marca;
    private Integer categoria;
    private Integer stock;
    private Double precio;
    private String descripcion;
    private Integer estado;

    public Productos() {
    }

    public Integer getIdpro() {
        return idpro;
    }

    public void setIdpro(Integer idpro) {
        this.idpro = idpro;
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
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
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
        Object[] fila = {num, idpro, codigo, nombre, modelo, marca, no.RecuperarNombrecat(categoria), stock, df.format(precio), descripcion};
        return fila;
    }

}
