import EventosAcademicos.Palestra;
import EventosAcademicos.Minicurso;
import EventosAcademicos.Participante;
import EventosAcademicos.Seminario;
import Local.Local;
import Local.Sala;
import Local.Auditorio;
import Local.Laboratorio;
import PessoaResponsavel.Instrutor;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Locais
        Local sala308 = new Sala("Sala 308", 30, "Barra", 101, true);
        Local auditorio = new Auditorio("Auditório do Primeiro Andar", 200, "Barra", true, true);
        Local labInfo = new Laboratorio("Lab 109", 25, "Barra", 25, "Informática");

        // Participantes
        Participante p1 = new Participante("Joao da Silva", "123.456.789-00", "felipe@email.com", "Engenharia da Computacao");
        Participante p2 = new Participante("Ana Maria", "987.654.321-00", "ana@gmail.com", "ADS");

        // Instrutores
        Instrutor inst1 = new Instrutor("Carlos Oliveira", "carlos@uni.com", "Mestrado", "Programação Orientada a Obejto");
        Instrutor inst2 = new Instrutor("Vasco Martins", "vasmartins@uni.com", "Doutorado", "Banco de Dados");

        // Eventos
        Palestra palestra = new Palestra("Inovação Tecnológica", "12/11/2025", 2, 15000,
                10, auditorio, "Dr. João Pires", "joao@empresa.com", "TechCorp");

        Minicurso minicurso = new Minicurso("Java Avançado", "15/11/2025", 4, 8000, 10, sala308, Arrays.asList(inst1, inst2), 4,
                Arrays.asList("Slides", "Apostila PDF"));

        Seminario seminario = new Seminario( "IA para Todos","20/11/2025", 3, 5000, 10
                ,labInfo, "IA Generativa", "Lucas Almeida", "Prof. Ricardo");

        // Inscrições
        Boolean retorno = true;
        retorno = palestra.inscreverParticipante(p1);
        palestra.inscreverParticipante(p2);
        minicurso.inscreverParticipante(p1);
        seminario.inscreverParticipante(p2);

        // Mostrar eventos
        System.out.println("--- Eventos Cadastrados ---");
        System.out.println(palestra);
        System.out.println("------");
        System.out.println(minicurso);
        System.out.println("------");
        System.out.println(seminario);
    }
}