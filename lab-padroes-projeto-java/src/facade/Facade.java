package facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

    public void migrarCleinte(String nome, String cep){
        String cidade = CepApi.getInstace().recuperarCidade(cep);
        String estado = CepApi.getInstace().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }

}
