package JavaPoo.Aula09CriarInterface.Classes;

public class Quadrado extends FigurasGeometricas {
    private int raio;

    public Quadrado(int raio) {
        this.raio = raio;
    }

    public double calcularRaio() {
        return Math.pow(raio, 2);
    }

    public int getRaio() {
        return raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }
}
