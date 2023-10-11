package m1s02.ex_03;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

/* Programa não compilaria se colocassemos os seguintes setters, devido às condições declaradas nestes:
   retangulo.setComprimento(-0.3F);
   retangulo.setLargura(21.5F); */

        retangulo.setComprimento(0.5F);
        retangulo.setLargura(5.5F);

        System.out.printf("O retângulo tem comprimento de %.2f e largura de %.2f.\n" +
                "O perímetro do retângulo é de %.2f.\n" +
                "A área do retângulo é de %.2f.", retangulo.getComprimento(), retangulo.getLargura(), retangulo.calculaPerimetro(), retangulo.calculaArea());
    }
}
