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
            IO.println("La suma es " + (numero+numero2));
            break;
          case 2:
            IO.println("El resto es "+ (numero-numero2));
            break;
          case 3:
            IO.println("La multiplicacion es " + (numero*numero2));
            break;
          case 4:
            if (numero2 ==0)
            {
              IO.println("Cuidado devides entre 0");
            }
            else
            {
              IO.println("La division es " + (numero/numero2));
            }
            break;
            
        }
      }
    while (opcion!=5);


    IO.println("EJERCICIO1,Otra forma");
    scan = new Scanner(System.in);
    int dineroo =0;
    int dineroRestante = 0;

    //Pido la cantidad de dinero comprobando si es multiplo de 5 y tomando el valor absoluto
    do
    {
      IO.println("Introduza la cantidad de dinero multiplo de 5");
      dineroo = Math.abs(scan.nextInt());

    }
    while (dinero %5 != 0);

    int n500=0, n200 =0, n100=0, n50=0, n20 =0, n10 = 0, n5 = 0;
    dineroRestante = dineroo;
    if (dineroRestante >= n500)
    {
      n500 = dineroRestante / 500;
      dineroRestante = dineroRestante % 500;
    }
    if (dineroRestante >=200)
    {
      n200 = dineroRestante / 200;
      dineroRestante = dineroRestante % 200;
    }
    if (dineroRestante >=100)
    {
      n100 = dineroRestante / 100;
      dineroRestante = dineroRestante % 100;
    }
    if (dineroRestante >=50)
    {
      n50 = dineroRestante / 50;
      dineroRestante = dineroRestante % 50;
    }
    if (dineroRestante >=20)
    {
      n20 = dineroRestante / 20;
      dineroRestante = dineroRestante % 20;
    }
    if (dineroRestante >=10)
    {
      n10 = dineroRestante / 10;
      dineroRestante = dineroRestante % 10;
    }
    if (dineroRestante >=5)
    {
      n5 = dineroRestante / 5;
      dineroRestante = dineroRestante % 5;
    }

    IO.println("Billetes de 500 = " + n500);
    IO.println("Billetes de 200 = " + n200);
    IO.println("Billetes de 100 = " + n100);
    IO.println("Billetes de 50 = " + n50);
    IO.println("Billetes de 20 = " + n20);
    IO.println("Billetes de 10 = " + n10);
    IO.println("Billetes de 5 = " + n5);










  }
}
