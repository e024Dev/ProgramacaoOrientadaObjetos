package model;

public abstract class Animal {
    private String nome;
    public int idade;
    public String raca;

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()
                || !Character.isLetter(nome.charAt(0))) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(Integer idade) {
        if (idade == null || idade < 0) {
            throw new IllegalArgumentException("Idade inválida");
        }
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca == null || raca.isEmpty()) {
            throw new IllegalArgumentException("Raça inválida");
        }
        this.raca = raca;
    }

    // Comportamentos
    public abstract void emitirSom();

    public void comer() {
        System.out.printf("%s: Está comento!\n", nome);

    }

    public void dormir() {
        System.out.printf("%s: Está dormindo!\n", nome);
    }

    // Construtor com argumentos
    public Animal(String pNome, int pIdade, String pRaca) {
        setNome(pNome);
        setIdade(pIdade);
        setRaca(pRaca);
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
