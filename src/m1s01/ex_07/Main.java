package m1s01.ex_07;
/*Crie um programa em Java que, utilizando a classe Scanner, simule uma calculadora. O programa deve pedir um número, depois outro, e por último uma operação. O sistema deve aceitar como operação qualquer uma dessas 4 opções: “somar”, “subtrair”, “multiplicar” ou "dividir", e realizar a operação correspondente entre os 2 números inseridos, para então escrever na tela do usuário o resultado.*/
import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opName = "0";
        double resultado = 0;
        System.out.println("----- CALCULADORA -----");
        System.out.println("Digite um número (n1): ");
        Double n1 = scanner.nextDouble();
        System.out.println("Digite outro número (n2): ");
        Double n2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Agora, selecione a operação desejada: \n" +
                "-SOMAR (+),\n" +
                "-SUBTRAIR (-),\n" +
                "-MULTIPLICAR (*),\n" +
                "-DIVIDIR (/).");
        String op = scanner.nextLine();
        System.out.println("Aguarde...");
        switch (op) {
            case "+", "SOMAR" -> {
                resultado = n1 + n2;
                opName = "SOMA";
            }
            case "-", "SUBTRAIR" -> {
                resultado = n1 - n2;
                opName = "SUBTRAÇÃO";
            }
            case "*", "MULTIPLICAR" -> {
                resultado = n1 * n2;
                opName = "MULTIPLICAÇÃO";
            }
            case "/", "DIVIDIR" -> {
                resultado = n1 / n2;
                opName = "DIVISÃO";
            }
            default -> System.out.println("A operação escolhida não é válida.");
        }
        System.out.printf("O resultado da %s dos números escolhidos é: %f", opName, resultado);
    }
}
