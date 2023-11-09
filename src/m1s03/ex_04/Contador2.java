package m1s03.ex_04;

public class Contador2 {
    private String frase;

    public Contador2(String frase){
        this.frase = frase;
    }

    public void contarPalavras(){
        String[] separador = frase.split("\\s+");
        Integer contador = separador.length;

        System.out.printf("A frase %s '%s' %s é composta por: %d palavras.", "\u001B[33m", frase, "\u001B[0m", contador);
    }
}
