import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

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
        System.out.println();
    }

    public void salir(){
        System.out.println("Muchas gracias por utilizar nuestros servicios ");
    }
}
