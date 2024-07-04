package set.Ordenacao;

import java.util.Comparator;

public class ComparatorPorNota implements Comparator<Aluno> {

    public int compare(Aluno a, Aluno b) {
        return Double.compare(a.getNota(), b.getNota());
    }
}
