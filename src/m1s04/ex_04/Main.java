package m1s04.ex_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Por favor, informe sua idade em anos:");
            Integer idade = ValidaIdade.validaIdade(scanner.nextInt());
            System.out.printf("Olá, você tem %d anos de idade!", idade);
        } catch (ExceptionIdade e){
            e.printStackTrace();
        }
    }
}
