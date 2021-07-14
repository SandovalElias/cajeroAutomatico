import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
         int opcionSeleccionada ;
        do {
            System.out.println("Elija una opcion");
            System.out.println("  Escriba 1 para consultar saldo");
            System.out.println("  Escriba 2 para depositar dinero");
            System.out.println("  Escriba 3 para extraer dinero");
            System.out.println("  Escriba 4 para consultar movimientos");
            System.out.println(" Escriba cualquier otro numero para salir del menu");

            Scanner scanner = new Scanner(System.in);
            opcionSeleccionada = scanner.nextInt();

            switch(opcionSeleccionada){
                case 1 :
                    System.out.println("La opcion elegida es consulta de saldo ");
                    break;
                case 2:
                    System.out.println("La opcion elegida es depositar ");
                    break;
                case 3:
                    System.out.println("La opcion elegida es extraccion");
                    break;
                case 4:
                    System.out.println("La opcion elegida es consultar movimientos");
                    break;
                default:
                    System.out.println("Muchas gracias por utilizar nuestros servicios");
            }

        } while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada == 4);

    }

}
