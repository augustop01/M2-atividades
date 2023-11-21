package m1s04.ex_05.org.devinhouse.superherois.repository;

import m1s04.ex_05.org.devinhouse.superherois.model.Personagem;

import java.util.ArrayList;
import java.util.List;

public class PersonagemRepository {

    private List<Personagem> personagens = new ArrayList<>();

    public void inserir(Personagem personagem){
        personagens.add(personagem);
    }

    public List<Personagem> listar(){
        return personagens;
    }
}

