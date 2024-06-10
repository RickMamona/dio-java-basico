import java.util.Scanner;

public class CaixaEletronico {

    private ContaBancaria contaBancaria;
    private Scanner scanner;

    public CaixaEletronico(ContaBancaria contaBancaria){

        this.contaBancaria = contaBancaria;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu(){

        while (contaBancaria.aberta) {
            System.out.println("\n---- Banco Mamona ----");
            System.out.println("1. Verificar Saldo");
            System.out.println("2. Adicionar Saldo");
            System.out.println("3. Retirar Saldo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo: R$" + contaBancaria.saldo);
                    break;
                case 2:
                    adicionarSaldo();
                    System.out.println("Saldo Adicionado com Sucesso");
                    if (contaBancaria.aberta) {
                        System.out.println(contaBancaria);}
                    break;
                case 3:
                    retirarSaldo();
                    if (contaBancaria.aberta) {
                        System.out.println(contaBancaria);    
                    }
                    break;
                case 4:
                    contaBancaria.sair();
                    System.out.println("Saindo da Conta. Volte Sempre ! ");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void adicionarSaldo() {
        System.out.println("Digite saldo a ser adicionado: ");
        double novoSaldo = scanner.nextDouble();
        contaBancaria.adicionarSaldo(novoSaldo);
    }

    private void retirarSaldo(){
        System.out.println("Digite saldo a ser retirado: ");
        double novoSaldo = scanner.nextDouble();
        contaBancaria.sacarSaldo(novoSaldo);
    }
}
