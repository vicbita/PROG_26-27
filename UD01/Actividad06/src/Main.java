import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {

        /*
        Ej1:Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
        y luego muestre la matriz por pantalla.
         */

        IO.println("EJERCICIO1");
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        //una matriz de 5x5
        int matriz [][] = new int[5][5];
        for (int i = 0; i < matriz.length ; i++)
        {
            numero ++;
            IO.println("Matriz " +i + ":");
            for (int j = 0; j < matriz[i].length ; j++)
            {
                IO.println(matriz[i][j] + " ");
            }
        }




    }
}