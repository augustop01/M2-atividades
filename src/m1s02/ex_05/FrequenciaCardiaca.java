package m1s02.ex_05;


import org.w3c.dom.ranges.Range;

import java.time.LocalDate;
import java.time.Period;

/*Crie uma classe chamada FrequenciaCardiaca. Os atributos da classe devem incluir o nome, sobrenome e data de nascimento da pessoa. Sua classe deve ter um construtor que receba esses dados como parâmetros. Para cada atributo, forneça métodos set e get.

A classe também deve incluir um método que calcule e retorne a idade (em anos), um que calcule e retorne a frequência cardíaca máxima e um que calcule e retorne a frequência cardíaca alvo da pessoa. Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe FrequenciaCardiaca e imprima as informações a partir desse objeto — incluindo nome, sobrenome e data de nascimento da pessoa — calcule e imprima a idade da pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.*/
public class FrequenciaCardiaca {
    private String nome, sobrenone;
    private LocalDate dataDeNascimento;

    public FrequenciaCardiaca(String nome, String sobrenone, LocalDate dataDeNascimento){
        this.nome = nome;
        this.sobrenone = sobrenone;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenone() {
        return sobrenone;
    }

    public void setSobrenone(String sobrenone) {
        this.sobrenone = sobrenone;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Integer getIdade(){
        return Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }

    public Integer getFrequenciaMaxima(){
        return 220 - Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }

    public void getFrequenciaAlvo(){
        Integer freqMax = 220 - Period.between(dataDeNascimento, LocalDate.now()).getYears();
        System.out.printf("A sua frequência cardíaca alvo é de entre %.0fbpm e %.0fbpm.", freqMax*0.5, freqMax*0.85);
    }
}
