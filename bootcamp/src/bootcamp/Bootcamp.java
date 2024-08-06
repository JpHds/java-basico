package bootcamp;
import java.util.ArrayList;
import java.util.List;

import curso.Curso;

public class Bootcamp {
    private String nome;
    private List<Curso> cursos;

    public Bootcamp(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<Curso>();
    }

}