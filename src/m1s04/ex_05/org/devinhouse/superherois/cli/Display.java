package m1s04.ex_05.org.devinhouse.superherois.cli;

import m1s04.ex_05.org.devinhouse.superherois.model.Heroi;
import m1s04.ex_05.org.devinhouse.superherois.model.Personagem;
import m1s04.ex_05.org.devinhouse.superherois.model.Vilao;

import java.util.*;

public class Display {
    public void userMenu(){
        System.out.println("""
               ** Escolha uma das opções: **
                1 - Cadastrar Herói;
                2 - Cadastrar Vilão;
                3 - Listar;
                4 - Sair;
                """);
    }

    public void exibirMensagem(String message) {
        throw new IllegalArgumentException(message);
    }

    public int obterOpcao() {
        System.out.println("Informe a opção desejada: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int opcao = scanner.nextInt();
            return opcao;
        } catch (InputMismatchException e){
            return -1;
        }

    }

    public Heroi setDadosHeroi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do herói:");
        String nome = scanner.nextLine();
        System.out.println("Informe seu superpoder:");
        String poder = scanner.nextLine();
        System.out.println("Por fim, informe seu nome na vida real:");
        String nomeVidaReal = scanner.nextLine();
        return new Heroi(nome, poder, nomeVidaReal);
    }

    public Vilao setDadosVilao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do vilão:");
        String nome = scanner.nextLine();
        System.out.println("Informe seu superpoder:");
        String poder = scanner.nextLine();
        System.out.println("Por fim, informe seu tempo de prisão:");
        Integer tempoDePrisao = scanner.nextInt();
        return new Vilao(nome, poder, tempoDePrisao);
    }

    public void listar(List<Personagem> personagens) {
        Collections.sort(personagens);
        System.out.println("--Listando..." + "\n" + "-------------------------");
        personagens.forEach(System.out::println);
        System.out.println();
    }
}
