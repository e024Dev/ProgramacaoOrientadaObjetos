package model;

public class Cachorro {
    // Atributos: modificador Tipo identificador
    public String nome;
    public int idade;
    public String raca;

    // Comportamentos
    public void latir() {
        System.out.printf("%s: Au au!\n", nome);
    }

    public  void comer() {
        System.out.printf("%s: Está comento!\n", nome);

    }

    public void dormir() {
        System.out.printf("%s: Está dormindo!\n", nome);
    }


    // Construtor de Classe padrão
    public Cachorro() {}

    // Construtor com argumentos
    public Cachorro(String pNome, int pIdade, String pRaca) {
        nome = pNome;
        idade = pIdade;
        raca = pRaca;
    }

    // Representação textual da classe
    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", raca='" + raca + '\'' +
                '}';
    }
}


// 1. Começar com letras, _ ou $
// 2. Nao utilizar palavras reservadas

// Boas práticas
// 1. camelCase para variaveis
// 2. PascalCase para Classes
// 3. SNAKE_CASE para contantes
// 4. Prefixos padrão: set, get, add, listener
