package m1s01.ex_08;

/*Crie um programa em Java que, utilizando a classe Scanner, simule uma calculadora de P.A. e P.G. Peça para o usuário inserir um “valor inicial”, que deve ser um número inteiro. Em seguida, peça ao usuário para inserir um valor para a raiz. Depois, pergunte ao usuário se ele deseja calcular os 10 primeiros valores de uma P.A. ou de uma P.G. para os números inseridos anteriormente. Então, calcule os 10 primeiros valores de uma P.A. ou P.G. utilizando os números inseridos pelo usuário, e escreva essa sequência de valores na tela para o usuário visualizar o resultado.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------- CALCULADORA DE P.A. E P.G. --------");
        System.out.println("Informe o valor inicial: ");
        Integer n1 = scanner.nextInt();
        System.out.println("Agora, informe o valor da raiz: ");
        Integer n2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Escolha a operação desejada:\n" +
                "- Progressão aritmética (PA): calcular os 10 primeiros valores de uma P.A.\n" +
                "- Progressão geométrica (PG): calcular os 10 primeiros valores de uma P.G.");
        String op = scanner.nextLine();
        Integer resultado = n1;
        switch (op){
            case "PA", "pa" -> {
                Integer i;
                for (i = 0; i < 10; i++){
                    Integer pos = i + 1;
                    System.out.printf("%dº: %d\n", pos, resultado);
                    resultado = n1 + n2;
                    n1 = resultado;
                }
            }
            case "PG", "pg" -> {
                Integer i;
                for (i = 0; i < 10; i++){
                    Integer pos = i + 1;
                    System.out.printf("%dº: %d\n", pos, resultado);
                    resultado = n1 * n2;
                    n1 = resultado;
                }
            }
        }
    }
}
