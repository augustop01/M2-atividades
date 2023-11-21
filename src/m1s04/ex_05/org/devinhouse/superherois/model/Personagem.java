package m1s04.ex_05.org.devinhouse.superherois.model;

import java.util.Objects;

public abstract class Personagem implements Comparable<Personagem> {
    protected String nome;
    protected String superpoder;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personagem outroObj = (Personagem) o;
        return this.getNome().equals(outroObj.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, superpoder);
    }

    @Override
    public int compareTo(Personagem o) {
        return this.getNome().compareTo(o.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }
}