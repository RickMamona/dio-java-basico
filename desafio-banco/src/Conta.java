public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1; 
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    
    @Override
    public void depositar(double valor) {    
        saldo += valor;       
    }
    @Override
    public void sacar(double valor) {

        if (valor > saldo) {
            System.out.println("Saque não realizado. Saldo Disponível para saque: " + saldo);
            return;         
        }else
        saldo -= valor;      
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente. Saldo Disponível: " + saldo);
            return;  
        }else
        this.sacar(valor);
        contaDestino.depositar(valor);       
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
 
    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfosComuns(){
        System.out.println("Nome do Cliente: " + cliente.getNome());
        System.out.println("Conta: " + numero);
        System.out.println("Agencia: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("----------------------------");
    }

}
