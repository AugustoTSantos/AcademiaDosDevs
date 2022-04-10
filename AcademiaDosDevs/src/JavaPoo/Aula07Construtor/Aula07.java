package JavaPoo.Aula07Construtor;

public class Aula07 {
    public static void main(String[] args) {
        Pessoas pessoa1 = new Pessoas("Augusto", 23, 1.70);
        // definindo os valores de pessoa1 de acordo com os parametros do meu metodo construtor

        /*
        pessoa1.setNome("Augusto");
        pessoa1.setIdade(23);
        pessoa1.setAltura(1.70);
        Devido ao metodo construtor eu não preciso definir os valores de pessoa1 separadamente
        */ 
        pessoa1.setIdade(24);
        pessoa1.mostrarDados();
    }
}
