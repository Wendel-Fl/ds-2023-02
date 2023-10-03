package org.example;

public class CalculadoraRaizQuadrada {
    public static double calcularRaizQuadrada(double x, int iteracoes, double tolerancia) {
        if (x < 0) {
            throw new IllegalArgumentException("A raiz quadrada de um número negativo não é real.");
        }

        // Começar com uma suposição inicial (aqui, usamos x / 2)
        double aproximacao = x / 2.0;

        for (int i = 0; i < iteracoes; i++) {
            // Usar a fórmula de Newton-Raphson para atualizar a aproximação
            aproximacao = 0.5 * (aproximacao + x / aproximacao);

            // Verificar a convergência usando a tolerância
            double erro = Math.abs(aproximacao * aproximacao - x);
            if (erro < tolerancia) {
                break;
            }
        }

        return aproximacao;
    }
}
