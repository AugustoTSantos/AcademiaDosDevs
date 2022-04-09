package JavaPoo.Aula06GetSet;

public class Pessoas {
    private String nome;
    private String cpf;
    private int idade;
    private double altura;

    public String mostrarNome() {
        return nome;
    }

    public void mudarNome(String nome) {
        this.nome = nome; /* this.nome pega o nome dentro da variavel pessoas
        enquanto = nome se refere ao parametro que está dentro do metoo mudar nome */
    }
}