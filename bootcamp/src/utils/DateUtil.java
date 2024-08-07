package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateUtil {
    /**
     * @param String - Data de nascimento no formato "dd/MM/yyyy"
     * @return - Retorna a data de nascimento formatada para LocalDate
     */
    public static LocalDate convertStringToLocalDate(String dataNascimento) {
        DateTimeFormatter formatador= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            return LocalDate.parse(dataNascimento, formatador);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Formato da data de nascimento inválido: " + dataNascimento, e);
        }
    }
}
