import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
       Scanner scan =new Scanner(System.in);
//        IO.println("EJERCICIO1");
//        IO.println("Dime dos numeros y te digo cual es mayor y cual es menor");
//        IO.println("Dime primer numero");
//        int numero1 = scan.nextInt();
//        IO.println("Dime segundo numero");
//        int numero2 = scan.nextInt();
//
//        if (numero1 == numero2) {
//            IO.println("Los numeros son iguales");
//        }
//        else if (numero1>numero2) {
//        IO.println("El numero 1 " + numero1 +" es mayor, el numero 2 " +numero2 +" es menor");
//    }
//        else {
//            IO.println("El numero 2 "+numero2 + " es mayor, el numero 1 " +numero1+ " es menor");
//        }
//
//
//        IO.println("EJERCICIO2");
//        scan = new Scanner(System.in);
//        IO.println("Dime que edad tienes y te digo cuanto cuesta la entrada en cine");
//        int edad = scan.nextInt();
//        if (edad <0 ) {
//            IO.println("Edad invalida");
//        }
//        else if (edad < 5) {
//            IO.println("Tu entrada es gratis!");
//        } else if (edad <=17) {
//            IO.println("Tu entrada vale 6 pavos");
//        }
//        else if (edad <=64){
//            IO.println("Tu entrada vale 10 pavos");
//        }
//        else if (edad <=100) {
//            IO.println("Tu entrada vale 7 pavos");
//        }
//
//
//        IO.println("EJERCICIO3");
//        scan = new Scanner(System.in);
//        int sumaTotal= 0;
//        IO.println("Dime cuanto dinero quieres ahorrar");
//        int dinero = scan.nextInt();
//        IO.println("Dime cuantas semanas quieres ahorrar");
//        int semanas = scan.nextInt();
//
//        for (int i = 0; i < semanas; i++) {
//            sumaTotal = sumaTotal+ dinero;
//            IO.println("Semana " + (i+1)+ " " + sumaTotal);
//        }
//
//
//        IO.println("EJERCICIO4");
//
//        scan = new Scanner(System.in);
//        int botella = 2;
//        IO.println("Dime cuantas botellas quieres comprar");
//        double nBotellas = scan.nextDouble();
//        double sumaBotellas = 0;
//
//        if (nBotellas <10 ) {
//            sumaBotellas = botella * nBotellas;
//            IO.println("El precio de todas las botellas es " + sumaBotellas);
//        }
//        else {
//            sumaBotellas = botella * nBotellas * 0.85;
//            IO.println("El precio final es " + sumaBotellas);
//        }
//
//
//
//        IO.println("EJERECICIO5");
//        scan = new Scanner(System.in);
//
//        int negativ = 0;
//        int positiv = 0;
//        int cero = 0;
//        IO.println("Introduce 10 numeros eneros");
//        for (int i = 0; i < 10; i++) {
//            int numero = scan.nextInt();
//
//            if (numero <0 ) {
//                negativ++;
//            }
//            else if (numero > 0) {
//                positiv++;
//            }
//            else {
//                cero++;
//            }
//        }
//        IO.println("Se han encontrado " +positiv + " numeros positivos");
//        IO.println("Se han encontrado " +negativ + " numeros negativos");
//        IO.println("Se han encontrado " +cero + " ceros");
//
//
//
//        IO.println("EJERCICIO6");
//        scan = new Scanner(System.in);
//        double sumaTemperaturas = 0;
//        double contMedia = 0;
//        double temperaturaMedia;
//        double temperaturas [] = new double[7];
//
//        IO.println("Dame la temperatura de los 7 dias de la semana");
//        for (int i = 0; i < temperaturas.length; i++) {
//            temperaturas[i] = scan.nextDouble();
//
//        }
//
//        for (int i = 0; i <temperaturas.length ; i++) {
//            sumaTemperaturas = sumaTemperaturas + temperaturas[i];
//
//        }
//        temperaturaMedia= sumaTemperaturas / temperaturas.length;
//
//        for (int i = 0; i < temperaturas.length; i++) {
//
//            if (temperaturas[i] > temperaturaMedia ) {
//                contMedia++;
//            }
//        }
//        IO.println("La temperatura media es " +temperaturaMedia);
//        IO.println("Se han encontrado " + contMedia + " dias por encima de la media");
//
//
//
//
//        IO.println("EJERCICIO7");
//
//        int aes = 0, ees = 0, oes = 0, ies = 0, ues= 0;
//        int contadorEspacios= 0;
//        boolean letraA = false;
//
//        IO.println("Introduce la frase que deseas");
//        String frase = scan.nextLine();
//        for (int i = 0; i < frase.toLowerCase().length(); i++) {
//
//            if (frase.toLowerCase().charAt(i) == 'a') {
//                aes++;
//                letraA = true;
//
//                }
//                else if (frase.toLowerCase().charAt(i) == 'e'){
//
//                    ees++;
//                }
//                else if (frase.toLowerCase().charAt(i) == 'o') {
//                    oes++;
//                }
//                else if (frase.toLowerCase().charAt(i) == 'i') {
//                    ies++;
//                }
//                else if (frase.toLowerCase().charAt(i) == 'u') {
//                    ues++;
//                }
//                else if (frase.toLowerCase().charAt(i) == ' ') {
//                    contadorEspacios++;
//                }
//
//
//
//
//
//        }
//        IO.println("La frase introducida es: " + frase);
//        IO.println("Se han contado las " + (aes +ees +oes +ies +ues) + " vocales" );
//        IO.println("Se han encontrado " + contadorEspacios);
//        IO.println("Se han encontrado " + frase.length() + " caracteres");
//        IO.println("Se han encontrado char A " + letraA);
//
//
//
//        IO.println("EJERCICIO8");
//        IO.println("Dime cuantos alumnos hay en clase");
//
//        int aprob = 0;
//        int susp = 0;
//        int superioresMedia = 0;
//        int alumnos = scan.nextInt();
//        double sumaNotas = 0;
//        double notaMedia = 0;
//        double porcentajeAprob = 0;
//
//        scan.nextLine();
//        if (alumnos > 0) {
//
//            String nombre [] = new String[alumnos];
//            double nota [] = new double[alumnos];
//            for (int i = 0; i <nombre.length ; i++) {
//                IO.println("Dime el nombre completo del alumno" +(i));
//                nombre[i]= scan.nextLine();
//
//
//            }
//
//
//            for (int i = 0; i <nombre.length ; i++) {
//                IO.println("Dime la nota del " +(nombre[i]));
//                nota[i] = scan.nextDouble();
//
//                while (nota [i] <0 || nota[i]>10){
//                    IO.println("Nota incorrecta. Introduce otra:");
//                    nota[i] = scan.nextDouble();
//                }
//            }
//
//            for (int i = 0; i <nombre.length ; i++) {
//                sumaNotas +=nota[i];
//
//
//            }
//
//
//                notaMedia = sumaNotas / nombre.length;
//                IO.println("La nota media es " + notaMedia);
//            double notaMaxima = nota[0];
//            double notaMinima = nota [0];
//
//            for (int i = 0; i < nombre.length ; i++) {
//
//                notaMaxima= Math.max(nota[i], notaMaxima);
//                notaMinima = Math.min(nota[i], notaMinima);
//
//            }
//            IO.println("La nota maxima es " +notaMaxima);
//            IO.println("La nota minima es " +notaMinima);
//
//            for (int i = 0; i <nombre.length ; i++) {
//                if (nota[i] >=5) {
//                    aprob++;
//                } else  {
//                    susp++;
//                }
//
//            }
//            IO.println("Han aprobado " + aprob + " alumnos");
//            IO.println("Han suspendido " + susp + " alumnos");
//
//            for (int i = 0; i <nombre.length ; i++) {
//                if (nota[i] > notaMedia) {
//                    superioresMedia++;
//                }
//
//            }
//            IO.println("Hay" + superioresMedia + " alumnos con nota superior a media");
//
//
//            for (int i = 0; i <nombre.length ; i++) {
//                if (nota[i] <3 ) {
//                    IO.println(nombre[i] + " Muy deficiente");
//                }
//                else if (nota[i] >=3 && nota[i]<5)
//                {
//                    IO.println(nombre[i] + " Insuficiente");
//                }
//
//                else if (nota[i] >=5 && nota[i] <6)
//                {
//                    IO.println(nombre[i] + " Bien");
//                }
//
//                else if (nota[i] >=6 && nota[i] <9)
//                {
//                    IO.println(nombre[i] + " Notable");
//                }
//                else
//                {
//                    IO.println(nombre[i] + " Sobresaliente");
//                }
//
//            }
//
//            porcentajeAprob = (aprob*100.0)/nombre.length;
//
//            IO.println("El porcenaje de los alumnos aprobados es de " + porcentajeAprob);
//
//
//
//        }
//        else {
//            IO.println("Introduce el numero correcto");
//        }


        IO.println("EJERCICIO9");

//        for (int i = 0; i < datos.length; i++) {       // Filas
//            for (int j = 0; j < datos[i].length; j++) { // Columnas
//
//                IO.println(datos[i][j]);
//
//            }
//        }
        scan = new Scanner(System.in);
        int [] [] matrizEj1 = new int[5][5];

        int numEj1 = 1;

        for(int i = 0; i < matrizEj1.length; i++){
            IO.print("|");
            for(int j = 0; j < matrizEj1[i].length; j++){
                matrizEj1[i][j] = numEj1;
                numEj1++;
                IO.print(matrizEj1[i][j] + " ");
            }
            IO.println("|");
        }
        IO.println();






    }
}