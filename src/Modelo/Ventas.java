package Modelo;

//Librería
import java.util.Date;

public class Ventas {

    //Atributos
    private Integer id_venta;
    private Integer id_cliente;
    private Integer id_empleado;
    private String met_pago;
    private String moneda;
    private Double t_cambio;
    private Double igv;
    private Double total;
    private Date fecha;
    private String referencia;
    private String nota;
    private String estado;

    public Ventas() {
    }

    public Integer getId() {
        return id_venta;
    }

    public void setId(Integer id_venta) {
        this.id_venta = id_venta;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Integer id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getMet_pago() {
        return met_pago;
    }

    public void setMet_pago(String met_pago) {
        this.met_pago = met_pago;
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

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
