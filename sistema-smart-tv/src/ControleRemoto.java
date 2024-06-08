import java.util.Scanner;

//IMPLEMENTANDO COMANDOS DO CONTROLE REMOTO

public class ControleRemoto {

    private SmartTv smartTv;
    private Scanner scanner;

    public ControleRemoto (SmartTv smartTv){
        this.smartTv = smartTv;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu(){

        while (smartTv.ligada) {
            System.out.println("\n---- Controle Remoto ----");
            System.out.println("1. Mudar canal");
            System.out.println("2. Aumentar canal");
            System.out.println("3. Diminuir canal");
            System.out.println("4. Aumentar volume");
            System.out.println("5. Diminuir volume");
            System.out.println("6. Desligar TV");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    mudarCanal();
                    break;
                case 2:
                    smartTv.aumentarCanal();
                    System.out.println("Canal: " + smartTv.canal);
                    break;
                case 3:
                    smartTv.diminuirCanal();
                    System.out.println("Canal: " + smartTv.canal);
                    break;
                case 4:
                    smartTv.aumentarVolume();
                    System.out.println("Volume: " + smartTv.volume);
                    break;
                case 5:
                    smartTv.diminuirVolume();
                    System.out.println("Volume: "+ smartTv.volume);
                    break;
                case 6:
                    smartTv.desligar();
                    System.out.println("TV Desligada.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            // MOSTRAR ESTADO DA TELEVISAO APOS COMANDO
            if (smartTv.ligada) {
                System.out.println(smartTv);
                
            }
        }
    }

//COMANDO PARA ESCOLHER O CANAL
    private void mudarCanal() {
        System.out.println("Digite o canal desejado: ");
        int novoCanal = scanner.nextInt();
        smartTv.mudarCanal(novoCanal);
        System.out.println("Canal alterado para : " + smartTv.canal);
    }
}
