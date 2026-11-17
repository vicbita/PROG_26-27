import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Movimiento {
    private int id;
    private LocalDateTime fecha;
    private Tipo tipo;
    private int cantidad;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");// variable para dar formato a fecha.



    public Movimiento (int id,  Tipo tipo, int cantidad){ //Constructor de objeto movimiento
        this.id = id;
        this.fecha = LocalDateTime.now(); //Fecha de ahora sin formato
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

        infoMovimiento += "======ID: " + this.id + "======\n";
        infoMovimiento += "===Fecha: " + this.fecha.format(formato) + "===\n"; //Con .format(formato) aplico el formato de la fecha que he creado antes.
        infoMovimiento += "===Tipo: " + this.tipo + "===\n";
        infoMovimiento += "===Cantidad: " + this.cantidad + " €" +"===\n";
        return infoMovimiento;
    }
}
