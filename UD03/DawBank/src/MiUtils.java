import java.util.Scanner;

public class MiUtils {
    public static double leerDoublepantalla(String mensaje){
        Scanner sc = new Scanner(System.in);
        IO.println(mensaje);
        return sc.nextDouble();
    }

    public static String leerTextoPantalla (String mensaje){
        Scanner sc = new Scanner(System.in);
        IO.println(mensaje);
        return sc.nextLine();

    }

    public static boolean comprobarPatron (String patron, String texto){
        boolean isOk= false;
        isOk= texto.matches(patron);
        return isOk;
    }

    public static String comprobarPatronRepetidamente(String patron, String mensaje){
        boolean isOk= false;
        String texto = "";
        do {
            texto =MiUtils.leerTextoPantalla(mensaje);
            isOk = MiUtils.comprobarPatron(patron,texto);
            if (!isOk){
                IO.println("El formato es incorrecto, vuelva a intentarlo");
            }
        }while (!isOk);
        isOk= texto.matches(patron);
        return texto;
    }
}
