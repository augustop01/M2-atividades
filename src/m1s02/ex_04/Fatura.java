package m1s02.ex_04;
/*Crie uma classe chamada Fatura para que uma loja de suprimentos de informática a utilize para representar uma fatura de um item vendido nela. Uma fatura deve incluir quatro partes das informações como variáveis de instância — o número (tipo String), a descrição (tipo String), a quantidade comprada de um item (tipo int) e o preço por item (double). Sua classe deve ter um construtor que inicializa as quatro variáveis de instância. Forneça um método set e um get para cada variável de instância.

Além disso, forneça um método chamado getValorFatura que calcula o valor da fatura (isto é, multiplica a quantidade pelo preço por item) e depois retorna esse valor como double. Se a quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item não for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado TestaFatura que demonstra as capacidades da classe Fatura.*/
public class Fatura {
    private String numero;
    private String descricao;
    private Integer quantidade;
    private Double precoPorUn;

    public Fatura(String numero, String descricao, Integer quantidade, Double precoPorUn){
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoPorUn = precoPorUn;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoPorUn() {
        return precoPorUn;
    }

    public void setPrecoPorUn(Double precoPorUn) {
        this.precoPorUn = precoPorUn;
    }

    public Double getValorFatura(){
        if(quantidade > 0){
            if(precoPorUn > 0){
                return quantidade * precoPorUn;
            }
            System.out.println("O preço por unidade não é positivo e será considerado como sendo 'R$0.0'.");
            precoPorUn = 0.0;
            return quantidade * precoPorUn;
        }
        System.out.println("A quantidade de produtos não é positiva e será considerada como sendo '0'.");
        quantidade = 0;
        return quantidade * precoPorUn;
    }
}
