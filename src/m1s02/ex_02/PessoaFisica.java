package m1s02.ex_02;
/*Crie uma classe PessoaFisica e pense em quais atributos ela deve possuir. Um deles, obrigatoriamente, será o CPF. Garanta que nenhuma pessoa física seja criada sem um CPF, e que nenhuma pessoa física possua um CPF inválido. (Não é preciso criar o algoritmo de validação de CPF, apenas a assinatura do método)*/
public class PessoaFisica {
    private String nome;
    private String sobrenome;
    private Double altura;
    private String CPF;

    public PessoaFisica(String CPF) {
        this.CPF = CPF;
    }

    public PessoaFisica(String CPF, String nome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.altura = altura;
        this.CPF = CPF;
    }

    public PessoaFisica(String CPF, String nome, String sobrenome, Double altura) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.altura = altura;
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "Nome:'" + nome + '\'' +
                ", Sobrenome:'" + sobrenome + '\'' +
                ", Altura:" + altura +
                ", CPF:'" + CPF + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) throws IllegalArgumentException{
        if (validaCPF(CPF)){
            this.CPF = CPF;
        } else {
            throw new IllegalArgumentException("O CPF fornecido não existe ou foi digitado incorretamente.");
        }
    }

    private boolean validaCPF(String CPF){
        // Algoritmo para validação de um CPF
        return  true;
    }

}