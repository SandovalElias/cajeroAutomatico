package banco;

public class CuentaSueldo extends CuentaBancaria{

    public CuentaSueldo(String texto, double monto, TipoDeCuenta tipo) {
        super(texto, monto, tipo);
    }

    @Override
    public void informarCondicionesLegales() {
        System.out.println("Condiciones legales de la cuentaSueldo");
        System.out.println("Segun el acuerdo firmado por usted ");
        System.out.println("Mientras se mantenga el acuerdo no se cargara comision ");
    }
}
