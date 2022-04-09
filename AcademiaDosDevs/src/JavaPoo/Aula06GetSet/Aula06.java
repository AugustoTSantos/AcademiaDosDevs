package JavaPoo.Aula06GetSet;

public class Aula06 {
    public static void main(String[] args) {
        
        Pessoas pessoa = new Pessoas();

        pessoa.mudarNome("Augusto");
        System.out.println(pessoa.mostrarNome());
    }
}
