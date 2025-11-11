package Local;

public class Auditorio extends Local {

    private boolean sistemaDeSom;
    private boolean traducao;

    public Auditorio(String nomeIdentificador, int capacidadeMaxima, String predio, boolean sistemaDeSom, boolean traducao) {
        super(nomeIdentificador, capacidadeMaxima, predio);
        this.sistemaDeSom = sistemaDeSom;
        this.traducao = traducao;
    }

    public boolean isSistemaDeSom() {
        return sistemaDeSom;
    }

    public void setSistemaDeSom(boolean sistemaDeSom) {
        this.sistemaDeSom = sistemaDeSom;
    }

    public boolean isTraducao() {
        return traducao;
    }

    public void setTraducao(boolean traducao) {
        this.traducao = traducao;
    }

    @Override
    public String toString() {
        return super.toString() + " [Auditório - Som: " + (sistemaDeSom ? "Sim" : "Não") +
                ", Tradução: " + (traducao ? "Sim" : "Não") + "]";
    }
}
