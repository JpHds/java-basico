import java.util.List;

public abstract class Conta implements IConta {
    private static final int AGENCIA = 1;
    private static int iteratorNumConta = 1;


    protected int numConta;
    protected int agencia;
    protected Cliente cliente;
    protected double saldo;
    protected List<Cliente> listaClientes;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA;
        this.numConta = iteratorNumConta;
        this.cliente = cliente;
        adicionarCliente(cliente);
        iteratorNumConta++;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta conta) {
        this.sacar(valor);
        conta.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void adicionarCliente(Cliente cliente) {
        this.listaClientes.add(cliente);
    };
}
