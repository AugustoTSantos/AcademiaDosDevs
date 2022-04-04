package JavaPOO.Aula02;

public class Aula02 {
    public static void main(String[] args) {
        Celular celular1 = new Celular(); // declarando objeto do tipo Celular
        celular1.nome = "Iphone 12";
        celular1.sistemaOperacional = "IOS";
        celular1.espacoArmazenamento = 256;
        celular1.tamanhoTela = 6.1f;

        Celular celular2 = new Celular(); // declarando objeto do tipo Celular
        celular1.nome = "Galaxy Note 20 Ultra";
        celular1.sistemaOperacional = "Android";
        celular1.espacoArmazenamento = 256;
        celular1.tamanhoTela = 6.9f;

        System.out.format("O celular %s tem o sistema operacional %s, com espaço de memória de %d gb e uma tela de %.1f polegadas \n \n",
        celular1.nome, celular1.sistemaOperacional, celular1.espacoArmazenamento, celular1.tamanhoTela);

        System.out.format("O celular %s tem o sistema operacional %s, com espaço de memória de %d gb e uma tela de %.1f polegadas \n \n",
        celular2.nome, celular2.sistemaOperacional, celular2.espacoArmazenamento, celular2.tamanhoTela);
    }
}
