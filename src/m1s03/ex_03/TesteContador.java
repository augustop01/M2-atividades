package m1s03.ex_03;

import java.util.Scanner;

public class TesteContador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase para que o programa conte a quantidade de palavras:");
        String frase = scanner.nextLine();
        Contador.contarPalavras(frase);
    }
}
