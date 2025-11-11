package EventosAcademicos;
import Local.Local;

public class Seminario extends Eventos {
    private String tema;
    private String aluno;
    private String orientador;

    public Seminario(String titulo, String data, int duracao, double orcamento, int vagas, Local local, String tema, String aluno, String orientador) {
        super(titulo, data, duracao, orcamento, vagas, local);
        this.tema = tema ;
        this.aluno = aluno ;
        this.orientador = orientador ;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return super.toString() + " \nTema: " + tema + "\nOrientador: " + orientador + "\nAluno Apresentador: " +  aluno + "";
    }
}
