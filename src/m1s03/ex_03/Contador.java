package m1s03.ex_03;

public class Contador {
    public static void contarPalavras(String frase){

        String[] separador = frase.trim().split("\\s+");
        Integer contador = separador.length;

        System.out.printf("A frase %s '%s' %s é composta por: %d palavras.", "\u001B[33m", frase, "\u001B[0m", contador);
    }
}
