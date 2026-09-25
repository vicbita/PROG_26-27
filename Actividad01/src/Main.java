import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {

        /*
        Ej1:Escribe un programa que dé los “buenos días”.
        */
        System.out.println("Buenos dias");

        /*
        Ej2:Escribe un programa que calcule y
        muestre el área de un cuadrado de lado igual a 5.
        */

        int lado = 5;
        System.out.println("El area del cuadrado es" +lado*lado);

         /*
        Ej3:Escribe un programa que calcule el área de un
        cuadrado cuyo lado se introduce porteclado.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el lado");
        int lado2 = scan.nextInt();
        System.out.println("EL area es " + lado2*lado2);

        /*
        Ej4:Escribe un programa que lea dos números, calcule y
        muestre el valor de sus suma, resta,producto y división.
        */
        scan = new Scanner(System.in); /*En este ej. estaba probando que pasa si le doy un numero decimal, y por eso he puesto double para practicar*/
        System.out.println("Dime primer numero");
        double numero = scan.nextDouble();
        System.out.println("Dime segundo numero");
        double numero2 = scan.nextDouble();
        System.out.println("La suma es " + (numero+numero2) );
        System.out.println("La resta es " + (numero-numero2) );
        System.out.println("La multiplicacion es " + (numero*numero2) );
        System.out.println("La division es " + (numero/numero2) );

        /*
        Ej5:Escribe un programa que toma como dato de entrada un número
        que corresponde a la longitud de un radio y nos escribe la longitud de la
        circunferencia, el área del círculo y el volumen de la esfera que corresponden
        con dicho radio.
        */
        scan = new Scanner(System.in);
        System.out.println("Dime el radio");
        double radio = scan.nextDouble();
        System.out.println("La longitud de circunferencia es " + (2 * 3.14 * radio));
        System.out.println("El area de círculo  es " + (3.14 * radio * radio));
        System.out.println("El volumen de la esfera es " + ((4/3.0) *3.14 * radio * radio * radio));

        /*
        Ej6:Escribe un programa que dado el precio de un artículo y el
        precio de venta real nos muestre el porcentaje de descuento realizado.
        */
        scan=new Scanner(System.in);
        System.out.println("Dime el precio de articulo");
        double precioart = scan.nextDouble();
        System.out.println("Dime el precio real");
        double precioreal = scan.nextDouble();
        System.out.println(("El porcentaje final de discuento es" + ((precioart-precioreal) / precioart) * 100) + " %") ;

        /*
        Ej7: Escribe un programa que lea un valor correspondiente a una distancia en millas marinas
        y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros
        */
        scan = new Scanner(System.in);
        System.out.println("Dime la distancia en millas marinas");
        double distancia = scan.nextDouble();
        System.out.println("La distancia en metros es " + (distancia * 1852));

        /*
        Ej8: Escribe un programa que lee dos números y los visualiza en orden ascendente
        */
        System.out.println("Dime dos numeros y te les pongo en orden ascendente");
        scan = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int numero3 = scan.nextInt();
        System.out.println("Dime segundo numer");
        int numero4 = scan.nextInt();
        System.out.println("El numero mas pequeño es " + (Math.min(numero3, numero4) + " El numero mayor es " + (Math.max(numero3, numero4))));


        /*
        Ej9:Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.
        */
        System.out.println("Dime dos numeros y te digo cual es mayor o si son iguales");
        scan = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int numero5 = scan.nextInt();
        System.out.println("Dime el segundo numero");
        int numero6 = scan.nextInt();
        System.out.println("El numero mayor es num1 " + (numero5>numero6));
        System.out.println("El numero mayor es num2 " + (numero5<numero6));
        System.out.println("Son iguales " + (numero5==numero6));

        /*
        Ej10:Escribe un programa que lea tres números distintos y nos diga cuál es el mayor
        */
        System.out.println("Dime tres numeros y te digo cual es mayor");
        scan = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int numero7 = scan.nextInt();
        System.out.println("Dime el segundo numero");
        int numero8 = scan.nextInt();
        System.out.println("Dime el tercer numero");
        int numero9 = scan.nextInt();
        System.out.println("");

    }

}