package Modelo;

import java.text.DecimalFormat;

public class DetalleVenta {

    //Atributos
    private Integer id;
    private String producto;
    private String cliente;
    private String vendedor;
    private Integer cantidad;
    private String moneda;
    private Double t_cambio;
    private Double igv;
    private Double descuento;
    private Double precio;
    private Double total;
    private String fecha;
    private String met_pago;
    private String referencia;
    private String nota;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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
        DecimalFormat df = new DecimalFormat("S/##0.00");
        Object[] fila = {num, id, producto, cantidad, df.format(precio), df.format(total), vendedor, cliente, fecha};
        return fila;
    }

    public Object[] RegistroDetalleVentaCliente(int num) {
        DecimalFormat df = new DecimalFormat("S/##0.00");
        Object[] fila = {num, id, producto, cantidad, df.format(precio), df.format(total), vendedor, cliente, fecha};
        return fila;
    }

    public Object[] RegistroDetalleVentaVendedor(int num) {
        DecimalFormat df = new DecimalFormat("S/##0.00");
        Object[] fila = {num, id, producto, cantidad, df.format(precio), df.format(total), vendedor, cliente, fecha};
        return fila;
    }

    public Object[] RegistroDetalleVentaProducto(int num) {
        DecimalFormat df = new DecimalFormat("S/##0.00");
        Object[] fila = {num, id, producto, cantidad, df.format(precio), df.format(total), vendedor, cliente, fecha};
        return fila;
    }
}
