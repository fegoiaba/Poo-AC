package EventosAcademicos;
import Local.Local;
import PessoaResponsavel.Instrutor;

import java.util.List;

public class Minicurso extends Eventos {

    private List<Instrutor> instrutores;
    private int cargaHorario;
    private List<String> materiais;


    public Minicurso(String titulo, String data, int duracao, double orcamento, int vagas, Local local, List<Instrutor> instrutores, int cargaHorario, List<String> materiais) {
        super(titulo, data, duracao, orcamento, vagas, local);
        this.instrutores = instrutores;
        this.cargaHorario = cargaHorario;
        this.materiais = materiais;
    }

    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(List<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }

    public int getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(int cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    public List<String> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<String> materiais) {
        this.materiais = materiais;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInstrutores: " + instrutores + " \nCarga Horaria: " + cargaHorario + " \nMateriais: " +  materiais + "";
    }
}
