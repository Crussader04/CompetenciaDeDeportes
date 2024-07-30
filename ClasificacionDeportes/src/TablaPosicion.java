import java.util.ArrayList;
import java.util.List;

public class TablaPosicion {
    private Deporte deporte;
    private List<String> posiciones;

    public TablaPosicion(Deporte deporte) {
        this.deporte = deporte;
        this.posiciones = new ArrayList<>();
    }

    public void establecerPosicion(int puntos, int partidosGanados) {
        // Implementar lógica para establecer posición
    }

    public void actualizarTabla() {
        // Implementar lógica para actualizar tabla
    }

    public void mostrarEstadisticas() {
        // Implementar lógica para mostrar estadísticas
    }
}
