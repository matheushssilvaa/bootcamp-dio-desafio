package app;

import java.util.HashSet;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Curso> cursosInscritos = new HashSet<>();
    private Set<Mentoria> mentoriasParticipadas = new HashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inscreverCurso(Curso curso) {
        cursosInscritos.add(curso);
    }

    public void participarMentoria(Mentoria mentoria) {
        mentoriasParticipadas.add(mentoria);
    }

    public void listarCursos() {
        System.out.println(nome + " está inscrito nos seguintes cursos:");
        for (Curso curso : cursosInscritos) {
            System.out.println(curso);
        }
    }

    public void listarMentorias() {
        System.out.println(nome + " participou das seguintes mentorias:");
        for (Mentoria mentoria : mentoriasParticipadas) {
            System.out.println(mentoria);
        }
    }
}