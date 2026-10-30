import java.util.Scanner;

public class Main
{
    public static void main (String[] args)
    {

        Scanner scan = new Scanner(System.in);
        IO.println("EXAMEN");

        IO.println("Dame la cantidad de numeros para guardar ");
        int cantidad = scan.nextInt();
        int numeros [] = new int[cantidad];
        int valores [] = new int [cantidad];

        int dimensionIncial = numeros.length;
        for (int i = 0; i < numeros.length ; i++)
        {
            IO.println("Inserte el valor " +(i));
            valores[i] = scan.nextInt();

        }

        int suma = 0;
       double media = 0.0;



        String opcion = "s";
        IO.println("Bienvenido a nuestro programa, escoja una de las opciones propuestas ");
        IO.println("1) Insertar número."); //no
        IO.println("2) Borrar número de una posición específica"); //si, pero se pone un 0 en vez de borrar =(
        IO.println("3) Modificar número de una posición específica");// si
        IO.println("4) Media de los valores");//si
        IO.println("5) Suma de los valores");//si
        IO.println("6) Máximo de la colección");//si
        IO.println("7) Mínimo de la colección");//si
        IO.println("8) Ampliar el valor de la colección");// no,
        IO.println("9) Mostrar los valores"); //si, ademas sirve para comprobar el borrar, modificar, etc...
        IO.println("s) Salir."); //si

        //for para suma total (bien)
        for (int i = 0; i <numeros.length ; i++) {
            suma +=valores[i];
        }
        //Fórmula para media (bien)
        media = suma / numeros.length;

        // Max y min(bien)
        int max = valores[0];
        int min =valores[0];
        for (int i = 0; i <numeros.length ; i++) {
            max= Math.max(valores[i], max);
            min= Math.min(valores[i], min);
        }

        //Borrar (bien)
        int index = -1;

        //Modificar
        int indexMod = -1;

        scan.nextLine();


        do {
            opcion = scan.nextLine();
            switch (opcion) {
                case "1":
                    IO.println("Insertar número.");
                    int numeroInsertado = scan.nextInt();
                    IO.println("El numero se ha insertado correctamente (NO)");

                    break;
                case "2":
                    IO.println("Borrar número de una posición específica");
                    IO.println("Dime la posicion");
                    int posicionBorrar = scan.nextInt();

                    boolean resultadoBorrar = false;
                    if (numeros != null) {

                        for (int i = 0; i < numeros.length; i++) {
                            if (valores[i] == posicionBorrar) {
                                index = i;
                                break;
                            }
                        }
                    }
                    valores[index]=0;
                    resultadoBorrar = true;



                    IO.println("El numero se ha borrado correctamente " + resultadoBorrar);
                    break;

                case "3":
                    IO.println("Modificar número de una posición específica");
                    IO.println("Dime la posicion para modificar");
                    int posicionModificar = scan.nextInt();
                    boolean resultadoModificar = false;

                    for (int i = 0; i <numeros.length ; i++) {
                        if (valores[i] == posicionModificar) {
                            indexMod = i;
                            break;
                        }
                    }
                    IO.println("Introduce el valor nuevo");
                    int valorModificado = scan.nextInt();

                    valores[indexMod] = valorModificado;
                    resultadoModificar = true;
                    IO.println("El numero se ha modificado correctamente " + resultadoModificar);

                    break;


                case "4":
                    IO.println("Media de los valores");
                    IO.println("El valor medio es  " + media);
                    break;

                case "5":
                    IO.println("Suma de todos los valores");
                    IO.println("La suma de todos los valores es " +suma);
                    break;


                case "6":
                    IO.println("Máximo de la colección");
                    IO.println("La nota maxima es " + max);

                    break;
                case "7":
                    IO.println("Mínimo de la colección");
                    IO.println("La nota minima es " +min);
                    break;

                case "8":
                    IO.println("Ampliar el valor de la colección");
                    int  numerosAux[]= new int[numeros.length+ dimensionIncial];
                    for (int i = 0; i <numeros.length ; i++) {

                        numerosAux [i] = numeros[i];
                    }
                    numeros = numerosAux;



                    case "9":
                    IO.println("Mostrar los valores");
                    for (int i = 0; i < numeros.length ; i++)
                    {
                        IO.println("Los valores  son " + valores[i]);
                    }
                    break;



            }








        }
        while (!opcion.equals("s")) ;



    }
}
