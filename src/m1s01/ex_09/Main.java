package m1s01.ex_09;
/*A sua empresa resolveu dar um aumento de salário aos seus funcionários e te pediram para desenvolver o programa que calculará os reajustes.

        a. Faça um programa que recebe o salário de um funcionário e o reajuste segundo o seguinte critério, baseado no salário atual;
        b. Salários até R$ 1200,00 (incluindo): aumento de 20%;
        c. Salários entre R$ 1200,00 e R$1700,00: aumento de 15%;
        d. Salários entre R$ 1700,00 e R$ 2500,00: aumento de 10%;
        e. Salários de R$ 2500,00 em diante: aumento de 5%
        Após o aumento ser realizado; informe na tela;

        a. O salário antes do reajuste;
        b. O percentual de aumento aplicado;
        c. O valor do aumento;
        d. O novo salário, após o aumento.*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(-------- APLICATIVO DE REAJUSTE DE SALÁRIO --------)");
        Double salarioAtual = null;
        Double diferenca = null;
        String aumento = "0";
        System.out.println("Informe seu salário atual: ");
        Double salarioInicial = scanner.nextDouble();
        if (salarioInicial > 0 && salarioInicial <= 1200){
             salarioAtual = salarioInicial * 1.20;
             aumento = "20%";
             diferenca = salarioAtual - salarioInicial;
        }
        if (salarioInicial > 1200 && salarioInicial < 1700){
             salarioAtual = salarioInicial * 1.15;
             aumento = "15%";
             diferenca = salarioAtual - salarioInicial;
        }
        if (salarioInicial > 1700 && salarioInicial < 2500){
             salarioAtual = salarioInicial * 1.10;
             aumento = "10%";
             diferenca = salarioAtual - salarioInicial;
        }
        if (salarioInicial >= 2500){
             salarioAtual = salarioInicial * 1.05;
             aumento = "5%";
             diferenca = salarioAtual - salarioInicial;
        } else {
            System.out.println();
        }

        System.out.printf("Informações de reajuste salarial:\n" +
                "Salário antes do reajuste: R$%.2f,\n" +
                "O percentual de aumento foi de: %s,\n" +
                "O valor real aumentado foi de: R$%.2f,\n" +
                "Por fim, o salário reajustado ficou em: R$%.2f.", salarioInicial, aumento, diferenca, salarioAtual);
    }


}
