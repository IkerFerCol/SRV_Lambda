import java.util.List;

interface Filtre {
    boolean filtrar(Estudiante estudiante);
}

record Estudiante(String nombre, int nota) {
}


class MostradorEstudiante {
    void Mostrar(List<Estudiante> estudiantes, Filtre filtre) {
        for (Estudiante estudiante : estudiantes) {
            if (filtre.filtrar(estudiante)) {
                System.out.println(estudiante + " ");
            }
        }
        System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Jose", 1);
        Estudiante estudiante2 = new Estudiante("Alex", 3);
        Estudiante estudiante3 = new Estudiante("David", 8);
        Estudiante estudiante4 = new Estudiante("Joel", 6);

        List<Estudiante> listaestudiantes = List.of(estudiante, estudiante2, estudiante3, estudiante4);

        MostradorEstudiante mostradordeAlumnos = new MostradorEstudiante();

        mostradordeAlumnos.Mostrar(listaestudiantes, estudiante1 -> estudiante1.nota() >= 5);
        mostradordeAlumnos.Mostrar(listaestudiantes, estudiante1 -> estudiante1.nombre().contains("c"));
        mostradordeAlumnos.Mostrar(listaestudiantes, estudiante1 -> estudiante1.nombre().length() < 5);
        System.out.println(listaestudiantes);


    }
}