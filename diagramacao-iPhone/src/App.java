import funcionalidades.iPhone;

public class App {
    public static void main(String[] args) throws Exception {
        iPhone iphone = new iPhone();
        // Testando Navegador Internet
        System.out.println("Acessando Navegador Internet...");
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://web.dio.me/home");
        iphone.atualizarPagina();
        // Testando Reprodutor Musical
        System.out.println("Acessando Reprodutor Musical...");
        iphone.selecionarMusica("Mamonas Assassinas");
        iphone.tocar();
        iphone.pausar();
        // Testando Aparelho Telefonico
        System.out.println("Acessando Aparelho Telefonico...");
        iphone.ligar("1234567890");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
