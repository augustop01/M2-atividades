package m1s01.ex_03;

import java.util.Scanner;

/*Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário para inserir um número inteiro. O programa deve verificar se o número é par ou ímpar, e exibir essa informação de volta ao usuário.*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro para verificar se é par ou ímpar: ");
        Double num = scanner.nextDouble();
        Double calc = num % 2;
        if(calc == 0){
            System.out.printf("O número %.0f é par.", num);
        } else {
            System.out.printf("O número %.0f é ímpar.", num);
        }
    }
}
