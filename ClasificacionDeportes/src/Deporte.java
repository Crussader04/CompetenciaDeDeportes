import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Deporte {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private TipoCompetencia tipoCompetencia;
    private List<Estadistica> estadisticas;

    public Deporte(String nombre, LocalDate fechaInicio, LocalDate fechaFin, TipoCompetencia tipoCompetencia) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoCompetencia = tipoCompetencia;
        this.estadisticas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String obtenerEstadistica() {
        return "Estadísticas del deporte";
    }
}
