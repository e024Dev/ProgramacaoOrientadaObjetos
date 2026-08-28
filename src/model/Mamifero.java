package model;

public abstract class Mamifero extends Animal {
    public Mamifero(String pNome, int pIdade, String pRaca) {
        super(pNome, pIdade, pRaca);
    }

    public abstract void patrulhar();
}
