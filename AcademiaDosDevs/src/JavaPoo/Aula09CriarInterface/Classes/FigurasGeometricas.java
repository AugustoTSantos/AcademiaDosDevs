package JavaPoo.Aula09CriarInterface.Classes;

public class FigurasGeometricas {
    public double calcularRaio; // definindo oq as classes nas quais essa interface for implementada precisam ter

    public double somarAreas(FigurasGeometricas figura1, FigurasGeometricas figura2) {
        double soma = figura1.calcularRaio + figura2.calcularRaio;
        return soma;
    }
}
