package Local;

abstract public class Local {
    private String nomeIdentificador;
    private int capacidadeMaxima;
    private String predio;

    public Local(String nomeIdentificador, int capacidadeMaxima, String predio) {
        this.nomeIdentificador = nomeIdentificador;
        this.capacidadeMaxima = capacidadeMaxima;
        this.predio = predio;
    }

    public String getNomeIdentificador() {
        return nomeIdentificador;
    }

    public void setNomeIdentificador(String nomeIdentificador) {
        this.nomeIdentificador = nomeIdentificador;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }

    @Override
    public String toString() {
        return nomeIdentificador + " (Predio " + predio + ", Capacidade: " + capacidadeMaxima + ")";
    }

}
