public class Jugador {
    private String nombre;
    private String posicion;
    private int edad;

    public Jugador(String nombre, String posicion, int edad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }
}

