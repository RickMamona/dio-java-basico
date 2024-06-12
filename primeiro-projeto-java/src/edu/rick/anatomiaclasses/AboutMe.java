package edu.rick.anatomiaclasses;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {

        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu NOME");
        String nome = scanner.next();

        System.out.println("Digite seu SOBRENOME");
        String sobrenome = scanner.next();

        System.out.println("Digite sua IDADE");
        int idade = scanner.nextInt();

        System.out.println("Digite sua ALTURA");
        double altura = scanner.nextDouble();
        
        //imprimindo dados obtidos

        System.out.println("Oi, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm" );
        scanner.close();
        }
    catch (InputMismatchException e){
        System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}