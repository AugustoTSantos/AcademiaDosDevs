package JavaPOO.Aula02;

public class Celular {
    // TipoVariavel nomeVariavel = valor
    String nome; // Criando um atributo do tipo String e chamado nome para a classe Celular
    String sistemaOperacional; // Criando um atributo do tipo String e chamado sistemaOperacional para a classe Celular
    int espacoArmazenamento; // Criando um atributo do tipo int e chamado nome para a classe Celular
    float tamanhoTela; // Criando um atributo do tipo float e chamado tamanhoTela para a classe Celular
    
    void qualidadesCelular() {
        System.out.format("O celular %s tem o sistema operacional %s, com espaço de memória de %d gb e uma tela de %.1f polegadas \n\n",
        nome, sistemaOperacional, espacoArmazenamento, tamanhoTela);
    };
}
