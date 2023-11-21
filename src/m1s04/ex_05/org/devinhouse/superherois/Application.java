package m1s04.ex_05.org.devinhouse.superherois;

import m1s04.ex_05.org.devinhouse.superherois.cli.Display;
import m1s04.ex_05.org.devinhouse.superherois.exception.OpcaoInvalidaException;
import m1s04.ex_05.org.devinhouse.superherois.model.Heroi;
import m1s04.ex_05.org.devinhouse.superherois.model.Options;
import m1s04.ex_05.org.devinhouse.superherois.model.Personagem;
import m1s04.ex_05.org.devinhouse.superherois.model.Vilao;
import m1s04.ex_05.org.devinhouse.superherois.repository.PersonagemRepository;

import java.util.List;

public class Application {

    private Display display = new Display();

    private PersonagemRepository personagemRepo = new PersonagemRepository();
    public void executar() {

        Options option = null;

        do{
            display.userMenu();
            int codigo = display.obterOpcao();
            try {
                option = Options.converter(codigo);
                processar(option);
            } catch (OpcaoInvalidaException e) {
                display.exibirMensagem(e.getMessage());
            }

        } while (option != Options.SAIR);
    }

    private void processar(Options option) {
        if (option == Options.SAIR)
            return;
        if (option == Options.CADASTRAR_HEROI){
          Heroi heroi = display.setDadosHeroi();
          personagemRepo.inserir(heroi);
        }
        else if (option == Options.CADASTRAR_VILAO){
            Vilao vilao = display.setDadosVilao();
            personagemRepo.inserir(vilao);
        }
        else if (option == Options.LISTAR){
            List<Personagem> personagens = personagemRepo.listar();
            display.listar(personagens);

        }
    }
}
