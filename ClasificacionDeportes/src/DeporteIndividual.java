import java.time.LocalDate;

public class DeporteIndividual extends Deporte {
    private String nombreJugador;
    private int puntuacion;
    private LocalDate fechaEncuentro;
    private int nroCompetidores;

    public DeporteIndividual(String nombre, LocalDate fechaInicio, LocalDate fechaFin, TipoCompetencia tipoCompetencia, String nombreJugador, int puntuacion, LocalDate fechaEncuentro, int nroCompetidores) {
        super(nombre, fechaInicio, fechaFin, tipoCompetencia);
        this.nombreJugador = nombreJugador;
        this.puntuacion = puntuacion;
        this.fechaEncuentro = fechaEncuentro;
        this.nroCompetidores = nroCompetidores;
    }

    public void añadirJugador() {
        // Implementar lógica para añadir jugador
    }
}

