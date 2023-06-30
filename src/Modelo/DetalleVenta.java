package Modelo;

<<<<<<< HEAD
<<<<<<< HEAD
import java.text.DecimalFormat;
=======
//Librería
import java.text.DecimalFormat;
import java.time.LocalDate;
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
=======
//Librería
import java.text.DecimalFormat;
import java.time.LocalDate;
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c

public class DetalleVenta {

    //Atributos
    private Integer id;
<<<<<<< HEAD
<<<<<<< HEAD
    private String producto;
    private String cliente;
    private String vendedor;
=======
=======
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    private Ventas venta;
    private Productos producto;
    private Clientes cliente;
    private Empleados empleados;
<<<<<<< HEAD
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
=======
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    private Integer cantidad;
    private String moneda;
    private Double t_cambio;
    private Double igv;
    private Double descuento;
    private Double precio;
    private Double total;
<<<<<<< HEAD
    private String fecha;
=======
    private LocalDate fecha;
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    private String met_pago;
    private String referencia;
    private String nota;

<<<<<<< HEAD
=======
    public DetalleVenta() {
    }

>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

<<<<<<< HEAD
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

=======
    public Ventas getVenta() {
        return venta;
    }

    public void setVenta(Ventas venta) {
        this.venta = venta;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Double getT_cambio() {
        return t_cambio;
    }

    public void setT_cambio(Double t_cambio) {
        this.t_cambio = t_cambio;
    }

    public Double getIgv() {
        return igv;
    }

    public void setIgv(Double igv) {
        this.igv = igv;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

<<<<<<< HEAD
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
=======
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
        this.fecha = fecha;
    }

    public String getMet_pago() {
        return met_pago;
    }

    public void setMet_pago(String met_pago) {
        this.met_pago = met_pago;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    public Object[] RegistroDetalleVenta(int num) {
        DecimalFormat df = new DecimalFormat("S/ ##0.00");
        Object[] fila = {num, id, producto.getNombre(), cantidad, df.format(precio), total};
        return fila;
    }
    
    public Object[] RegistroDetalleVentaCliente(int num) {
        DecimalFormat df = new DecimalFormat("S/ ##0.00");
        Object[] fila = {num, cliente.getNombre(),id, producto.getNombre(), cantidad, df.format(precio), total};
        return fila;
    }
    
    public Object[] RegistroDetalleVentaEmple(int num) {
        DecimalFormat df = new DecimalFormat("S/ ##0.00");
        Object[] fila = {num, empleados.getNombre(),id, producto.getNombre(), cantidad, df.format(precio), total};
        return fila;
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public Object[] RegistroDetalleVenta(int num) {
        DecimalFormat df = new DecimalFormat("S/ ##0.00");
        Object[] fila = {num, id, producto, cantidad, df.format(precio), df.format(total), vendedor, cliente, fecha};
        return fila;
    }

    public Object[] RegistroDetalleVentaCliente(int num) {
        DecimalFormat df = new DecimalFormat("S/ ##0.00");
        Object[] fila = {num, id, producto, cantidad, df.format(precio), df.format(total), vendedor, cliente, fecha};
        return fila;
    }

    public Object[] RegistroDetalleVentaVendedor(int num) {
        DecimalFormat df = new DecimalFormat("S/ ##0.00");
        Object[] fila = {num, id, producto, cantidad, df.format(precio), df.format(total), vendedor, cliente, fecha};
        return fila;
    }

    public Object[] RegistroDetalleVentaProducto(int num) {
        DecimalFormat df = new DecimalFormat("S/ ##0.00");
        Object[] fila = {num, id, producto, cantidad, df.format(precio), df.format(total), vendedor, cliente, fecha};
        return fila;
=======
=======
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Empleados getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
<<<<<<< HEAD
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
=======
>>>>>>> 59b9cee1b210ed698810531a8e473f6910570d2c
    }
}
