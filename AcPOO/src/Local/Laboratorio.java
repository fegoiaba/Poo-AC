package Local;

public class Laboratorio extends Local {
    private int numComputadores;
    private String tipo; // "Informática" ou "Química"

    public Laboratorio(String nomeIdentificador, int capacidadeMaxima, String predio, int numComputadores, String tipo) {
        super(nomeIdentificador, capacidadeMaxima, predio);
        this.numComputadores = numComputadores;
        this.tipo = tipo;
    }

    public int getNumComputadores() {
        return numComputadores;
    }

    public void setNumComputadores(int numComputadores) {
        this.numComputadores = numComputadores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " [Laboratório de " + tipo + ", Computadores: " + numComputadores + "]";
    }
}
