package dev;

import java.util.regex.Pattern;

public class DevValidator {
    private static final String EMAIL_REGEX = "^[\\w-\\.]+@[\\w-]+\\.[a-zA-Z]{2,}$";
    private static final String BIRTHDATE_REGEX = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19|20)\\d\\d$";

    public static boolean isValidName(String nome) throws DevException {
        if(nome.equals(null) || nome.equals("")){throw new DevException("Por favor informe um nome de usuário.");}
            return true;
    }

    public static boolean isValidEmail(DevService devService, String email) throws DevException {
        if(!Pattern.matches(EMAIL_REGEX, email)) {throw new DevException("Formato de e-mail inválido: " + email);}
        for (Dev dev : devService.getDevList()) {
            if(dev.getEmail().equalsIgnoreCase(email)){throw new DevException("E-mail " + email + " já cadastrado!");}
        }
        return true;
    }

    public static boolean isValidBirthDate(String dataNascimento) throws DevException {
        if(!Pattern.matches(BIRTHDATE_REGEX, dataNascimento)) {throw new DevException("Formato da data de nascimento inválido: " + dataNascimento);}
        return true;
    }
}
