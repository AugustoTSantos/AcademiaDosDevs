package JavaPOO.Aula02;

public class Aula02 {
    public static void main(String[] args) {
        Celular celular1 = new Celular(); // declarando objeto do tipo Celular
        celular1.nome = "Iphone 12";
        celular1.sistemaOperacional = "IOS";
        celular1.espacoArmazenamento = 256;
        celular1.tamanhoTela = 6.1f;

        Celular celular2 = new Celular(); // declarando objeto do tipo Celular
        celular2.nome = "Galaxy Note 20 Ultra";
        celular2.sistemaOperacional = "Android";
        celular2.espacoArmazenamento = 256;
        celular2.tamanhoTela = 6.9f;

       celular1.qualidadesCelular();
       celular2.qualidadesCelular();
    }
}
