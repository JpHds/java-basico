public interface IConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, IConta conta);
    void imprimirExtrato();
    void imprimirCabecalhoExtrato();
    String retornarNome();
}
