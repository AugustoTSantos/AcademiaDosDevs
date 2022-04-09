package JavaPoo.Aula03CriandoMetodos;

public class Aula03 {
    public static void main(String[] args) {
        Personagem heroi1 = new Personagem();
        heroi1.nome = "Hércules";
        heroi1.classe = "Barbaro";
        heroi1.lvl = 2;
        heroi1.forca = 16;
        heroi1.agilidade = 14;
        heroi1.constituicao = 16;
        heroi1.inteligencia = 6;
        heroi1.sabedoria = 8;
        heroi1.carisma = 8;

        heroi1.mostrarStatus(); // chamando o metodo mostrarStatus
        heroi1.atacar("Hydra"); // chamando o metodo atacar de definindo Hydra como parametro
        heroi1.andar();
        heroi1.defender();
        heroi1.soltarMagia("Hydra");
        heroi1.percepcao();
        heroi1.labia();
    }
}
