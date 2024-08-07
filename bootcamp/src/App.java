import java.time.LocalDate;
import java.util.Scanner;

import dev.Dev;
import dev.DevService;
import dev.DevValidator;
import utils.DateUtil;

public class App {
    public static void main(String[] args) throws Exception {
        DevService devService = new DevService();

        Scanner input = new Scanner(System.in);

        boolean continueInput = true;

        while (continueInput) {
            System.out.println("Informe o nome de usuário: ");
            String username = input.nextLine();
            DevValidator.isValidName(username);
            System.out.println("Informe o email: ");
            String email = input.nextLine();
            DevValidator.isValidEmail(devService, email);

            System.out.println("Informe a data de nascimento(no formato dd/mm/aaaa): ");
            String birthDateInput = input.nextLine();
            DevValidator.isValidBirthDate(birthDateInput);

            LocalDate birthDate = DateUtil.convertStringToLocalDate(birthDateInput);

            devService.addDev(new Dev(username, birthDate, email));

            System.out.println("Deseja continuar?\n 1- Sim \n 2- Não");
            int confirm = input.nextInt();
            input.nextLine();

            if (confirm == 2) {continueInput = false;}
        }

        System.out.println("========LISTA-DEV=========");
        for (Dev dev : devService.getDevList()) {
            System.out.println("==========================");
            System.out.println(dev.getId());
            System.out.println(dev.getName());
            System.out.println(dev.getEmail());
            System.out.println(dev.getBirthDate());
            System.out.println("Bootcamps inscrito: " + dev.getEnrolledBootcamps());
            System.out.println("Cursos inscrito: " + dev.getEnrolledCourses());
        }
    }
}
