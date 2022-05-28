package Modelo;

//Librería
import java.time.LocalDate;

public class DetalleVenta {

    //Atributos
    private int id;
    private Venta venta;
    private int cantidad;
    private int igv;
    private int descuento;
    private int precio;
    private double total;
    private LocalDate fecha;
    private String met_pago;

    public DetalleVenta() {
    }

}
