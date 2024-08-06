package dev;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import bootcamp.Bootcamp;
import curso.Curso;

public class Dev implements IDev {

    private int id = 0;
    private String nome;
    private String dataNascimento;
    private String email;
    private List<Bootcamp> bootcampsInscrito;
    private List<Curso> cursosInscrito;

    private static final String EMAIL_REGEX = "^[\\w-\\.]+@[\\w-]+\\.[a-zA-Z]{2,}$";
    private static final String NASCIMENTO_REGEX = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d\\d$";

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Dev(String nome, LocalDate dataNascimento, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento.format(formatter);
        this.bootcampsInscrito = new ArrayList<Bootcamp>();
        this.cursosInscrito = new ArrayList<Curso>();
        id++;
    }

    public int getId(){
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }
    public String getEmail() {
        return this.email;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public List<Bootcamp> getBootcampsInscrito(){
        return this.bootcampsInscrito;
    }

    public List<Curso> getCursosInscrito(){
        return this.cursosInscrito;
    }

    @Override
    public void inscreverBootcamp(Bootcamp bootcamp) {
        bootcampsInscrito.add(bootcamp);
    }

    @Override
    public void inscreverCurso(Curso curso) {
        cursosInscrito.add(curso);
    }

    public static boolean isValidEmail(String email) {
        // Verifica se o e-mail corresponde ao padrão
        return Pattern.matches(EMAIL_REGEX, email);
    }

    public static boolean isValidDataNascimento(String dataNascimento) {
        return Pattern.matches(NASCIMENTO_REGEX, dataNascimento);
    }

}
