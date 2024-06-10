public class ContaBancaria {

    double saldo ;
    double valorSacado;
    double valorDepositado;
    boolean aberta;

    public ContaBancaria(){

        aberta = true;
    }
    public void adicionarSaldo(double novoSaldo){
        if(novoSaldo > 0 )
        saldo = novoSaldo + saldo;
    }
    public void sacarSaldo(double novoSaldo){
        if(novoSaldo <= saldo){
            saldo = saldo - novoSaldo;
            System.out.println("Saldo retirado R$" + novoSaldo);
        }else{
            System.out.println("Saldo insuficiente para retirada ! ");
        }
    }
    public void sair(){
        aberta = false;
    }

    public String toString(){
        return "Banco Mamona {" + 
        "Saldo =  R$" + saldo +
        "}";
    }
}
