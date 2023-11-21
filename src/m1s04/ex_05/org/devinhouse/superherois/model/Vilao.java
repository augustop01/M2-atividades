package m1s04.ex_05.org.devinhouse.superherois.model;

public class Vilao extends Personagem {
    protected Integer tempoDePrisao;

    public Integer getTempoDePrisao() {
        return tempoDePrisao;
    }

    public void setTempoDePrisao(Integer tempoDePrisao) {
        this.tempoDePrisao = tempoDePrisao;
    }

    public Vilao(String nome, String superpoder, Integer tempoDePrisao){
        super.nome = nome;
        super.superpoder = superpoder;
        this.tempoDePrisao = tempoDePrisao;
    }

    @Override
    public String toString() {
        return  "\u001B[31m" + "VILÃO" + '\n' +
                "\u001B[37m" + "Vilão: " + nome + '\n' +
                "Superpoder: " + superpoder + '\n' +
                "Tempo de Prisão: " + tempoDePrisao + '\n' +
                "-------------------------";
    }
}
