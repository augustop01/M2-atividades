package m1s03.ex_01;

public class Funcionario {
    private String nome;
    private Float salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, Float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Float aumentar(Float valor){
        return salario = valor + this.salario;
    }

    public Float aumentar(Float valor, Float comissao){
        return salario = valor + comissao + this.salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome: '" + nome + '\'' +
                ", salario: R$" + salario +
                '}';
    }
}
