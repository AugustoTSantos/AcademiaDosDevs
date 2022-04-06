package JavaPOO.Aula03;

import java.util.Random;

public class Personagem {
    String nome;
    String classe;
    int lvl;
    int forca;
    int agilidade;
    int constituicao;
    int inteligencia;
    int sabedoria;
    int carisma;

    int d20() {
        Random gerador = new Random();
        int d20 = 1 + gerador.nextInt(19);
        return d20;
    };

    void mostrarStatus() {
        System.out.format("Personagem: %s, classe %s, lvl: %d, força: %d, agilidade: %d, constituição: %d, inteligencia: %d, sabedoria: %d, carisma: %d \n\n",
        nome, classe, lvl, forca, agilidade, constituicao, inteligencia, sabedoria, carisma);
    } 

    void atacar(String alvo) {
        int dano = d20() + forca;
        System.out.format("%s atacou %s e causou %d de dano. \n\n", nome, alvo, dano);
    }

    void andar() {
        int casas = d20() + agilidade;
        System.out.format("%s andou %d casas. \n\n", nome, casas);
    }

    void defender() {
        int defendeu = d20() + constituicao;
        System.out.format("%s defendeu %d de dano. \n\n", nome, defendeu);
    }

    void soltarMagia(String alvo) {
        int conjurar = d20() + inteligencia;
        System.out.format("%s conjurou uma magia em %s e causou %d de dano. \n\n", nome, alvo, conjurar);
    }

    void percepcao() {
        int perceber = d20() + sabedoria;
        System.out.format("%s tirou %d no teste de percepção. \n\n", nome, perceber);
    }

    void labia() {
        int conversar = d20() + carisma;
        System.out.format("%s tirou %d no teste de labia. \n\n", nome, conversar);
    }
}
