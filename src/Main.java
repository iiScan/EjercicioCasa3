public class Main {
    public static void main(String[] args) {
        // Creación de tres tareas
        Tarea t1 = new Tarea();
        Tarea t2 = new Tarea();
        Tarea t3 = new Tarea();

        // Asignación de valores para la tarea 1
        t1.titulo = "Configuración del repositorio en GitHub";
        t1.responsable = "Jorge Cuichan";
        t1.horasEstimadas = 2.5;
        t1.completada = false;

        t2.titulo = "Desarrollo de las clases base";
        t2.responsable = "Pepe";
        t2.horasEstimadas = 4.0;
        t2.completada = false;

        t3.titulo = "Pruebas de compilación";
        t3.responsable = "Esteban";
        t3.horasEstimadas = 1.5;
        t3.completada = false;

        System.out.println("ESTADO INICIAL DE LAS TAREAS");
        t1.mostrarInformacion();
        t2.mostrarInformacion();
        t3.mostrarInformacion();

        System.out.println("\nACTUALIZACIÓN");
        t2.completar();

        System.out.println("\nCOMPROBACIÓN DE RESULTADOS");
        t1.mostrarEstado();
        t2.mostrarEstado();
        t3.mostrarEstado();
    }
}