public class Tela {

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        CaixaEletronico caixaEletronico = new CaixaEletronico(contaBancaria);
        caixaEletronico.exibirMenu();
    }
}
