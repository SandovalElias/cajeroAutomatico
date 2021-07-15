package cajero;

import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        System.out.println("Por favor introduzca su numero de indentificacion");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        System.out.println("Por favor introduzca su contraseña");
        String password = scanner.nextLine();
        CajeroAutomatico cajero = new CajeroAutomatico(id,password);
        int opcionSeleccionada ;
        do {
            System.out.println("Elija una opcion");
            System.out.println("  Escriba 1 para consultar saldo");
            System.out.println("  Escriba 2 para depositar dinero");
            System.out.println("  Escriba 3 para extraer dinero");
            System.out.println("  Escriba 4 para consultar movimientos");
            System.out.println(" Escriba cualquier otro numero para salir del menu");

            opcionSeleccionada = scanner.nextInt();
            switch(opcionSeleccionada){
                case 1 :
                    cajero.getSaldo();
                    break;
                case 2:
                    cajero.depositar();
                    break;
                case 3:
                    cajero.extraer();
                    break;
                case 4:
                    cajero.ultimosMovimientos();
                    break;
                default:
                    cajero.salir();
            }

        } while (opcionSeleccionada == 1 || opcionSeleccionada == 2 || opcionSeleccionada == 3 || opcionSeleccionada == 4);

    }

}
