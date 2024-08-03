import java.util.ArrayList;
import java.util.List;

public class Banco{
    private List<Conta> contas = new ArrayList<>();

    public void addConta(Conta conta) {
        this.contas.add(conta);
    };
}
