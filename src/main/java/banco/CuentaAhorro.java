package banco;


public class CuentaAhorro extends CuentaBancaria {
    private final double COMISION =0.12;

    public CuentaAhorro(String texto, double monto, TipoDeCuenta tipo) {
        super(texto, monto, tipo);
    }

    @Override
    public void extraer(double monto) {
        if (this.getSaldo() > 0.) {
            this.saldo = saldo - monto;
            this.saldo = saldo - COMISION;
        }
    }

    @Override
    public void informarCondicionesLegales(){
        System.out.println("Condiciones legales de su cuenta de ahorro en el Banco Super");
        System.out.println("Segun lo firmado por usted .....");
        System.out.println("La comision por extraccion es de : " + COMISION);
    }


}