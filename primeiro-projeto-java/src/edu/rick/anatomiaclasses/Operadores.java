package edu.rick.anatomiaclasses;

import java.util.Scanner;


public class Operadores {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = -1;

        while (numero !=10) {

            System.out.println("Digite um numero: ");
            numero = in.nextInt();
            if (numero ==10) {
                System.out.println("Voce acertou!");              
            }
            if (numero>10) {
                System.out.println("É um número menor.");               
            }
            if (numero<10){
                System.out.println("É um número maior.");
            }          
        }
    }   
}
