package org.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a sigla do estado: ");

        try (Scanner read = new Scanner(System.in);
             FileReader file = new FileReader("src/main/java/org/csv/UF.csv");
             BufferedReader readFile = new BufferedReader(file)) {

            String stateInitials = read.nextLine().toUpperCase();

            String line = readFile.readLine();

            while (line != null) {
                String[] data = line.split(",");
                if (data.length >= 2 && data[1].equals(stateInitials)) {
                    String stateInfo = "Estado: " + data[2] + ", Região: " + data[3] + ", País: " + data[4];
                    System.out.println(stateInfo);
                }
                line = readFile.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}







