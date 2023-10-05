package m1s01.ex_06;
/*Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário sua data de nascimento e calcule a sua idade.
Se o usuário tiver 16, 17, ou mais de 59 anos, o voto é opcional.
Entre 18 e 59 anos, o voto é obrigatório.
Abaixo de 16, o voto é proibido.
Informe ao usuário a situação de voto.*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----OBRIGAÇÃO ELEITORAL-----");
        System.out.println("Qual seu ano de nascimento?");
        int anoNascimento = scanner.nextInt();
        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - anoNascimento;
        if(idade == 16 || idade == 17 || idade > 59 && idade < 125){
            System.out.println("Seu voto é OPCIONAL.");
        }
        if(idade >= 18 && idade <= 59){
            System.out.println("Seu voto é OBRIGATÓRIO.");
        }
        if(idade < 16 && idade >= 0){
            System.out.println("Por lei, você ainda é PROÍBIDO de votar.");
        } else {
            System.out.println("A lei não trata sobre a obrigação eleitoral de seres sobrenaturais.");
        }
    }
}
