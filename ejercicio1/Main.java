public class Main {
    public static void main(String args[]) {
        Producto producto1 = new Producto("Notebook", 25003020.00, 5);

        System.out.println("Datos iniciales: ");
        producto1.mostrarDatos();

        System.out.println("Agregando stock: ");
        producto1.actualizarStock(5);

        System.out.println("Retirando 20 unidades: ");
        producto1.actualizarStock(-20);

        System.out.println("Datos finales: ");
        producto1.mostrarDatos();
    }
}
