import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
       /*
       Ej1:Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres
        mayor de edad” solo si lo somos.
       */
        System.out.println("EJERCICIO1");
        System.out.println("Dime tu edad");
        Scanner scan = new Scanner(System.in);
        int edad = scan.nextInt();
        if (edad > 18) {
            System.out.println("Eres mayor de edad");
        }

       /*
       Ej2:Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres
       mayor de edad” o el mensaje de “eres menor de edad”.
        */
        System.out.println("EJERCICIO2");
        System.out.println("Dime tu edad");
        scan = new Scanner(System.in);
        int edad2 = scan.nextInt();
        if (edad2 > 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        /*
        Ej3: Realiza un programa que muestre por pantalla los
        20 primeros números naturales (1, 2, 3... 20)
        */
        System.out.println("EJERCICIO3");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        /*
        Ej4:Realiza un programa que muestre los números pares comprendidos
        entre el 1 y el 200.
        Para ello utiliza un contador y suma de 2 en 2.
        */
        System.out.println("EJERCICIO4");
        for (int i = 0; i <= 200; i = i + 2) {
            System.out.println(i);
        }

        /*
        Ej5:Realiza un programa que muestre los números pares comprendidos entre el 1
        y el 200.
        Esta vez utiliza un contador sumando de 1 en 1.
        */
        System.out.println("EJERCICIO5");
        for (int i = 0; i <200 ; i++)
        {
            if (i % 2 ==0) //aqui compruebo si el resto es 0 es par, entoces lo pinto en pantalla
            {
                System.out.println(i);
            }
        }

        /*
        Ej6:Realiza un programa que muestre los números desde el 1 hasta un número N que se
        introducirá por teclado
        */
        System.out.println("EJERCICIO6");
        System.out.println("Dime un numero");
        scan =new Scanner(System.in);
        int numero = scan.nextInt();
        for (int i = 1; i<= numero; i++)
        {
            System.out.println(i);
        }

        /*
        Ej7:Escribe un programa que lea una calificación numérica entre 0 y 10
        y la transforma en
        calificación alfabética, escribiendo el resultado
        */
        System.out.println("EJERCICIO7");
        System.out.println("Dime que nota has sacado");
        scan =new Scanner(System.in);
        int nota = scan.nextInt();
        if (nota <=3)
        {
            System.out.println("Muy Deficiente");
        }

        else if (nota<5)
        {
            System.out.println("Insuficiente");
        }

        else if (nota<=6)
        {
            System.out.println("Bien");
        }

        else if (nota<=9)
        {
            System.out.println("Notable");
        }

        else
        {
            System.out.println("Sobresaliente");
        }

        /*
        Ej8:
        Realiza un programa que lea un número positivo N y calcule y
        visualice su factorial N! Siendo el factorial:
        */
        System.out.println("EJERCICIO8");
        System.out.println("Dime el numero");
        scan = new Scanner(System.in);
        double numfact = scan.nextDouble();
        int facto = 1;
        for (int i = 1; i<=numfact ; i++)
        {
        facto = facto *i;
        }
        System.out.println("El factorial es "+ facto);


        /*
        Ej9:Escribe un programa que recibe como datos de entrada una
        hora expresada en horas,
        minutos y segundos que nos calcula y escribe la hora, minutos y segundos que serán,
        transcurrido un segundo.
        */
        System.out.println("EJERCICIO9");
        System.out.println("Dime la hora");
        scan = new Scanner(System.in);
        int hora = scan.nextInt();
        System.out.println("Dime minuto");
        int minuto = scan.nextInt();
        System.out.println("Dime segundo");
        int segundo = scan.nextInt();
        


    }
}
