import java.util.Arrays;
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
        scan = new Scanner(System.in);
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
        scan = new Scanner(System.in);
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
        IO.println("EJERCICIO4");
        scan = new Scanner(System.in);
        IO.println("Introduze 20 numeros por pantalla");
        int numero4[] = new int[20];
        int sumaPos = 0;
        int sumaNeg = 0;
        for (int i = 0; i < numero4.length ; i++)
        {
            IO.println("Introduze  numero " + (i + 1));
            numero4[i] = scan.nextInt();
        }

        for (int i = 0; i < numero4.length; i++)
        {
            if (numero4[i] > 0)
            {
                sumaPos = sumaPos + numero4[i];
            }
            else
            {
                sumaNeg = sumaNeg + numero4[i];
            }
        }
        IO.println("La suma de los positivos es " + sumaPos);
        IO.println("La suma de los negativos es " + sumaNeg);

        /*
        EJ5: Crea un programa que pida veinte números reales por teclado, los almacene en un array
        y luego lo recorra para calcular y mostrar la media:
        (suma de valores) / nº de valores.
        */
        IO.println("EJERCICIO5");
        scan = new Scanner(System.in);
        IO.println("Introduze 20 numeros por pantalla");
        double numero5[] = new double[20];
        double sumaNumeros = 0;
        for (int i = 0; i < numero5.length ; i++)
        {
            IO.println("Introduze  numero " +(i+1));
            numero5[i] =scan.nextDouble();
        }
        for (int i = 0; i < numero5.length ; i++)
        {
            sumaNumeros = sumaNumeros+ numero5[i];
        }
        IO.println("La suma media es " +sumaNumeros/numero5.length);

        /*
        EJ6:Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño
        N, escriba M en todas sus posiciones y lo muestre por pantalla.
        */
        IO.println("EJERCICIO6");
        scan = new Scanner(System.in);
        IO.println("Introduze valor M en pantalla");
        int valorM = scan.nextInt();
        IO.println("Introduze valor N en pantalla");
        int valorN = scan.nextInt();

        int numero6[] = new int[valorN];
        for (int i = 0; i <numero6.length ; i++)
        {
            numero6[i]=valorM  ;
        }
        for (int i = 0; i <numero6.length ; i++)
        {
            IO.println("Los valores son " + numero6[i]);
        }
        /*
        EJ7:Crea un programa que pida dos valores enteros P y Q,
        luego cree un array que contenga
        todos los valores desde P hasta Q, y lo muestre por pantalla.
        */
        IO.println("EJERCICIO7");
        scan = new Scanner(System.in);
        IO.println("Introduce valor P en pantalla");
        int valorP = scan.nextInt();
        IO.println("Introduce valor Q en pantalla");
        int valorQ = scan.nextInt();
        //aqui hago vQ-vP+1 pq si tenemos desde 3 hasta 7 tenemos que rellenar 5 numeros, es decir 7-3+1=5
        int numero7[] = new int[Math.abs(valorQ-valorP+1)];
        for (int i = 0; i < numero7.length ; i++)
        {

            numero7[i]= valorP++;
            IO.println("Los valores introducidos son " + numero7[i]);
        }
        /*
        EJ8:Crea un programa que cree un array con 100 números reales aleatorios
        entre 0.0 y 1.0, utilzando Math.random(), y luego le pida al usuario
        un valor real R. Por último, mostrará cuántos valores del array son
        igual o superiores a R.
        */
        IO.println("EJERCICIO8");
        scan = new Scanner(System.in);
        double numero8[]= new double[100];
        for (int i = 0; i < numero8.length; i++)
        {
            numero8[i] = Math.random();
        }
        IO.println("Introduce el valor R" );
        double numeroR = scan.nextDouble();
        int valoresR= 0;
        for (int i = 0; i < numero8.length ; i++)
        {
            if (numero8[i] >=numeroR)
            {
                valoresR++;
            }

        }
        IO.println("Se han contado " + valoresR + " numeros mayores que R ");

        /*
        EJ9:Crea un programa que cree un array de enteros de tamaño 100 y lo rellene
        con valores enteros aleatorios entre 1 y 10
        (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará
        en qué posiciones del array aparece N.
        */
        IO.println("EJERCICIO9");
        scan = new Scanner(System.in);
        int numero9[]= new int[100];
        for (int i = 0; i < numero9.length; i++)
        {
            numero9[i] = 1 + (int)(Math.random()*10);

        }
        IO.println("Dime el valor N ");
        int valorN2 = scan.nextInt();
        for (int i = 0; i < numero9.length ; i++)
        {
            if (numero9[i] == valorN2 )
            {
                IO.println("El numero aparece en la posicion " + i);//la i es la posicion y numero9[i] es valor que tiene esa posicion
            }

        }

        /*
        EJ10: Crea un programa para realizar cálculos relacionados con la altura (en metros) de
        personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado.
        Luego mostrará la altura media, máxima y mínima, así como cuántas personas
        miden por encima y por debajo de la media.
        */
        IO.println("EJERCICIO10");
        scan = new Scanner(System.in);
        IO.println("Dime el valor N ");
        int personasN = scan.nextInt();
        double altura [] = new double[personasN];
        double sumaAltura= 0;
        int contadorMax= 0;
        int contadorMin = 0;

        for (int i = 0; i < altura.length; i++)
        {
            IO.println("Introduce la altura de las personas " + (i+1));
            altura[i]= scan.nextDouble();
        }

        double maxAltura = altura[0];
        double minALtura = altura[0];
        for (int i = 0; i <altura.length ; i++)
        {
            sumaAltura = sumaAltura+altura[i];
            maxAltura = Math.max(altura[i],maxAltura);
            minALtura = Math.min(altura[i], minALtura);


        }
        double alturaMedia = sumaAltura/personasN;
        for (int i = 0; i <altura.length ; i++)
        {


            if (altura[i] < alturaMedia)
            {
                contadorMin++;
            }
            else if (altura[i]>alturaMedia)
            {
                contadorMax++;
            }
        }



        IO.println("La altura maxima es " + maxAltura);
        IO.println("La altura minima es " + minALtura);
        IO.println("La altura media es " + alturaMedia);
        IO.println("Han encontrado " + contadorMin + " perosnas por debajo de altura media");
        IO.println("Han encontrado " + contadorMax + " personas por encima de la altura media");


        /*EJ11: Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en
        //el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores
        del primer array al segundo array en orden inverso, y mostrar ambos por pantalla
        */
        IO.println("EJERCICIO11");
        scan = new Scanner(System.in);
        int array1[]  = new int[100];
        int array2[] = new int[100];
        for (int i = 0; i < array1.length; i++)
        {
            array1[i] = i+1;
        }

        for (int i = 0; i < array2.length ; i++)
        {
            array2[i]= array1[array1.length-1-i];
        }

        for (int i = 0; i <array2.length ; i++)
        {
            IO.println("Array 1 " + array1[i]);
            IO.println("Array 2 " + array2[i]);
        }
        IO.println(Arrays.toString(array1));
        IO.println(Arrays.toString(array2));


         /*EJ12: . Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú
            con distintas opciones:
            a. Mostrar valores.
            b. Introducir valor.
            c. Salir.
        */
        IO.println("EJERCICIO12");
        scan = new Scanner(System.in);
        int numerosE12[]  = new int[10];
        String opcion = "c";

        do{
            IO.println("Bienvenido a nuestro programa, escoja una de las opciones propuestas ");
            IO.println("a) Mostrar valores");
            IO.println("b) Introducir valor");
            IO.println("c) Salir");

            opcion = scan.nextLine();
            switch (opcion)
            {
                case "a":
                    IO.println(Arrays.toString(numerosE12));
                    break;
                case "b":
                    scan.nextLine();
                    IO.println("Por favor, introduzca el valor del numero entero que quiere insertar");
                    int v = scan.nextInt();
                    IO.println("Por favor, introduzca la posicion del array donde quiere insertar el valor");
                    int p = scan.nextInt();
                    if(p >= 0 && p < numerosE12.length)
                    {
                        numerosE12[p] = v;
                    }
                    else
                    {
                        IO.println("El valor de la posicion no es correcto");
                    }
                    break;
                case "c":
                    IO.println("Gracias por utiliar nuestra APP, el programa se cerrara a continuación");
                default:
                    IO.println("Opcion invalida, escoja otra opcion");

            }


            }
        while(!opcion.equals("c"));





        /*EJ13*/
        IO.println("Ejercicio13");
        scan = new Scanner(System.in);
        IO.println("Introduce el valor inicial");
        int V= scan.nextInt();
        IO.println("Introduce el incremento");
        int incremento = scan.nextInt();
        IO.println("Introduce el numero de elementos a crear");
        int nElementos = scan.nextInt();
        int numerosE13[] = new int[nElementos];

        numerosE13[0] = V;

        for (int i = 1; i <numerosE13.length ; i++)
        {
            numerosE13[i] = numerosE13[i-1]+incremento;
        }
        IO.println(Arrays.toString(numerosE13));


        /*EJ14*/
        IO.println("Ejercicio14");
        scan = new Scanner(System.in);
        int numE14 = 10;
        int tamanoArray = numE14 * (numE14+1) /2; //suma de la serie aritmetica
        int numerosE14 [] = new int[tamanoArray];

        int indiceActual = 0;
        for (int numeroo = 1; numeroo < numE14 ; numeroo++)
        {

            for (int i = 0; i < numerosE14.length; i++)
            {
                numerosE14[indiceActual] = numeroo;
                indiceActual++;
            }
        }

        IO.println(Arrays.toString(numerosE14));

        

    }
}