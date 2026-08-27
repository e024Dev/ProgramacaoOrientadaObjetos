package model;

public class Aluno {
    public Integer ra;
    public String nome;
    public String email;
    public String curso;
    public Integer modulo;

    public Aluno(Integer ra, String nome,
                 String email, String curso, Integer modulo) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.modulo = modulo;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra='" + ra + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", curso='" + curso + '\'' +
                ", modulo=" + modulo +
                '}';
    }
}

//TODO: Crie uma classe Aluno com os atributos [ra, nome, email, curso, modulo]

