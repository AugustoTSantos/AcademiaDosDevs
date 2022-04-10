package JavaPoo.Aula07Construtor;
//Atributos da classe
public class Pessoas {
    private String nome;
    private int idade;
    private double altura;
    private int id;

    /*
    Metodo Construtor
    puclic/private nomeClasse()
    */
    //Metodo construtor
    public Pessoas(String nome, int idade, double altura) {
    /*Definindo oq o usuario precisa incerir quando chamar o metodo construtor dentro do ()*/
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    id = 1; // não colocando this. pois estou defindo o id eu mesmo no lugar de pedir para o usuario digitar

    System.out.format("Nome: %s \nIdade: %d \nAltura: %.2f M \n\n",
    getNome(), getIdade(), getAltura());
    // defiindo oq mais vai acontecer quando o metodo construtor for chamado (opicional)
}
    //Metodos especificos
    public void mostrarDados() {
        System.out.format("Nome: %s \nIdade: %d \nAltura: %.2f M \nId: %d",
        getNome(), getIdade(), getAltura(), getId());
}

    //Metodos get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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

    public int getId() {
        return id;
    }
    public void setId() {
        this.id = id;
    }
}
