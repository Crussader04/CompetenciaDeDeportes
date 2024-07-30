import java.time.LocalDate;

public class Inscripcion {
    private Jugador jugador;
    private Equipo equipo;
    private LocalDate fechaInscripcion;

    public Inscripcion(Jugador jugador, Equipo equipo, LocalDate fechaInscripcion) {
        this.jugador = jugador;
        this.equipo = equipo;
        this.fechaInscripcion = fechaInscripcion;
    }

    public void registrar() {
        // Implementar lógica para registrar inscripción
    }
}
