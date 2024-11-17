package app;

public class Main {
    public static void main(String[] args) {
        // Criar cursos
        Curso cursoJava = new Curso("Java para Iniciantes", "Curso básico de Java", 40);
        Curso cursoReact = new Curso("React do zero", "Curso de ReactJS", 30);

        // Criar mentorias
        Mentoria mentoriaJava = new Mentoria("Mentoria de Java", "Tire suas dúvidas sobre Java", "2024-11-25");

        // Criar Bootcamp
        Bootcamp bootcampJavaDev = new Bootcamp("Bootcamp Java Developer", "Acelere sua carreira de desenvolvedor Java!");

        // Criar Devs
        Dev dev1 = new Dev("Carlos");
        Dev dev2 = new Dev("Ana");

        // Adicionar cursos, mentorias e devs ao bootcamp
        bootcampJavaDev.adicionarCurso(cursoJava);
        bootcampJavaDev.adicionarCurso(cursoReact);
        bootcampJavaDev.adicionarMentoria(mentoriaJava);
        bootcampJavaDev.adicionarDev(dev1);
        bootcampJavaDev.adicionarDev(dev2);

        // Devs se inscrevem em cursos e participam de mentorias
        dev1.inscreverCurso(cursoJava);
        dev1.participarMentoria(mentoriaJava);

        dev2.inscreverCurso(cursoReact);
        dev2.participarMentoria(mentoriaJava);

        // Listar cursos, mentorias e devs
        bootcampJavaDev.listarCursos();
        bootcampJavaDev.listarMentorias();
        bootcampJavaDev.listarDevs();

        // Listar cursos e mentorias dos devs
        dev1.listarCursos();
        dev1.listarMentorias();

        dev2.listarCursos();
        dev2.listarMentorias();
    }
}
