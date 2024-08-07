package course;

import java.util.ArrayList;
import java.util.List;

import aula.Aula;

public class Course {

    private String name;
    private String description;
    private List<Aula> classes;

    public Course(String name, String description) {
        this.name = name;
        this.description = description;
        this.classes = new ArrayList<Aula>();
    }
}
