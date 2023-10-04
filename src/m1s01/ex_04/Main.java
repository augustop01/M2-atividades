package m1s01.ex_04;

import java.util.Scanner;

/*Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário a seguinte frase: “Adivinhe qual número de 1 a 5 eu estou pensando”. Na sequência, o usuário deve inserir um número entre 1 e 5, e o seu programa deve gerar aleatoriamente outro número, também de 1 a 5. Se o número gerado for o mesmo que o usuário inseriu, o programa deve escrever na tela “Você acertou!”, mas se for diferente, o programa deve escrever “Você errou, o número correto era X”, onde X é o número gerado aleatoriamente pelo programa.*/

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tente adivinhar o número surpresa, digite um número inteiro de 1 a 5: ");
        Integer num = scanner.nextInt();
        Integer random = (int) (Math.random() * (5.99 - 1) + 1);
        if (num.equals(random)) {
            System.out.printf("PARABÉNS! Você acertou o número surpresa: %d.", random);
        } else {
            System.out.printf("ERROU! Você digitou %d, mas o número surpresa era %d.", num, random);
        }
    }
}
