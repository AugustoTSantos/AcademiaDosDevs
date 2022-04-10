package JavaPoo.Aula09CriarInterface.Classes;

public class Circulo extends FigurasGeometricas {
    // Atributos
    private int raio;

    //Metodo Construtor
    public Circulo(int raio) {
        this.raio = raio;
    }

    //Metodos Especificos
    public double calcularRaio() {
        return Math.PI * Math.pow(raio, 2);
    }

    //Metodos get e set
    public int getRaio() {
        return raio;
    }
    public void setRaio(int raio) {
        this.raio = raio;
    }
}
