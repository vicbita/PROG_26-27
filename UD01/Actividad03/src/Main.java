import java.util.Scanner;

public class Main
{
  public static void main (String[] args)
  {
  /*
  EJ1: Realiza un programa que dada una cantidad de euros que el usuario introduce por
  teclado (múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para
  alcanzar dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5).
  Hay que indicar el mínimo de billetes posible. Por ejemplo, si el usuario introduce 145 el
  programa indicará que será necesario 1 billete de 100 €, 2 billetes de 20 € y 1 billete de
  5 € (no será válido por ejemplo 29 billetes de 5, que aunque sume 145 € no es el mínimo
  número de billetes posible).
  */
    System.out.println("EJERCICIO1");
    Scanner scan =new Scanner(System.in);
    int billete5 = 0;
    int billete10 = 0;
    int billete20 = 0;
    int billete50 = 0;
    int billete100 = 0;
    int billete200 = 0;
    int billete500 = 0;
    IO.println("Introduce cantidad de € en multiplo de 5");
    int dinero = scan.nextInt();


    billete500 = dinero/500;
    dinero = dinero%500;
    billete200 = dinero/200;
    dinero = dinero%200;
    billete100 = dinero/100;
    dinero = dinero%100;
    billete50 = dinero/50;
    dinero = dinero%50;
    billete20 = dinero/20;
    dinero = dinero%20;
    billete10 = dinero/10;
    dinero = dinero%10;
    billete5 = dinero/5;
    dinero = dinero%5;
    //aqui cogo el numero introducido y le divido entre billete, y guardo el resto que queda, luego el resto divido entre otro billete.
    IO.println("Billetes de 500 = " + billete500);
    IO.println("Billetes de 200 = " + billete200);
    IO.println("Billetes de 100 = " + billete100);
    IO.println("Billetes de 50 = " + billete50);
    IO.println("Billetes de 20 = " + billete20);
    IO.println("Billetes de 10 = " + billete10);
    IO.println("Billetes de 5 = " + billete5);


    /*
    Ej2:Realiza un programa que muestre un menú de opciones como el siguiente:
    1. Sumar
    2. Restar
    3. Multiplicar
    4. Dividir (incluir manejo de división por 0)
    5. Salir
    El menú debe de repetirse hasta que se escoja la opción 5 (Salir)
    */
    System.out.println("EJERCICIO2");
    scan =new Scanner(System.in);
    IO.println("Dime primer numero");
    int numero = scan.nextInt();
    IO.println("Dime segundo numero");
    int numero2 = scan.nextInt();
    int opcion;
    do {
      IO.println("Introduze el numero del menu");
      IO.println("1-Suma");
      IO.println("2-Resta");
      IO.println("3-Multiplicar");
      IO.println("4-Dividir");
      IO.println("5-Salir");

        switch (opcion= scan.nextInt())
        {
          case 1:
            IO.println(numero+numero2);
            break;
          case 2:
            IO.println(numero-numero2);
            break;
          case 3:
            IO.println(numero*numero2);
            break;
          case 4:
            if (numero2 ==0)
            {
              IO.println("Cuidado devides entre 0");
            }
            else
            {
              IO.println(numero/numero2);
            }
            break;
        }
      }
    while (opcion!=5);

  }
}
