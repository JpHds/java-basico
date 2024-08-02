public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    
    public void imprimirExtratoCC() {
        System.out.println("========== Extrato Conta Corrente ==========");
        imprimirExtrato();
    };
}
