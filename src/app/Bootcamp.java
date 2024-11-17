package app;

import java.util.HashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private Set<Curso> cursos = new HashSet<>();
    private Set<Mentoria> mentorias = new HashSet<>();
    private Set<Dev> devsParticipantes = new HashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void adicionarMentoria(Mentoria mentoria) {
        mentorias.add(mentoria);
    }

    public void adicionarDev(Dev dev) {
        devsParticipantes.add(dev);
    }

    public void listarCursos() {
        System.out.println("Cursos disponíveis no Bootcamp " + nome + ":");
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    public void listarMentorias() {
        System.out.println("Mentorias disponíveis no Bootcamp " + nome + ":");
        for (Mentoria mentoria : mentorias) {
            System.out.println(mentoria);
        }
    }

    public void listarDevs() {
        System.out.println("Devs participantes no Bootcamp " + nome + ":");
        for (Dev dev : devsParticipantes) {
            System.out.println(dev.getNome());
        }
    }
}
