public class CuentaBancaria {

    private final String iban;
    private final String titular;
    private int saldo = 0;
    private Movimiento movimiento [] = new Movimiento[100];

    //Contador de ID
    private int contador = 0;


//Constructor
    public CuentaBancaria(String iban, String titular ){

        this.iban= iban;
        this.titular = titular;

    }

    //Get y Set (Acceder, Cambiar)

    public String getIban() {
        return this.iban;
    }

    public String getTitular() {
        return this.titular;
    }

    public int getSaldo() {
        return this.saldo;
    }

    //Aqui digo que quiero devolver un array de clase Movimiento
    public Movimiento[] getMovimiento() {
        return this.movimiento ;
    }




    // Mostrar informacion de la cuenta
    public String mostrarInfoCuenta (){
        String infoCuenta = "";

        infoCuenta += "Iban: " + this.iban + "\n";
        infoCuenta += "Titular: " + this.titular + "\n";
        infoCuenta += "Saldo: " + this.saldo + "\n";
        return infoCuenta;
    }

    //Mostrar IBAN
    public String mostrarInfoIBAN(){
        String infoIBAN = "";

       infoIBAN += "Iban: " + this.iban + "\n";
        return infoIBAN;
    }

    //Mostrar Saldo
    public String mostrarInfoSaldo (){
        String infoSaldo = "";

        infoSaldo += "Saldo: " + this.saldo + "\n";
        return infoSaldo;
    }


    //Ingreso de dinero
    //void pq metodo no devuelve ningun valor, public void nombreMetodo(tipo nombreParametro)

    public void ingresoDinero (int cantidadIngreso){

        if (cantidadIngreso <=0){
            IO.println("ERROR, Introduce la cantidad adecuada para ingresar");
            return;

        }
        else {
            this.saldo = this.saldo + cantidadIngreso;
        }

        if (cantidadIngreso >3000){

            IO.println("El saldo ha superado a 3000€, hay que avisar a hacienda");
        }

    }



}
