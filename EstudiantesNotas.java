import java.util.HashMap;
import java.util.Scanner;

public class EstudiantesNotas {

    public static void main(String[] args) {
        // Crear el diccionario (HashMap)
        HashMap<String, Double> estudiantes = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Eliminar estudiante");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nota del estudiante: ");
                    double nota = sc.nextDouble();
                    estudiantes.put(nombre, nota);
                    System.out.println("Estudiante agregado correctamente.");
                    break;

                case 2:
                    System.out.println("\nLista de estudiantes:");
                    for (String key : estudiantes.keySet()) {
                        System.out.println(key + " -> " + estudiantes.get(key));
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el nombre a buscar: ");
                    String buscar = sc.nextLine();
                    if (estudiantes.containsKey(buscar)) {
                        System.out.println("Nota: " + estudiantes.get(buscar));
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese el nombre a eliminar: ");
                    String eliminar = sc.nextLine();
                    estudiantes.remove(eliminar);
                    System.out.println("Estudiante eliminado (si existía).");
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
