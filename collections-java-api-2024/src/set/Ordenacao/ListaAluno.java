package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ListaAluno {

    private Set<Aluno> listaAlunoSet;

    public ListaAluno() {
        this.listaAlunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota){
        listaAlunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        for (Aluno a : listaAlunoSet){
            if(a.getMatricula() == matricula){
                alunoParaRemover = a;
                break;
            }
        }
        listaAlunoSet.remove(alunoParaRemover);
    }
    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunoSet);
        return alunosPorNome;
    }
    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(listaAlunoSet);
        return alunosPorNota;
    }
    public void exibirAlunos(){
        System.out.println(listaAlunoSet);
    }

    public static void main(String[] args) {
        ListaAluno listaAluno = new ListaAluno();

        listaAluno.adicionarAluno("Rick", 12345, 7);
        listaAluno.adicionarAluno("Rick Mamona", 12345, 7.5);
        listaAluno.adicionarAluno("Ruan", 1235, 6);
        listaAluno.adicionarAluno("Bianca", 123, 7.5);
        listaAluno.adicionarAluno("Olliver", 123456, 6.5);

        System.out.println(listaAluno.listaAlunoSet);
        listaAluno.removerAluno(1235);
        System.out.println(listaAluno.listaAlunoSet);
        System.out.println(listaAluno.exibirAlunosPorNome());
        System.out.println(listaAluno.exibirAlunosPorNota());

    }
}
