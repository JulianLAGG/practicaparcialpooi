public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = (precio >= 0) ? precio : 0.0;
        this.stock = (stock >= 0) ? stock : 0;
    }

    public void actualizarStock(int cantidad) {
        if (this.stock + cantidad >= 0) {
            this.stock += cantidad;
        } else {
            System.out.println("El stock no puede ser negativo");
        }
    }
    public void mostrarDatos() {
        System.out.println("Producto: " + nombre + "//Precio: $" + precio + "//Stock: " + stock);
    }
}