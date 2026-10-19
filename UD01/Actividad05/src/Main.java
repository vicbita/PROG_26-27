import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {

        /*
        EJ1:Crea un programa que pida una cadena de texto por teclado y luego muestre cada
        palabra de la cadena en una línea distinta
        */
        IO.println("EJERCICIO1");
        Scanner scan = new Scanner(System.in);
        IO.println("Introduce el texto");
        String texto = scan.nextLine();

        String palabras [] = texto.split(" ");

        for (int i = 0; i < palabras.length ; i++)
        {
            IO.println(palabras[i]);
        }

        /*
        EJ2:Crea un programa que pida dos cadenas de texto por teclado y luego indique si son
        iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
        */
        IO.println("EJERCICIO2");
        scan = new Scanner(System.in);
        IO.println("Introduce el texto 1 ");
        String texto1 = scan.nextLine();
        IO.println("Introduce el texto 2 ");
        String texto2 = scan.nextLine();

        if (texto1.equals(texto2)) //compara si son iguales o no
        {
            IO.println("Los textos son iguales");
        }
        else if (texto1.equalsIgnoreCase(texto2)) //Compara igual que si son mayusculas o minusculas
        {
            IO.println("Las frases son iguales ingorando mayusculas y minusculas");
        }
        else
        {
            IO.println("Las frases son distintas");
        }

        /*
        EJ3:Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
        Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
        las tres primeras letras de cada uno de ellos. Por ejemplo, si se introduce “Lionel”,
        “Tarazón” y “Alcocer” mostrará “LIOTARALC”.
        */
        IO.println("EJERCICIO3");
        scan = new Scanner(System.in);
        IO.println("Introduce el Nombre ");
        String nombre = scan.nextLine();
        IO.println("Introduce primer Apellido ");
        String apellido1 = scan.nextLine();
        IO.println("Introduce segundo Apellido ");
        String apellido2 = scan.nextLine();

        String codigo  = (nombre.substring(0,3) + apellido1.substring(0,3) + apellido2.substring(0,3)).toUpperCase();
        //substring coge un trozo de string, osea coge de 0 hasta 3 caracteres, y luego les mete mayusculas
        IO.println(codigo);

        /*
        EJ4:Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas
        ‘a’, cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
        mayúsculas y minúsculas. Por ejemplo, dada la frase “Mi mama me mima” dirá que hay:
        Nº de A's: 3
        Nº de E's: 1
        Nº de I's: 2
        Nº de O's: 0
        Nº de U's: 0
        */
        IO.println("EJERCICIO4");
        scan = new Scanner(System.in);
        IO.println("Introduce la frase ");
        String frase = scan.nextLine();
        int aes = 0, ees = 0, oes = 0, ies = 0, ues= 0;
        //cojo la frase que tengo, la paso a minusculas, y la convierto a toCharArray, me convienrte eso en un array de caracteres
        for (char c :frase.toLowerCase().toCharArray())
        {
            switch (c)
            {
                case 'a' -> aes++;
                case 'e' -> ees++;
                case 'o' -> oes++;
                case 'i' -> ies++;
                case 'u' -> ues++;
            }
        }

        IO.println("Se han detectado " + aes + " a");
        IO.println("Se han detectado " + ees + " e");
        IO.println("Se han detectado " + oes + " o");
        IO.println("Se han detectado " + ies + " i");
        IO.println("Se han detectado " + ues + " u");


        /*
        EJ5:Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo
        o no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas).
        Supondremos que el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni
        acentos, etc.). Un palíndromo es un texto que se lee igual de izquierda a derecha que de
        derecha a izquierda.
        Por ejemplo:
        Amigo no gima
        Dabale arroz a la zorra el abad
        Amo la pacífica paloma
        A man a plan a canal Panama
        */
        IO.println("EJERCICIO5");
        scan = new Scanner(System.in);
        IO.println("Introduce la frase ");
        String frase2 = scan.nextLine();
        //aqui hago que la frase2 se cambia, se quitan los espacion y se pone todo en minusculas.
        String fraseProcesada = frase2.replace(" ", "").toLowerCase();

        //Algoritmo para ver si es palindromo
        boolean esPalindromo = true;
        int izquierda = 0;
        int derecha = fraseProcesada.length() -1;
        while (izquierda < derecha)
        {
            if (fraseProcesada.charAt(izquierda) != fraseProcesada.charAt(derecha))
            {
                esPalindromo = false;
                break;
            }
           else
           {
                izquierda++;
                derecha--;
            }
        }
        IO.println("Son polindromos " + esPalindromo);




    }
}

