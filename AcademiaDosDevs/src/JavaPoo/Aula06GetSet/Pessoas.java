package JavaPoo.Aula06GetSet;

public class Pessoas {
    private String nome;
    private int idade;
    private double altura;

    /*
    Para se modificar usa setNomeVariavel
    Para pegar usa getNomeVariavel
    */
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome; /* this.nome pega o nome dentro da variavel pessoas
        enquanto = nome se refere ao parametro que está dentro do metoo mudar nome */
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }
     public void setAltura(double altura) {
        this.altura = altura;
    }
}
