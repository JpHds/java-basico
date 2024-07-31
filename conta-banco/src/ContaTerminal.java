import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, insira o número da agência: ");
        String numAgencia = sc.nextLine();

            System.out.print("Por favor, insira o número da conta: ");
        int numConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Por favor, insira o seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, insira o saldo: ");
        Double saldoConta = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + ", conta " + numConta + " e seu saldo " + saldoConta + " já está disponível para saque");

    }
}
