public class App {
public static void main(String[] args) {

    Banco banco = new Banco();

    Cliente cliente = new Cliente("Rick Mamona");
    Conta cc = new ContaCorrente(cliente);
    Conta cp = new ContaPoupanca(cliente);

    cc.depositar(1000);
    cc.transferir(500, cp);

    cc.imprimirExtrato();
    cp.imprimirExtrato();

    Cliente cliente2 = new Cliente("Rick");
    Conta cc1 = new ContaCorrente(cliente2);
    Conta cp1 = new ContaPoupanca(cliente2);

    cp1.depositar(500);

    cc1.imprimirExtrato();
    cp1.imprimirExtrato();


    banco.adicionarConta(cc);
    banco.adicionarConta(cp);
    banco.adicionarConta(cc1);
    banco.adicionarConta(cp1);


    banco.exibirClientes();

    }
}
