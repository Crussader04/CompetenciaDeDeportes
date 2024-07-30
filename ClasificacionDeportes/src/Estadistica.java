public class Estadistica {
    private Deporte deporte;
    private Equipo equipo;
    private Jugador jugador;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosPerdidos;

    public Estadistica(Deporte deporte, Equipo equipo, Jugador jugador, int partidosJugados, int partidosGanados, int partidosPerdidos) {
        this.deporte = deporte;
        this.equipo = equipo;
        this.jugador = jugador;
        this.partidosJugados = partidosJugados;
        this.partidosGanados = partidosGanados;
        this.partidosPerdidos = partidosPerdidos;
    }

    public void mostrarEstadisticas() {
        System.out.println("Deporte: " + deporte.getNombre());
        if (equipo != null) {
            System.out.println("Equipo: " + equipo.getNombre());
        }
        if (jugador != null) {
            System.out.println("Jugador: " + jugador.getNombre());
        }
        System.out.println("Partidos Jugados: " + partidosJugados);
        System.out.println("Partidos Ganados: " + partidosGanados);
        System.out.println("Partidos Perdidos: " + partidosPerdidos);
    }

    public int PartidosEmpatados() {
        return partidosJugados - (partidosGanados + partidosPerdidos);
    }
}

