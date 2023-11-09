package m1s03.ex_05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
        Path linhasMegaSena = Paths.get("src","m1s03","ex_05","megasena.txt");
        List<Concurso> listaConcurso = new ArrayList<>();

        List<String> numerosDaMega = Files.readAllLines(linhasMegaSena);

        for(String linha : numerosDaMega){
            String[] linhas = linha.split(",");
            Integer numeros = Integer.parseInt(linhas[0]);
            String linhaString = linhas[1];
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(linhaString, formato);
            int[] numerosSorteados = new int[6];
            for(int i=0; i<=5; i++){
                numerosSorteados[i] = Integer.parseInt(linhas[i+2]);
            }
            listaConcurso.add(new Concurso(numeros, data, numerosSorteados));
        }
        System.out.println(listaConcurso);

    }
}
