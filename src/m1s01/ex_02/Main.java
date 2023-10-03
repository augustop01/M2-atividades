package m1s01.ex_02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua altura (ex: 1,70): ");
        Double altura = scanner.nextDouble();
        System.out.println("Informe seu peso (ex: 60): ");
        Integer peso = scanner.nextInt();

        Double IMC = peso / Math.pow(altura, 2) ;

        System.out.printf("Seu IMC é de: %.2f", IMC);
    }
}
