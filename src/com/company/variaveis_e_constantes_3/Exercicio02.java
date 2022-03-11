package com.company.variaveis_e_constantes_3;


import java.sql.SQLOutput;
import java.util.Scanner;

/*
* Crie um programa que lê, do console, o nome e sobrenome de uma pessoa e depois imprime o nome completo.
* Para isso, você vai precisar de duas variáveis: a primeira você pode chamar de "nome" e a segunda de
* "sobrenome". Por ultimo, você vai juntar o nome e o sobrenome em uma unica impressão.
 * */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite Seu Sobrenome:  ");
        String sobrenome = scanner.nextLine();
        System.out.println("Como está " + nome  + " " +  sobrenome + "?");
        scanner.close();



    }
}
