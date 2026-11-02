import java.util.ArrayList;
import java.util.Scanner;


public class GestionEstudiantes {

    // Lista dinámica para almacenar estudiantes.
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    // Variable de conteo.
    private int contadorEstudiantes = 0;

    // Busca un estudiante por su identificador.
    public Estudiante buscarPorId(int id) {

        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId() == id) {
                return estudiante;
            }
        }

        return null;
    }

    // Registra un estudiante después de validar los datos.
    public void agregarEstudiante(Scanner scanner) {

        try {
            System.out.println("\n--- AGREGAR ESTUDIANTE ---");

            System.out.print("Ingrese el ID: ");
            int id = Integer.parseInt(scanner.nextLine().trim());

            if (id <= 0) {
                System.out.println("El ID debe ser positivo.");
                return;
            }

            // Evita registrar dos estudiantes con el mismo ID.
            if (buscarPorId(id) != null) {
                System.out.println("Error: el ID ya existe.");
                return;
            }

            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine().trim();

            if (nombre.isEmpty()) {
                System.out.println("El nombre no puede estar vacio.");
                return;
            }

            System.out.print("Ingrese la edad: ");
            int edad = Integer.parseInt(scanner.nextLine().trim());

            if (edad <= 0 || edad > 120) {
                System.out.println("Ingrese una edad valida.");
                return;
            }

            Estudiante nuevo = new Estudiante(id, nombre, edad);

            estudiantes.add(nuevo);

            // Solo incrementamos el contador si el registro fue exitoso.
            contadorEstudiantes++;

            System.out.println("Estudiante registrado correctamente.");
            System.out.println(
                "Total de estudiantes: " + contadorEstudiantes
            );

        } catch (NumberFormatException e) {
            System.out.println(
                "Error: el ID y la edad deben ser numeros enteros."
            );
        }
    }

public void mostrarEstudiantes() {

    System.out.println("\n--- LISTA DE ESTUDIANTES ---");

    if (estudiantes.isEmpty()) {
        System.out.println("No hay estudiantes registrados.");
        return;
    }

    for (Estudiante estudiante : estudiantes) {
        estudiante.mostrarEstudiante();
    }

    System.out.println("----------------------------");
    System.out.println("Total de estudiantes: " + contadorEstudiantes);
}

public void consultarEstudiante(Scanner scanner) {

    System.out.println("\n--- BUSCAR ESTUDIANTE ---");

    try {
        System.out.print("Ingrese el ID del estudiante: ");
        int id = Integer.parseInt(scanner.nextLine().trim());

        if (id <= 0) {
            System.out.println("El ID debe ser positivo.");
            return;
        }

        // Reutilizamos el método de búsqueda existente.
        Estudiante encontrado = buscarPorId(id);

        if (encontrado != null) {
            System.out.println("Estudiante encontrado:");
            encontrado.mostrarEstudiante();
        } else {
            System.out.println(
                "No se encontro un estudiante con el ID: " + id
            );
        }

    } catch (NumberFormatException e) {
        System.out.println(
            "Error: debe ingresar un ID numerico valido."
        );
    }
}

}

