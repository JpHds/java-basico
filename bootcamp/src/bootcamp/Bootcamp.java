package bootcamp;
import java.util.ArrayList;
import java.util.List;

import course.Course;

public class Bootcamp {
    private String nome;
    private List<Course> cursos;

    public Bootcamp(String nome) {
        this.nome = nome;
        this.cursos = new ArrayList<Course>();
    }

}