public class Tarea {
    public String titulo;
    public String responsable;
    double horasEstimadas;
    boolean completada;
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo + "Responsable:" + responsable + "Horas: " + horasEstimadas + "Completada: " + completada);
    }

    public void completar() {
        this.completada = true;
        System.out.println("La tarea '" + titulo + "' ha sido completada");
    }

    void mostrarResponsable() {
        System.out.println("El responsable de '" + titulo + "' es " + responsable);
    }

    void mostrarEstado() {
        System.out.println("Estado de" + titulo + "¿Completada?: " + completada);
    }
}