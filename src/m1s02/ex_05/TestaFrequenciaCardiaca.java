package m1s02.ex_05;

import java.time.LocalDate;
import java.time.Month;
public class TestaFrequenciaCardiaca {
    public static void main(String[] args) {
        FrequenciaCardiaca freqCard = new FrequenciaCardiaca("Fulano", "da Silva", LocalDate.of(2001, Month.JULY, 15));

        System.out.println("Idade: " + freqCard.getIdade());
        System.out.println("Frequência cardíaca máxima: " + freqCard.getFrequenciaMaxima() + "bpm.");
        freqCard.getFrequenciaAlvo();
    }
}
