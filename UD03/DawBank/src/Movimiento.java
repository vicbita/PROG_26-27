import java.time.LocalDateTime;

public class Movimiento {
    private int id;
    private LocalDateTime fecha;
    private Tipo tipo;
    private int cantidad;

    public Movimiento (int id,  Tipo tipo, int cantidad){ //Constructor de objeto movimiento
        this.id = id;
        this.fecha = LocalDateTime.now();
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Tipo getTipo() {
        return tipo;
    }


    // Mostrar información de movimiento
    public String mostrarInfoMovimiento (){
        String infoMovimiento = "";

        infoMovimiento += "===ID: " + this.id + "\n===";
        infoMovimiento += "===Fecha: " + this.fecha + "\n===";
        infoMovimiento += "===Tipo: " + this.tipo + "\n===";
        infoMovimiento += "===Cantidad: " + this.cantidad + " €" +"\n===";
        return infoMovimiento;
    }
}
