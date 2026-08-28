package model;

public class Gato extends Animal {
    public Gato(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}
