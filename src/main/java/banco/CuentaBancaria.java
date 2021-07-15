package banco;

public class CuentaBancaria {
    private Double saldo;
    private String titular;

    public CuentaBancaria(String texto , double monto) {
        this.titular = texto;
        this.saldo = monto;
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


}
