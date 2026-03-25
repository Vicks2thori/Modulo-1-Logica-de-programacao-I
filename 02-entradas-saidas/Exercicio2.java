import java.util.Scanner;

/**
 * Exercício 2: Verificar Dia da Semana
 *
 * Peça ao usuário para inserir um número de 1 a 7 usando Scanner, onde 1 representa "Domingo" e 7 representa "Sábado".
 * Utilize o operador ternário para exibir o dia da semana correspondente.
 */

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7:");
        short numero = sc.nextShort();

        String diaSemana =
                numero == 1 ? "Domingo"
                : numero == 2 ? "Segunda"
                : numero == 3 ? "Terça"
                : numero == 4 ? "Quarta"
                : numero == 5 ? "Quinta"
                : numero == 6 ? "Sexta"
                : numero == 7 ? "Sábado"
                : "Numero inválido";

        System.out.printf("Resultado: %s", diaSemana);
    }
}