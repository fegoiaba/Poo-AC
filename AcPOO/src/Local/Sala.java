package Local;

public class    Sala extends Local {
    private int numero;
    private boolean multimidia;

    public Sala( String nomeIdentificador, int capacidadeMaxima, String predio, int numero, boolean multimidia) {
        super(nomeIdentificador, capacidadeMaxima, predio);
        this.numero = numero;
        this.multimidia = multimidia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isMultimidia() {
        return multimidia;
    }

    public void setMultimidia(boolean multimidia) {
        this.multimidia = multimidia;
    }

    @Override
    public String toString() {
        return super.toString() + " [Sala " + numero + ", Multimídia: " + (multimidia ? "Sim" : "Não") + "]";
    }
}
