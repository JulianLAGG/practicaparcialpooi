public class CuentaBancaria {

    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo >= 0.0 ? saldo : 0.0;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
        } else {
            System.out.println("Él monto no puede ser negativo");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= this.saldo) {
            this.saldo -= monto;
        } else {
            System.out.println(
                "No es posible retirar ese monto (fondos insuficientes)"
            );
        }
    }

    public void consultar() {
        System.out.println(
            "Información de la cuenta. Titular:  " +
                titular +
                "//Saldo Disponible: $" +
                saldo
        );
    }
}
