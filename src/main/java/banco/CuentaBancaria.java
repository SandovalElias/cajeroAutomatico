package banco;

public abstract class CuentaBancaria {
    protected  Double saldo;
    protected String titular;
    protected TipoDeCuenta tipoDeCuenta;

    public CuentaBancaria(String texto, double monto, TipoDeCuenta tipo) {
        this.saldo = monto;
        this.titular = texto;
        this.tipoDeCuenta = tipo;
    }

    public Double  getSaldo() {
        return  this.saldo;
    }

    public void depositar(double monto) {
        this.saldo = this.getSaldo() + monto;
    }

    public void extraer(double monto){
        if (this.getSaldo() > 0.) {
            this.saldo = saldo - monto;
        }
    }

    public abstract void informarCondicionesLegales();


}
