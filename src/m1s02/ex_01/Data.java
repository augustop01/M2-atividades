package m1s02.ex_01;
/*Crie uma classe chamada Data que inclua três variáveis de instância — mês (tipo int), dia (tipo int) e ano (tipo int). Forneça um construtor que inicializa as três variáveis de instância supondo que os valores fornecidos estejam corretos. Ofereça um método set e um get para cada variável de instância. Apresente um método exibirData que exiba mês, dia e ano separados por barras normais (/). Escreva um aplicativo de teste chamado TestaData que demonstre as capacidades da classe Data*/
public class Data {
    Integer mes;
    Integer dia;
    Integer ano;

    public Data(Integer dia, Integer mes, Integer ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void exibirData(){
        System.out.printf("A data fornecida foi: %d/%d/%d.\n", dia, mes, ano);
    }
}
