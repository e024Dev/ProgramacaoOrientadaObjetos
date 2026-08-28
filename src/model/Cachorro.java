package model;

public class Cachorro extends Mamifero {
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade, raca);
    }

    @Override
    public void patrulhar() {
        System.out.println("O cachorro está patrulhando!");
    }

    public void emitirSom() {
        System.out.println("Au Au!");
    }
}


// 1. Começar com letras, _ ou $
// 2. Nao utilizar palavras reservadas

// Boas práticas
// 1. camelCase para variaveis
// 2. PascalCase para Classes
// 3. SNAKE_CASE para contantes
// 4. Prefixos padrão: set, get, add, listener
