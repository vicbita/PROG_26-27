public class Movimiento {
    private int id;
    private String fecha;
    private String tipo;
    private int cantidad;

    public Movimiento (int id, String fecha, String tipo, int cantidad){
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }


    // Mostrar informacion de movimiento
    public String mostrarInfoMovimiento (){
        String infoMovimiento = "";

        infoMovimiento += "ID: " + this.id + "\n";
        infoMovimiento += "Fecha: " + this.fecha + "\n";
        infoMovimiento += "Tipo: " + this.tipo + "\n";
        infoMovimiento += "Cantidad: " + this.cantidad + " €" +"\n";
        return infoMovimiento;
    }
}
