public abstract class Conta implements IConta {

    private static final int AGENCIA = 1;
    private static int iteratorNumConta = 1;


    protected int numConta;
    protected int agencia;
    protected Cliente cliente;
    protected double saldo;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA;
        this.numConta = iteratorNumConta;
        this.cliente = cliente;
        iteratorNumConta++;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta conta) {
        if(valor <= this.saldo) {
            this.sacar(valor);
            conta.depositar(valor);
            System.out.println("R$" + valor + " transferido para " + conta.retornarNome());
        } else if(valor == 0) {
            System.out.println("Por favor, informe um valor acima de R$0.00");
        } else {
            System.out.println("Impossível transferir. Saldo insuficiente.");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(this.cliente.getNome().concat(" " + this.cliente.getSobrenome()));
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Saldo: " + this.saldo);
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("R$" + valor + " sacado com sucesso!");
        } else {
            System.out.println("Impossível sacar. Saldo insuficiente.");
        }
        
    }

    @Override
    public String retornarNome() {
        return this.cliente.getNome();
    }

}
