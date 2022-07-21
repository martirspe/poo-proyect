package Modelo;

//Librería
import DAO.NombreObjetos;
import java.text.DecimalFormat;
import java.util.Date;

public class Ventas {

    //Atributos
    private Integer id_venta;
    private Integer id_cliente;
    private Integer id_empleado;
    private String met_pago;
    private Double igv;
    private Double total;
    private Date fecha;
    private String referencia;
    private String nota;
    private String estado;

    public Ventas() {
    }

    public Integer getId_venta() {
        return id_venta;
    }

    public void setId_venta(Integer id_venta) {
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

    public Object[] RegistroVentas(int num) {
        DecimalFormat df = new DecimalFormat("S/ ##0.00");
        NombreObjetos oc = new NombreObjetos();
        NombreObjetos oe = new NombreObjetos();
        Object[] fila = {num, id_venta, oc.RecuperarNombreCli(id_cliente), oe.RecuperarNombreEmp(id_empleado), met_pago, df.format(total * 0.18), df.format(total), fecha, referencia, nota};
        return fila;
    }

}
