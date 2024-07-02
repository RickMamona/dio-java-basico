package set.OperacoesBasicas;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c: convidadoSet){
            if(c.getCodigoConvidado() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados" );

        conjuntoConvidados.adicionarConvidado("Convidado 1", 123);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 123456);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados" );

        conjuntoConvidados.removerConvidadoPorCodigoConvite(123);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados" );

        conjuntoConvidados.exibirConvidados();

    }

}
