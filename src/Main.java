import model.Aluno;
import model.Cachorro;
import model.Gato;
import model.Tutor;

public class Main {
    public static void main(String[] args) {
        //TODO: Criar 3 objetos do tipo cachorro
        Cachorro c1 = new Cachorro("Rex", 3, "Labrador");
        Cachorro c2 = new Cachorro("Buddy", 2, "Golden Retriever");
        Cachorro c3 = new Cachorro("Luna", 1, "Siberian Husky");

        //TODO: chamar um println com os 3 objetos criados
        // Exemplo: System.out.println(cachorro1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //TODO: Altere a raça do primeiro cachorro e exiba o objeto novamente
        c1.raca = null;
        System.out.println(c1);

        //TODO: Altere o nome do segundo cachorro e exiba o objeto novamente
        c2.setNome("Max");
        System.out.println(c2.getNome());
        c1.patrulhar();

        //TODO: Crie uma classe Aluno com os atributos [ra, nome, email, curso, modulo]
        Aluno a1 = new Aluno(12345, "João Silva", "joao.silva@email.com", "Engenharia de Software", 3);
        Aluno a2 = new Aluno(54321, "Maria Oliveira", "maria.oliveira@email.com", "Ciência da Computação", 2);

        //TODO: 2 objetos do tipo Aluno e exiba-os
        System.out.println(a1);
        System.out.println(a2);

        Cachorro c = new Cachorro("Rex", 3, "Labrador");
        Gato g = new Gato("Mimi", 2, "Siamês");

        System.out.println(g instanceof Gato);

    }
}