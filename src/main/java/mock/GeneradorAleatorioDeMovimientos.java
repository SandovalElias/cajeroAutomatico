package mock;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class GeneradorAleatorioDeMovimientos {
    private static final String TRANSFERENCIA = "Transferencia de ";
    private static final String INGRESO = "Ingreso de";
    private static final String RETIRADA = "Retirada de ";
    private static final String PAGO_Con_TARJERA = "Pago con tardjeta de ";
    private static final String SUELDO = "Ingrese el sueldo de ";
    private static final String PAGO_RECIBO = "Pago recibo de ";

    public ArrayList<String> obtenerMovimientos(int numeroDeMovimiento, String moneda) {
        ArrayList<String> movimientos = new ArrayList<>();
        for(int i =0 ; i < numeroDeMovimiento ; i++){
           int numeroDeMovimientos = obtenerMovimientoAleatorio(1,6);
           String tipoDeMovimiento;
           switch(numeroDeMovimiento){
               case 1:
                   tipoDeMovimiento = TRANSFERENCIA;
                   break;
               case 2 :
                   tipoDeMovimiento = INGRESO ;
                   break;
               case 3 :
                   tipoDeMovimiento = RETIRADA;
                   break;
               case 4 :
                   tipoDeMovimiento = PAGO_Con_TARJERA;
                   break;
               case 5 :
                   tipoDeMovimiento = SUELDO;
                   break;
               default:
                   tipoDeMovimiento = PAGO_RECIBO;

           }
           double cantidadAleatoria = obtenerDoubleAleatorio(1. , 9999.);
           String movimiento = tipoDeMovimiento + String.format("%.2f",cantidadAleatoria) + "" + moneda;
           movimientos.add(movimiento);
        }
        return movimientos;
    }

    public int obtenerMovimientoAleatorio(int min, int max){
        return ThreadLocalRandom.current().nextInt(min,max + 1 );
    }

    public Double obtenerDoubleAleatorio(Double min ,Double max){
        return ThreadLocalRandom.current().nextDouble(min ,max + 1.0);
    }
}
