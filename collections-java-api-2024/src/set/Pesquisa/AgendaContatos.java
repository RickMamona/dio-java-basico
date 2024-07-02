package set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();;
    }


    public void adicionarContato(String nome, int numero){

        contatoSet.add(new Contato(nome, numero));

    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Rick", 712354);
        agendaContatos.adicionarContato("Rick", 9);
        agendaContatos.adicionarContato("Rick Silva", 18548);
        agendaContatos.adicionarContato("Rick Mamona", 2687);
        agendaContatos.adicionarContato("Bianca", 32157);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Bianca"));

        System.out.println("Contato atualizado:" + agendaContatos.atualizarNumeroContato("Bianca", 12345));

        agendaContatos.exibirContatos();
    }
}
