import java.util.Scanner;

/**
 * Exercício 6: Verificar o Maior de Três Números
 *
 * Escreva um programa que aceite três números inteiros e determine o maior entre eles
 * usando apenas o operador ternário.
 */

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        int numero2 = sc.nextInt();
        System.out.println("Digite o terceiro numero:");
        int numero3 = sc.nextInt();

        int maiorTresNumeros =
                numero1 > numero2 && numero1 > numero3
                ? numero1 : numero2 > numero3
                ? numero2 : numero3;

        System.out.printf("O maior numero digitado foi %d", maiorTresNumeros);
    }
}