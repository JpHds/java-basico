public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtratoCP() {
        System.out.println("========== Extrato Conta Poupança ==========");
        imprimirExtrato();
    };
}
