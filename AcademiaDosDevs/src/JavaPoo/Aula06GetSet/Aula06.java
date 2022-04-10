package JavaPoo.Aula06GetSet;

public class Aula06 {
    public static void main(String[] args) {
        
        Pessoas pessoa = new Pessoas();

        pessoa.setNome("Augusto");
        pessoa.setIdade(23);
        pessoa.setAltura(1.70);

        System.out.println(pessoa.getNome() + "\n" + 
        pessoa.getIdade() + "\n" + 
        pessoa.getAltura());
    }
}
