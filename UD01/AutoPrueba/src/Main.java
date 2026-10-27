import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        Scanner scan =new Scanner(System.in);
        IO.println("EJERCICIO1");
        IO.println("Dime dos numeros y te digo cual es mayor y cual es menor");
        IO.println("Dime primer numero");
        int numero1 = scan.nextInt();
        IO.println("Dime segundo numero");
        int numero2 = scan.nextInt();

        if (numero1 == numero2) {
            IO.println("Los numeros son iguales");
        }
        else if (numero1>numero2) {
        IO.println("El numero 1 " + numero1 +" es mayor, el numero 2 " +numero2 +" es menor");
    }
        else {
            IO.println("El numero 2 "+numero2 + " es mayor, el numero 1 " +numero1+ " es menor");
        }


        IO.println("EJERCICIO2");
        scan = new Scanner(System.in);
        IO.println("Dime que edad tienes y te digo cuanto cuesta la entrada en cine");
        int edad = scan.nextInt();
        if (edad <0 ) {
            IO.println("Edad invalida");
        }
        else if (edad < 5) {
            IO.println("Tu entrada es gratis!");
        } else if (edad <=17) {
            IO.println("Tu entrada vale 6 pavos");
        }
        else if (edad <=64){
            IO.println("Tu entrada vale 10 pavos");
        }
        else if (edad <=100) {
            IO.println("Tu entrada vale 7 pavos");
        }


        IO.println("EJERCICIO3");
        scan = new Scanner(System.in);
        int sumaTotal= 0;
        IO.println("Dime cuanto dinero quieres ahorrar");
        int dinero = scan.nextInt();
        IO.println("Dime cuantas semanas quieres ahorrar");
        int semanas = scan.nextInt();

        for (int i = 0; i < semanas; i++) {
            sumaTotal = sumaTotal+ dinero;
            IO.println("Semana " + (i+1)+ " " + sumaTotal);
        }


        IO.println("EJERCICIO4");

        scan = new Scanner(System.in);
        int botella = 2;
        IO.println("Dime cuantas botellas quieres comprar");
        double nBotellas = scan.nextDouble();
        double sumaBotellas = 0;

        if (nBotellas <10 ) {
            sumaBotellas = botella * nBotellas;
            IO.println("El precio de todas las botellas es " + sumaBotellas);
        }
        else {
            sumaBotellas = botella * nBotellas * 0.85;
            IO.println("El precio final es " + sumaBotellas);
        }



        IO.println("EJERECICIO5");
        scan = new Scanner(System.in);

        int negativ = 0;
        int positiv = 0;
        int cero = 0;
        IO.println("Introduce 10 numeros eneros");
        for (int i = 0; i < 10; i++) {
            int numero = scan.nextInt();

            if (numero <0 ) {
                negativ++;
            }
            else if (numero > 0) {
                positiv++;
            }
            else {
                cero++;
            }
        }
        IO.println("Se han encontrado " +positiv + " numeros positivos");
        IO.println("Se han encontrado " +negativ + " numeros negativos");
        IO.println("Se han encontrado " +cero + " ceros");



        IO.println("EJERCICIO6");
        scan = new Scanner(System.in);
        double sumaTemperaturas = 0;
        double contMedia = 0;
        double temperaturaMedia;
        double temperaturas [] = new double[7];

        IO.println("Dame la temperatura de los 7 dias de la semana");
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = scan.nextDouble();

        }

        for (int i = 0; i <temperaturas.length ; i++) {
            sumaTemperaturas = sumaTemperaturas + temperaturas[i];

        }
        temperaturaMedia= sumaTemperaturas / temperaturas.length;

        for (int i = 0; i < temperaturas.length; i++) {

            if (temperaturas[i] > temperaturaMedia ) {
                contMedia++;
            }
        }
        IO.println("La temperatura media es " +temperaturaMedia);
        IO.println("Se han encontrado " + contMedia + " dias por encima de la media");










    }
}