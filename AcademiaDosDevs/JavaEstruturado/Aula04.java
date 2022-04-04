package JavaEstruturado;

public class Aula04 {
    public static void main(String[] args) {
        byte numeroByte = 122; //byte é um tipo de variavel que serve para armazenar numeros de -128 até 127
        short numeroShort = 3333; //short é uma variavel que serve para armazenar numeros de -32768 até 32767
        int numeroInt = -66666666; // int é uma variavel que serve para armazenamento de numeros grandes
        long numeroLong = 999999999999999999l; // long é uma variavel que serve para armazenar numeros gigantes, é preciso colocar um l no final
            // Variaveis do tipo inteiro
        
        float numeroFloat = 78.7f; //float é uma variavel para números com partes decimais separadas por um ponto, é preciso colocar um f no final
        double numeroDouble =  3.141414141414123412341341; //double é uma variavel que serve para armazenar número com muitas casas decimais
            // Variaveis do tipo ponto flutuante
        
        char caractere = 'w'; //char guar 1 unico valor, precisa estar em aspas simples
            //Variaveis do tipo caractere
        
        boolean tf = false; // armazena verdadeiro ou falso
            //Variaveis do tipo booleano
        
        String nome = "Augusto"; // armazena dados como um texto, é preciso estar em aspas duplas
            //Variaveis do tipo String


        System.out.println(numeroByte);
        System.out.println(numeroShort);
        System.out.println(numeroInt);
        System.out.println(numeroLong);
        System.out.println("");
        System.out.println(numeroFloat);
        System.out.println(numeroDouble);
        System.out.println("");
        System.out.println(caractere);
        System.out.println("");
        System.out.println(tf);
        System.out.println("");
        System.out.println(nome);
    }
}