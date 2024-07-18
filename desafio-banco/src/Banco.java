import java.util.List;
import java.util.ArrayList;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirClientes(){
        for (Conta conta : contas){
            Cliente cliente = conta.getCliente();
            System.out.println("Cliente " + cliente.getNome());
        }
    }

}
