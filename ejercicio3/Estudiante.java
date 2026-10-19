public class Estudiante {

    private String nombre;
    private double[] notas;

    public Estudiante(String nombre, double[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public double calcularPromedio() {
        double suma = 0;
        int contador = 0;

        for (double nota : notas) {
            suma += nota;
            contador++;
        }
        return contador > 0 ? suma / contador : 0.0;
    }

    public boolean estaAprobado() {
        return calcularPromedio() >= 6.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrar() {
        System.out.println(
            "Estudiante: " +
                nombre +
                " //Promedio: " +
                calcularPromedio() +
                " //Aprobado: " +
                estaAprobado()
        );
    }
}
