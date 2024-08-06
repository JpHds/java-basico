import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dev.Dev;

public class App {
    public static void main(String[] args) throws Exception {
        List<Dev> listaDevs = new ArrayList<Dev>();

        Scanner input = new Scanner(System.in);
        
        boolean continuar = true;

        while (continuar) {
            System.out.println("Informe o nome de usuário: ");
                String nomeInput = input.nextLine();
                if (nomeInput.equals(null) || nomeInput.equals("")) {throw new NullPointerException("Nome de usuário precisa ser informado.");}
            System.out.println("Informe o email: ");
                String emailInput = input.nextLine();
                if (!Dev.isValidEmail(emailInput)) {throw new IllegalArgumentException("Formato de e-mail inválido : " + emailInput);}
            System.out.println("Informe a data de nascimento(no formato dd/mm/aaaa): ");
                String nascimentoInput = input.nextLine();
                if(!Dev.isValidDataNascimento(nascimentoInput)) {throw new IllegalArgumentException("Formato da data de nascimento inválido: " + nascimentoInput);}

                String[] diaMesAno = nascimentoInput.split("/");
                Integer[] diaMesAnoConverted = new Integer[diaMesAno.length];
                for(int i = 0; i < diaMesAno.length; i++) {
                    diaMesAnoConverted[i] = Integer.parseInt(diaMesAno[i]);
                }

            listaDevs.add(new Dev(nomeInput, LocalDate.of(diaMesAnoConverted[2], Month.of(diaMesAnoConverted[1]), diaMesAnoConverted[0]), emailInput));

            System.out.println("Deseja continuar?\n 1- Sim \n 2- Não");
                int confirm = input.nextInt();
                    if (confirm == 2) {continuar = false;}
        }
        
        System.out.println("========LISTA-DEV=========");
        for (Dev dev : listaDevs) {
            System.out.println("==========================");
            System.out.println(dev.getId());
            System.out.println(dev.getNome());
            System.out.println(dev.getEmail());
            System.out.println(dev.getDataNascimento());
            System.out.println("Bootcamps inscrito: " + dev.getBootcampsInscrito());
            System.out.println("Cursos inscrito: " + dev.getCursosInscrito());
            System.out.println("==========================");
        }

    }
}
