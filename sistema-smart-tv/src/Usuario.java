public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();
        ControleRemoto controleRemoto = new ControleRemoto(smartTv);
        controleRemoto.exibirMenu();
    }
    
}