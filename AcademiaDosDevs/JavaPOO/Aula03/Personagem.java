package JavaPOO.Aula03;

public class Personagem {
    String nome;
    int lvl;
    int forca;

    void mostrarStatus() {
        System.out.format("Personagem: %s, lvl: %d, força: %d \n\n", nome, lvl, forca);
    }
}
