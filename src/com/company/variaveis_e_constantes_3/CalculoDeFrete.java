package com.company.variaveis_e_constantes_3;

import java.util.Scanner;

public class CalculoDeFrete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        Integer valorDoFrete = 2;
        Double resultado = valorProduto + valorDoFrete;
        System.out.println("Valor do Produto com frete: " + resultado);
        scanner.close();
    }
}