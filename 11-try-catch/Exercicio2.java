import java.util.Scanner;

/**
 * Exercício 2: Scanner, try-catch-finally método
 *
 * Crie um programa que solicite ao usuário para digitar uma frase ou número, realize a leitura e utilize um bloco
 * try-catch para verificar se a string representa um número inteiro válido.
 */

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero ou uma frase: ");
        String string = sc.next();
        Integer number;

        try {
            number = Integer.valueOf(string);
            System.out.printf("O seu numero %d é um numero inteiro válido", number);
        } catch (NumberFormatException e) {
            System.err.println("O seu numero não é um numero inteiro válido");
        } finally {
            System.out.println("Encerrando o programa!");
            sc.close();
        }
    }
}