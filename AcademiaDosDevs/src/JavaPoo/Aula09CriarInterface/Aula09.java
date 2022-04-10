package JavaPoo.Aula09CriarInterface;

import JavaPoo.Aula09CriarInterface.Classes.Circulo;
import JavaPoo.Aula09CriarInterface.Classes.Quadrado;

public class Aula09 {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(2);
        Quadrado quadrado1 = new Quadrado(5);

        
        System.out.println(circulo1.calcularRaio());
        System.out.println( quadrado1.calcularRaio());
    }
}
