public class Estudiante {

    private int id;
    private String nombre;
    private int edad;

    public Estudiante(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarEstudiante() {
        System.out.println("----------------------------");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}