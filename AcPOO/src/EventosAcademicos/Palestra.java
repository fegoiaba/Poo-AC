package EventosAcademicos;
import Local.Local;
import java.util.Date;

public class Palestra extends Eventos {
    private String palestranteNome;
    private String palestranteEmail;
    private String palestranteInstituicao;


    public Palestra(String titulo, String data, int duracao, double orcamento, int vagas, Local local, String palestranteNome, String palestranteEmail, String palestranteInstituicao) {
        super(titulo, data, duracao, orcamento, vagas, local);
        this.palestranteNome = palestranteNome;
        this.palestranteEmail = palestranteEmail;
        this.palestranteInstituicao = palestranteInstituicao;
    }

    public String getPalestranteNome() {
        return palestranteNome;
    }

    public void setPalestranteNome(String palestranteNome) {
        this.palestranteNome = palestranteNome;
    }

    public String getPalestranteEmail() {
        return palestranteEmail;
    }

    public void setPalestranteEmail(String palestranteEmail) {
        this.palestranteEmail = palestranteEmail;
    }

    public String getPalestranteInstituicao() {
        return palestranteInstituicao;
    }

    public void setPalestranteInstituicao(String palestranteInstituicao) {
        this.palestranteInstituicao = palestranteInstituicao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPalestrante: " + palestranteNome + " (" + palestranteInstituicao + ")";
    }
}


