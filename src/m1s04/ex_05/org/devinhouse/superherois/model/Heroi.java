package m1s04.ex_05.org.devinhouse.superherois.model;

public class Heroi extends Personagem{
    private String nomeVidaReal;

    public Heroi(String nome, String superpoder, String nomeVidaReal){
        super.nome = nome;
        super.superpoder = superpoder;
        this.nomeVidaReal = nomeVidaReal;
    }


}
