package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio7 {

    //* Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console. */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int segundoNumeroMaior = numeros.stream()
        .distinct()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .orElse(0);

        System.out.println("Segundo maior número: " + segundoNumeroMaior);
    }
}
