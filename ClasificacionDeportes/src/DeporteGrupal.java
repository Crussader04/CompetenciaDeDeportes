import java.time.LocalDate;

public class DeporteGrupal extends Deporte {
    private String equipo;
    private int nroIntegrantes;
    private LocalDate fechaJuego;
    private int nroEquipos;

    public DeporteGrupal(String nombre, LocalDate fechaInicio, LocalDate fechaFin, TipoCompetencia tipoCompetencia, String equipo, int nroIntegrantes, LocalDate fechaJuego, int nroEquipos) {
        super(nombre, fechaInicio, fechaFin, tipoCompetencia);
        this.equipo = equipo;
        this.nroIntegrantes = nroIntegrantes;
        this.fechaJuego = fechaJuego;
        this.nroEquipos = nroEquipos;
    }

    public void añadirEquipo() {
        // Implementar lógica para añadir equipo
    }
}
