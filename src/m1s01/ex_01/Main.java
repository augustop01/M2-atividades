package m1s01.ex_01;

import java.util.Scanner;

/*Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário seu sobrenome, depois seu nome, e então escreva na tela, em uma única “string”, o nome completo do usuário. Informe também ao usuário quantas letras tem no nome dele.*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.println("Agora, informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.printf("Seu nome completo é: %s %s.", nome, sobrenome);
    }

}
