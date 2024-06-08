package edu.rick.anatomiaclasses;
import java.util.Scanner;


public class Operadores {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");

        String nome = in.nextLine();

        System.out.println("Olá, " + nome + "! Seja bem-vindo");

        in.close();
        
    }   
}
