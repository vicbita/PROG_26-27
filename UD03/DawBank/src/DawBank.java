import java.util.Scanner;

public class DawBank
{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        IO.println("======Bienvenido a nuestra app de DawBank======");
        IO.println("Vamos a crear una cuenta en nuestro banco, por favor, introduce el nombre completo");
        String nombre = scan.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(nombre); //creando cuenta con clase CuentaBancaria y guardo el nombre como titular


        String opcion = "s";
        do {
            IO.println("1) Mostrar infromacion de la cuenta.");
            IO.println("2) Mostrar IBAN");
            IO.println("3) Mostrar Titular");
            IO.println("4) Mostrar saldo disponible");
            IO.println("5) Ingresar dinero");
            IO.println("6) Retirar dinero");
            IO.println("7) Ver los ultimos movimientos");
            IO.println("s) Salir");
            opcion = scan.nextLine();
            switch (opcion) {
                case "1":
                    IO.println(cuenta.mostrarInfoCuenta()); //llamo al metodo con cuenta.


                    break;
                case "2":
                    IO.println(cuenta.mostrarInfoIBAN());
                    break;


                case "3":
                    IO.println(cuenta.mostrarInfoTitular());
                    break;


                case "4":
                    IO.println(cuenta.mostrarInfoSaldo());

                    break;

                case "5":
                    IO.println("===Dime cuanto dinero quieres ingresar===");
                    int dineroIngresado = scan.nextInt();
                    scan.nextLine();
                    cuenta.ingresoDinero(dineroIngresado); //aqui uso directamente el metodo porque es void y no le puedo usar en iop


                    break;
                case "6":
                    IO.println("===Dime cuanto dinero quieres sacar===");
                    int dineroRetirado = scan.nextInt();
                    scan.nextLine();
                    cuenta.retiroDinero(dineroRetirado);

                    break;
                case "7":


                    break;
            }

        }
        while (!opcion.equals("s")) ;



    }
}
