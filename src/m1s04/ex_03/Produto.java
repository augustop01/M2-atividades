package m1s04.ex_03;

public class Produto implements Tributavel{
    @Override
    public Double calcularValorComImposto(Double valor, Double valorImposto){
        return valor + valorImposto;
    }
}
