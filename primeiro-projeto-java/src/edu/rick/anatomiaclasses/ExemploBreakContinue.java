package edu.rick.anatomiaclasses;

public class ExemploBreakContinue {

    public static void main(String[] args) {
        for ( int numero = 1; numero <=20; numero ++){
            if (numero == 5) {
                continue;
            }
            System.out.println("Contando Ovelhas " + numero);
        }
        System.out.println("Joaozinho dormiu.");        
    }
}
