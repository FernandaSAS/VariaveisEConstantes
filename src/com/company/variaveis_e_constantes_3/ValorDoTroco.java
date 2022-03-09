package com.company.variaveis_e_constantes_3;

import java.util.Scanner;

public class ValorDoTroco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        System.out.print("Digite valor recebido: ");
        Double valorPassadoPeloCliente = scanner.nextDouble();
        Double resultado = valorPassadoPeloCliente - valorProduto;
        System.out.println("Troco: " + resultado);
        scanner.close();

    }
}
