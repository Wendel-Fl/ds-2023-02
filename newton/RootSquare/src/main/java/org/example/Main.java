package org.example;

import java.util.Scanner;

import static org.example.CalculadoraRaizQuadrada.calcularRaizQuadrada;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular a raiz quadrada:");

        double x = scanner.nextDouble(); // O número do qual queremos calcular a raiz quadrada
        int iteracoes = 100; // Número máximo de iterações
        double tolerancia = 1e-6; // Margem de erro permitida

        double raizAproximada = calcularRaizQuadrada(x, iteracoes, tolerancia);

        System.out.println("A raiz quadrada de " + x + " é aproximadamente " + raizAproximada);
    }
}
