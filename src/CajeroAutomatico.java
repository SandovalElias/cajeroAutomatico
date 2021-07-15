
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class CajeroAutomatico {
    CuentaBancaria cuentaActual;

    CajeroAutomatico(String id, String password){
        double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0,500000);
        cuentaActual = new CuentaBancaria("Pedro",cantidadAleatoria);
    }

    public void getSaldo(){
        System.out.println("Su saldo es " + cuentaActual.getSaldo());
    }

    public void extraer(){
        System.out.println("¿Cuanto dinero quiere extraer?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaActual.extraer(cantidad);
    }

    public void depositar(){
        System.out.println("¿Cuanto dinero quiere depositar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaActual.depositar(cantidad);
    }

    public void ultimosMovimientos(){
        GeneradorAleatorioDeMovimientos generador = new GeneradorAleatorioDeMovimientos();
        System.out.println("Cuantos movimientos quiere consultar?");
        Scanner scanner = new Scanner(System.in);
        int cantidadMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generador.obtenerMovimientos(cantidadMovimientos,"Dolares");
        mostrarMovimientos(movimientos);

    }

    private void mostrarMovimientos(ArrayList<String> movimientos) {
        for(String mov :  movimientos){
            System.out.println(mov);
        }

    }

    public void salir(){
        System.out.println("Muchas gracias por utilizar nuestros servicios ");
    }
}
