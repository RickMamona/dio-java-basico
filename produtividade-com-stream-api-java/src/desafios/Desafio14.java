package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio14 {
    //* Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console. */


    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int maiorNumeroPrimo = numeros.stream().filter(Desafio14::isPrimo).max(Integer::compareTo).orElse(0);

        System.out.println("Maior número primo: " + maiorNumeroPrimo);
    }


    public static boolean isPrimo(int numero) {
       if(numero<=1) return false;
       for(int i = 2; i<= Math.sqrt(numero); i++){
         if(numero % i == 0) return false;
       }
    return true;
    }

}
