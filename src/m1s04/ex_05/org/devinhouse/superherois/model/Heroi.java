package m1s04.ex_05.org.devinhouse.superherois.model;

public class Heroi extends Personagem{
    private String nomeVidaReal;

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String nomeVidaReal) {
        this.nomeVidaReal = nomeVidaReal;
    }

    public Heroi(String nome, String superpoder, String nomeVidaReal){
        super.nome = nome;
        super.superpoder = superpoder;
        this.nomeVidaReal = nomeVidaReal;
    }

    @Override
    public String toString() {
        return  "\u001B[32m" + "HERÓI" + '\n' +
                "\u001B[37m" + "Herói: " + nome + '\n' +
                "Superpoder: " + superpoder + '\n' +
                "Nome na Vida Real: " + nomeVidaReal + '\n' +
                "-------------------------";
    }
}
