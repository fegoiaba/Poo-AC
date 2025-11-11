package EventosAcademicos;
import java.util.ArrayList;
import java.util.List;
import Local.Local;

public abstract class Eventos {
    private String titulo;
    private String data;
    private int duracao;
    private double orcamento;
    private int vagas;
    private Local local;
    private List<Participante> participantes;

    public Eventos(String titulo, String data, int duracao, double orcamento, int vagas, Local local) {
        this.titulo = titulo;
        this.data = data;
        this.duracao = duracao;
        this.orcamento = orcamento;
        this.vagas = vagas;
        this.local = local;
        this.participantes = new ArrayList<>();

    }
    public boolean inscreverParticipante(Participante p) {
        if (participantes.size() < local.getCapacidadeMaxima()) {
            participantes.add(p);
            return true;
        } else {
            System.out.println("Sem vagas disponíveis no evento: " + titulo);
            return false;
        }
    }

    @Override
    public String toString() {
        return "Evento: " + titulo + " | Data: " + data +
                " | Duração: " + duracao + "h | Orçamento: R$" + orcamento +
                "\nLocal: " + local +
                "\nVagas: " + vagas +
                "\nParticipantes: " + participantes.size() + "/" + local.getCapacidadeMaxima();
    }

}
