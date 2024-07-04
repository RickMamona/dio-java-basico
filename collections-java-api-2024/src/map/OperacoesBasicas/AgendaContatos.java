package map.OperacoesBasicas;

import java.util.Map;
import java.util.HashMap;


public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){

        Integer numeroPorNome = null;

        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);          
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Rick", 123645);
        agendaContatos.adicionarContato("Rick", 1235);
        agendaContatos.adicionarContato("Rick Mamona", 357);
        agendaContatos.adicionarContato("Rick Silva", 4855);
        agendaContatos.adicionarContato("Rick Silva Mamona", 8952);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Rick Silva"); 

        agendaContatos.exibirContatos();

        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Rick Mamona"));


    }


    
}
