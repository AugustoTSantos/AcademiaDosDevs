package JavaEstruturado.Aula06ComoLerDadosTeclado;

import java.util.Scanner;

public class Aula06P1 {
    public static void main(String[] args) {
        String numero; //converter string para int -> Integer.parseInt(variavel)   
        String numero2; //converter string para float -> Float.parseFloat(variavel) 
        String nome;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro abaixo");
            numero = leitor.nextLine(); // definando que o valor de "numero" vai ser igual ao que o usuario digitar em leitor usando o metodo next do Scanner
            Integer.parseInt(numero); // auterando a variavel de String para int
        System.out.println("O número inteiro digitado foi: \n\n" + numero);

        System.out.println("Digite um número float abaixo");
            numero2 = leitor.nextLine();
            Float.parseFloat(numero2); // auterando a variavel de String para float
        System.out.println("O número float digitado foi: \n\n" + numero2);

        System.out.println("Digite seu Nome Completo abaixo");
            nome = leitor.nextLine(); //usando nextLine para o Scanner ler até um quebra de linha         
        System.out.println("Seu nome completo é: \n\n" + nome); 
    }
}
