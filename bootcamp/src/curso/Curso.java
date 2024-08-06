package curso;
import java.util.ArrayList;
import java.util.List;

import aula.Aula;

public class Curso {

    private String nome;
    private String descricao;
    private List<Aula> aulas;

    public Curso(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.aulas = new ArrayList<Aula>();
    }
}
