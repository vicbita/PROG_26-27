import java.util.Scanner;

public class Main
{
   public static void main (String[] args)
   {
       /*
       Ej1:Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres
        mayor de edad” solo si lo somos.
       */
       System.out.println("EJERCICIO1");
       System.out.println("Dime tu edad");
       Scanner scan =new Scanner(System.in);
       int edad = scan.nextInt();
       if (edad>18)
       {
           System.out.println("Eres mayor de edad");
       }


   }
}
