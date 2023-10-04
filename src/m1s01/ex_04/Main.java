package m1s01.ex_04;

import java.util.Scanner;

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
