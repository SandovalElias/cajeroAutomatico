import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        System.out.println("Elija una opcion");
        System.out.println("  Escriba 1 para consultar saldo");
        System.out.println("  Escriba 2 para depositar dinero");
        System.out.println("  Escriba 3 para extraer dinero");
        System.out.println("  Escriba 4 para consultar movimientos");

        Scanner scanner = new Scanner(System.in);
        int opcionSeleccionada = scanner.nextInt();
        System.out.println("La opcion elegida es:3 " + opcionSeleccionada);

    }

}
