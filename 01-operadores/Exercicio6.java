/**
 * Exercício 6: Verificar o Maior de Três Números
 *
 * Escreva um programa que aceite três números inteiros e determine o maior entre eles
 * usando apenas o operador ternário.
 */

public class Exercicio6 {
    public static void main(String[] args) {
        int numero1 = 30;
        int numero2 = 15;
        int numero3 =20;

        int maiorTresNumeros =
                numero1 > numero2 && numero1 > numero3
                ? numero1 : numero2 > numero3
                ? numero2 : numero3;

        System.out.println(maiorTresNumeros);
    }
}