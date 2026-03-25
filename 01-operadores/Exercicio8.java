import java.util.Scanner;

/**
 * Exercício 8: Verificar se um Ano é Bissexto
 *
 * Um ano é considerado bissexto se:
 * - É divisível por 4, mas não por 100, ou
 * - É divisível por 400.
 * Escreva um programa que determine se um ano é bissexto ou não, usando apenas o operador ternário.
 */

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um ano:");
        short ano = sc.nextShort();

        boolean anoBissexto = ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;

        System.out.printf("O ano %d é bissexto? %b", ano, anoBissexto);
    }
}