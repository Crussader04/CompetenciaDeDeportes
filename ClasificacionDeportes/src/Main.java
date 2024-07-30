import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear deporte grupal
        DeporteGrupal futbol = new DeporteGrupal(
                "Futbol",
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 12, 31),
                TipoCompetencia.TODOS_CONTRA_TODOS,
                "Equipo A",
                11,
                LocalDate.of(2023, 6, 15),
                10
        );

        // Crear equipo
        Equipo equipoA = new Equipo("Equipo A");

        // Crear jugadores
        Jugador jugador1 = new Jugador("Jugador 1", "Delantero", 25);
        Jugador jugador2 = new Jugador("Jugador 2", "Defensa", 27);

        // Agregar jugadores al equipo
        equipoA.agregarJugador(jugador1);
        equipoA.agregarJugador(jugador2);

        // Crear inscripción
        Inscripcion inscripcion1 = new Inscripcion(jugador1, equipoA, LocalDate.of(2023, 2, 15));
        Inscripcion inscripcion2 = new Inscripcion(jugador2, equipoA, LocalDate.of(2023, 2, 16));

        // Registrar inscripciones
        inscripcion1.registrar();
        inscripcion2.registrar();

        // Crear estadísticas
        Estadistica estadistica1 = new Estadistica(
                futbol,
                equipoA,
                jugador1,
                10,
                7,
                2
        );

        Estadistica estadistica2 = new Estadistica(
                futbol,
                equipoA,
                jugador2,
                10,
                6,
                3
        );

        // Mostrar estadísticas
        estadistica1.mostrarEstadisticas();
        System.out.println("Partidos Empatados: " + estadistica1.PartidosEmpatados());

        estadistica2.mostrarEstadisticas();
        System.out.println("Partidos Empatados: " + estadistica2.PartidosEmpatados());

        // Crear tabla de posiciones
        TablaPosicion tablaPosicion = new TablaPosicion(futbol);
        tablaPosicion.establecerPosicion(21, 7);
        tablaPosicion.actualizarTabla();
        tablaPosicion.mostrarEstadisticas();
    }
}

