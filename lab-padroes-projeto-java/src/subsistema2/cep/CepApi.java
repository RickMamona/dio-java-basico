package subsistema2.cep;


public class CepApi {

    private static CepApi instace = new CepApi();
    
    private CepApi() {
        super();
    }
    public static CepApi getInstace(){
        return instace;
    }

    public String recuperarCidade(String cep){
        return "Aracaju";
    }
    public String recuperarEstado(String cep){
        return "SE";
    }


}
