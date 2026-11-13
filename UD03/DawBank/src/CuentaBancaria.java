public class CuentaBancaria {

    private final String iban;
    private final String titular;
    private int saldo = 0;
    private Movimiento movimiento [] = new Movimiento[100]; //Array de clase Movimiento para guardar cada movimiento en esta calse
    private String es = "ES";

    //Contador de ID
    private int contador = 0;


//Constructor
    public CuentaBancaria( String titular ){
//For para generar él iban, con dos letras que van a ser ES + 22 números aleatorios.
        for (int i = 0; i < 22; i++)
        {
            this.es +=  (int)(Math.random()*10);

        }
        this.iban= es;
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

    //Aquí digo que quiero devolver un array de clase Movimiento
    public Movimiento[] getMovimiento() {
        return this.movimiento ;
    }




    // Mostrar información de la cuenta
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
    public String mostrarInfoTitular(){
        String infoTitular = "";

        infoTitular += "Titular: " + this.titular + "\n";
        return infoTitular;
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

        if (cantidadIngreso <=0 ){
            IO.println("ERROR, Introduce la cantidad adecuada para ingresar");
            return;

        }
        else {
            this.saldo = this.saldo + cantidadIngreso;
        }

        if (cantidadIngreso >=3000){

            IO.println("El ingreso ha superado a 3000€, hay que avisar a hacienda");
        }
        movimiento[contador]= new  Movimiento(contador+1, Tipo.INGRESO, cantidadIngreso);
        /*
         Crea un nuevo objeto Movimiento con su ID, tipo y cantidad,
         y lo guarda en la siguiente posición disponible del array.
         */

        contador++;

    }

    public void retiroDinero(int cantidadRetiro){
        if (cantidadRetiro<=0 ){
            IO.println("Error, no puedes sacar 0 o valor negativo");
            return;
        }

        if (this.saldo - cantidadRetiro < -50){
            IO.println("Error saldo negativo!");
            return;
        }
        else {
            this.saldo=this.saldo-cantidadRetiro;
        }
        if (cantidadRetiro >=3000){

            IO.println("Has sacado mucha pasta, avisa a hacienda.");
        }


        movimiento[contador]= new  Movimiento(contador+1, Tipo.RETIRO, cantidadRetiro);
        /*
        Crea un nuevo objeto Movimiento con su ID, tipo y cantidad,
        y lo guarda en la siguiente posición disponible del array.
        */
        contador++;

    }

    public void mostrarMovimientos(){ //he creado este metodo con un for dento, para acceder a todos los movimientos que tengo creados en Movimiento

        for (int i = 0; i <contador ; i++) {
            movimiento[i].mostrarInfoMovimiento();
        }

    }




}
