package m1s02.ex_03;
/*Crie uma classe Retangulo com os atributos comprimento e largura, cada um dos quais assume o valor padrão de 1. Forneça os métodos que calculam o perímetro e a área do retângulo. A classe tem métodos set e get para o comprimento e a largura. Os métodos set devem verificar se comprimento e largura são, cada um, números de ponto flutuante maiores que 0,0 e menores que 20,0. Escreva um programa para testar a classe Retangulo.*/
public class Retangulo {
    private Float comprimento = (float) 1;
    private Float largura = (float) 1;

    public Float getComprimento() {
        return comprimento;
    }

    public Float getLargura() {
        return largura;
    }

    public void setComprimento(Float comprimento) throws IllegalArgumentException {
        if (comprimento > 0.0 && comprimento < 20.0){
            this.comprimento = comprimento;
        } else {
            throw new IllegalArgumentException("O comprimento fornecido deve ser maior que 0.0 e menor que 20.0");
        }
    }

    public void setLargura(Float largura) throws IllegalArgumentException {

        if (largura > 0.0 && largura < 20.0){
            this.largura = largura;
        } else {
            throw new IllegalArgumentException("A largura fornecida deve ser maior que 0.0 e menor que 20.0");
        }
    }

    public Float calculaPerimetro(){
        return 2 * (comprimento + largura);
    }

    public Float calculaArea(){
        return comprimento * largura;
    }
}
