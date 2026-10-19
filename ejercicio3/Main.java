public class Main {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Sofía", new double[] {
            8.5,
            9.1,
            7.7,
        });
        Estudiante estudiante2 = new Estudiante("Juan", new double[] {
            3.0,
            4.4,
            4.78,
        });

        System.out.println("//REGISTRO DE ALUMNOS//");

        estudiante1.mostrar();
        estudiante2.mostrar();

        System.out.println("//Probando otra forma de usar los métodos//");
        System.out.println("Datos del Primer Estudiante");
        System.out.println("\nEstudiante: " + estudiante1.getNombre());
        System.out.println("Promedio: " + estudiante1.calcularPromedio());
        System.out.println(
            "Estado: " +
                (estudiante1.estaAprobado() ? "Aprobado" : "Desaprobado")
        );

        System.out.println("Datos del Segundo Estudiante");
        System.out.println("\nEstudiante: " + estudiante2.getNombre());
        System.out.println("Promedio: " + estudiante2.calcularPromedio());
        System.out.println(
            "Estado: " +
                (estudiante2.estaAprobado() ? "Aprobado" : "Desaprobado")
        );
    }
}
