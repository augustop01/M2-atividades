package m1s04.ex_05.org.devinhouse.superherois.model;

public class Vilao extends Personagem {
    protected Integer tempoDePrisao;

    public Vilao(String nome, String superpoder, Integer tempoDePrisao){
        super.nome = nome;
        super.superpoder = superpoder;
        this.tempoDePrisao = tempoDePrisao;
    }
}
