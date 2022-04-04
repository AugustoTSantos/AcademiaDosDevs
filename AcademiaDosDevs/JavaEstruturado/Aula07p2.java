package JavaEstruturado;

public class Aula07p2 {
    public static void main(String[] args) {
        int numeroA = -9;
        int numeroB = 9;

        int absoluto = Math.abs(numeroA); // usando .abs do metodo Math para pegar valores absolutos (desconsidera o sinal do número)
        int potencia = (int) Math.pow(numeroB, 2); /* usando .pow do metodo Math para fazer a potencia de 9^2
        e forçando o número a ser int com (int) */
        double raizQuadrada = Math.sqrt(numeroB); // usando .sqrt do metodo Math para fazer raiz quadrada de nove
        int arredondaC = (int) Math.ceil(7.3); // usando .ceil do metodo Math para arrendodar um número para cima
        double arredondaB = Math.floor(7.3); // usando .floor  do metodo Math para arrendodar um número para baixo
        int menor = Math.min(numeroA, numeroB); // usando .min do metodo Math para pegar o menor valor entre os valores selecionados

        System.out.println(absoluto + "\n" +
        potencia + "\n" +
        raizQuadrada + "\n" +
        arredondaC + "\n" +
        arredondaB + "\n" +
        menor);
    }
}
