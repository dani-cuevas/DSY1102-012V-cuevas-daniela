public class EstadoJuego {

    private String nombreJugador;
    private int nivel;

    public EstadoJuego() {
    }

    public EstadoJuego(String nombreJugador, int nivel) {
        this.nombreJugador = nombreJugador;
        this.nivel = nivel;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}