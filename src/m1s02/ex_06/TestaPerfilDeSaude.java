package m1s02.ex_06;

import java.util.Scanner;

public class TestaPerfilDeSaude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Forneça, respectivamente, seus seguintes dados:\n" +
                "- Nome,\n" +
                "- Sobrenome,\n" +
                "- Sexo,\n" +
                "- Altura (em metros),\n" +
                "- Peso (em kg),\n" +
                "- Data de nascimento (DD/MM/AAAA);");

        String nome = scanner.nextLine();
        String sobrenome = scanner.nextLine();
        String sexo = scanner.nextLine();
        Double altura = scanner.nextDouble();
        Double peso = scanner.nextDouble();
        scanner.nextLine();
        String nascimento = scanner.nextLine();

        PerfilDeSaude perfil = new PerfilDeSaude(nome, sobrenome, sexo, altura, peso, nascimento);

        System.out.println(perfil);
    }
}
