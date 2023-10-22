package m1s02.ex_06;
/*Neste exercício, você projetará uma classe PerfilDeSaude para uma pessoa. Os atributos da classe devem incluir nome, sobrenome, sexo, data de nascimento, altura (em metros) e peso (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba esses dados.

Para cada atributo, analise a necessidade de fornecer métodos set e get. A classe também deve incluir métodos que calculem e retornem a idade do usuário em anos, intervalo de frequência cardíaca máxima e frequência cardíaca alvo (vide exercício anterior), além de índice de massa corporal (IMC, pesquise a fórmula).

Escreva um aplicativo Java que solicite as informações da pessoa (utilize Scanner), instancie um objeto da classe PerfilDeSaude para ela e imprima as informações a partir desse objeto — incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ––, e então calcule e imprima a idade em anos, IMC, intervalo de frequência cardíaca máxima e frequência cardíaca alvo.*/
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PerfilDeSaude {
    private String nome, sobrenome, sexo, dataDeNascimento;
    private Integer idade, freqMax;
    private Double altura, peso;

    public PerfilDeSaude(String nome, String sobrenome, String sexo, Double altura, Double peso, String dataDeNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.dataDeNascimento = dataDeNascimento;

        getIdade();
        getFreqMax();
        getFrequenciaAlvo();
        getIMC();
    }

    @Override
    public String toString() {
        return "PerfilDeSaude{" +
                "Nome: '" + nome + " " + sobrenome + '\'' +
                ", Sexo: '" + sexo + '\'' +
                ", Data de Nascimento: '" + dataDeNascimento + '\'' +
                ", Idade: " + idade +
                ", Altura: " + altura + "m" +
                ", Peso: " + peso + "kg" +
                '}';
    }

    public Integer getIdade() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate nascimento = LocalDate.parse(this.dataDeNascimento, format);
        Integer idade = Period.between(nascimento, LocalDate.now()).getYears();
        System.out.printf("O usuário tem %d anos de idade.\n", idade);
        return this.idade = idade;
    }

    public Integer getFreqMax() {
        this.freqMax = 220 - idade;
        System.out.printf("A frequência cardíaca MÁXIMA do usuário é de %dbpm.\n", freqMax);
        return this.freqMax;
    }

    public void getFrequenciaAlvo() {
        System.out.printf("A frequência cardíaca ALVO do usuário é de entre %.0fbpm e %.0fbpm.\n", freqMax * 0.5, freqMax * 0.85);
    }

    public void getIMC() {
        System.out.printf("O índice de IMC do usuário é de %.2f.\n", this.peso / Math.pow(this.altura, 2));
    }
}
