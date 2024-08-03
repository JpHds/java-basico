public class App {
    public static void main(String[] args) throws Exception {
    Banco bancoTeste = new Banco();
    
    Cliente pedroNunes = new Cliente("Pedro", "Nunes");
    Cliente joseBarreto = new Cliente("Jose", "Barreto");

    Conta contaPedroNunes = new ContaCorrente(pedroNunes);
    Conta contaJoseBarreto = new ContaPoupanca(joseBarreto);

    bancoTeste.addConta(contaPedroNunes);
    bancoTeste.addConta(contaJoseBarreto);

    contaPedroNunes.imprimirCabecalhoExtrato();
    System.out.println();
    contaJoseBarreto.imprimirCabecalhoExtrato();

    }
}