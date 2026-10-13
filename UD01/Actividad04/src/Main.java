import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {
        /*
        Ej1:Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego muestre todos sus valores
         */
        IO.println("EJERCICIO1");
        Scanner scan= new Scanner(System.in);
        IO.println("Introduze 10 numeros por pantalla");
        double numero [] = new double[10];
        //aqui pido que introduce 10 num y los guardo en array con numero[i]
        for (int i = 0; i < numero.length ; i++)
        {
            IO.println("Introduze  numero " +(i+1));
            numero [i] =scan.nextDouble();

        }
        for (int i = 0; i < numero.length ; i++)
        {
            IO.println("Los valores de numero son " + numero[i]);
        }

        /*
        EJ2:Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego muestre la suma de todos los valores.
        */
        IO.println("EJERCICIO2");
        IO.println("Introduze 10 numeros por pantalla");
        double numero2[] = new double[10];
        double suma = 0;
        //este es muy parecido, solo añado una variable suma, y en segundo for digo que suma es valor incial de suma(0)+ todos valores del array
        for (int i = 0; i < numero2.length ; i++)
        {
            IO.println("Introduze  numero " +(i+1));
            numero2[i] =scan.nextDouble();
        }
        for (int i = 0; i < numero2.length; i++)
        {
        suma= suma+ numero2[i];
        }
        IO.println("La suma de todos los numeros es " + suma);

        /*
        EJ3:Crea un programa que pida diez números reales por teclado, los almacene en un array,
        y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
        */
        IO.println("EJERCICIO3");
        IO.println("Introduze 10 numeros por pantalla");
        double numero3[] = new double[10];

        for (int i = 0; i < numero3.length ; i++)
        {
            IO.println("Introduze  numero " +(i+1));
            numero3[i] =scan.nextDouble();
        }
        /*Aqui tenia un fallo, y era que he declarado las variables min y max antes de introducir datos en array, eso me daba error porque por defecto
        * como eran el la primera casilla el valor era 0, y el empezaba a guardar el resultado 0 como minimo.*/
        double min = numero3[0];
        double max = numero3[0];
        for (int i = 0; i < numero3.length ; i++)
        {
            min= Math.min(numero3[i],min );
            max =Math.max(numero3[i],max );
        }
        IO.println("El numero menor es "+ min);
        IO.println("El numero mayor es " +max);

        /*
        EJ4:Crea un programa que pida veinte números enteros por teclado, los almacene en un
        array y luego muestre por separado la suma de todos los valores positivos y negativos.

        */






    }
}