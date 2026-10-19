public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Juan", 99999.99);

        System.out.println("Información de la cuenta: ");
        cuenta.consultar();
        System.out.println("Depositando dinero");
        cuenta.depositar(2999.99);
        System.out.println("Retirando Dinero");
        cuenta.retirar(99999999999.99);
        System.out.println("Retirando Dinero");
        cuenta.retirar(30009.99);
        System.out.println("Información de la cuenta: ");
        cuenta.consultar();
    }
}
