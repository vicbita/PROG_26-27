import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //aqui he hecho un array de 3 para tener 3 opciones que ordenador puede elegir
        double ordenador [] = new double[3];
        String piedra = "Piedra" ;
        String papel = "Papel";
        String tijera = "Tijera";
        String opcion = "s";


        IO.println("Bienvenido a nuestro programa, escoja una de las opciones propuestas y vamos a jugar a Piedra Papel Tijera");
        do {
            //aqui intento hacer un random de ese array para que por ejemplo si cae 0 es piedra, si cae 1 es papael, y si cae 2 es tijera.
            for (int i = 0; i < ordenador.length ; i++)
            {
                ordenador[i] = 1 + (int)(Math.random()*10);
                if (i == 0)
                {
                    IO.println(piedra);
                }
                else if (i == 1)
                {
                    IO.println(papel);
                }
                else IO.println(tijera);

            IO.println("a) Escoger piedra");
            IO.println("b) Escoger papel");
            IO.println("c) Escoger tijera");
            IO.println("s) Salir");

            opcion = scan.nextLine();
            switch (opcion) {

                case "a":
                    IO.println("Has escogido piedra, ordenador ha escogido " + i );
                    if (i == 0)
                    {
                        IO.println("EMPATE");
                    } else if (i == 1)
                    {
                        IO.println("HAS PERDIDO :( ");
                    }
                    else IO.println("HAS GANADO!!!!!");
                    break;
                case "b":
                    IO.println("Has escogido papel, ordenador ha escogido "  + i );
                    if (i == 0)
                    {
                        IO.println("HAS GANADO!!!!!");
                    } else if (i == 1)
                    {
                        IO.println("EMPATE");
                    }
                    else IO.println("HAS PERDIDO :( ");
                    break;

                case "c":
                    IO.println("Has escogido tijera, ordenador ha escogido " + i );
                    if (i == 0)
                    {
                        IO.println("HAS PERDIDO :( ");
                    } else if (i == 1)
                    {
                        IO.println("HAS GANADO!!!!!");
                    }
                    else IO.println("EMPATE");
                    break;
                case "s":
                    IO.println("Gracias por utilizar nuestra APP, el programa se cerrara a continuación");
                default:
                    IO.println("Opcion invalida, escoja otra opcion");

            }

            }
        }
        while (!opcion.equals("s"));

    /*
    Al final no me ha salido el ejercicio, mi idea era coleccionar en un array 3 numeros de 0 a 2 y si es 0 es por ejemplo piedra, etc
    Pero
    */

    }
}