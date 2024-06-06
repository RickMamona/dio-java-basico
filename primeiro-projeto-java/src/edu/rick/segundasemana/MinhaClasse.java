package edu.rick.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) {

        String primeiroNome= "Rick";
        String segundoNome = "Mamona";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);


    }
    
}
