
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        GestionEstudiantes gestion = new GestionEstudiantes();

        // La bandera controla cuándo termina el menú.
        boolean banderaSalir = false;

        // El contador registrará los estudiantes agregados.
        int contadorEstudiantes = 0;

        // El menú se repite mientras no se solicite salir.
        while (!banderaSalir) {

            System.out.println("\n==================================");
            System.out.println(" SISTEMA DE GESTION DE ESTUDIANTES");
            System.out.println("==================================");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar estudiante por ID");
            System.out.println("4. Salir");
            System.out.println("==================================");
            System.out.print("Seleccione una opcion: ");

            try {
                int opcion = Integer.parseInt(
                    scanner.nextLine().trim()
                );

                // Dirige la ejecución según la opción elegida.
                switch (opcion) {

                    case 1:
                        gestion.agregarEstudiante(scanner);
                        break;

                    case 2:
                        gestion.mostrarEstudiantes();
                        break;      

                    case 3:
                        gestion.consultarEstudiante(scanner);
                        break;

                    case 4:
                        banderaSalir = true;
                        System.out.println(
                            "Gracias por utilizar el SGE."
                        );
                        break;

                    default:
                        System.out.println(
                            "Opcion no valida. Intente nuevamente."
                        );
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println(
                    "Error: debe ingresar un numero del 1 al 4."
                );
            }
        }

        scanner.close();
    }
}
