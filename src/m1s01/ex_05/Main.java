package m1s01.ex_05;

import java.util.Scanner;

/*Crie um programa em Java que, utilizando a classe Scanner, peça ao usuário para inserir as notas do semestre, e deve retornar a média final. O programa deve pedir 3 notas, que devem ser números reais, e retornar um número real com 2 casas depois da vírgula, com o texto “Sua média final é:” seguido do valor.*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----CALCULADORA DE MÉDIA (n1, n2 e n3)-----");
        System.out.println("Digite a primeira nota (n1): ");
        Double n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota (n2): ");
        Double n2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota (n3): ");
        Double n3 = scanner.nextDouble();
        Double media = (n1 + n2 + n3) / 3;
        System.out.printf("Sua média final é: %.2f.", media);
    }

}
