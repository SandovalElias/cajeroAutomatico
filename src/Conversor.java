import java.math.BigDecimal;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        System.out.println("Bienvenido al conversor de moneda");
        System.out.println("Ingrese el monto en pesos" );
        Scanner scanner = new Scanner(System.in);
        double  pesos  = scanner.nextDouble();
        String pesosString = Double.toString(pesos);
        BigDecimal pesosBigDecimal = new BigDecimal(pesosString);
        double tasaDeCambio = 0.00964;
        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioDecimal= new BigDecimal( tasaDeCambioString);
        BigDecimal dolaresBigDecimal = pesosBigDecimal.multiply(tasaDeCambioDecimal);
        System.out.println(pesos + " pesos equivalen a " + dolaresBigDecimal.toString() + " dolares");
    }
}
