public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirCabecalhoExtrato() {
        System.out.println("========== Extrato Conta Poupança ==========");
        imprimirExtrato();
    };
}
