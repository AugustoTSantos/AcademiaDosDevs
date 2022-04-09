package JavaEstruturado.Aula13ComoCriarArrays;

import java.util.Arrays;

public class Aula13 {
    // um arrey serve pra armazenar varios dados do mesmo tipo em um lugar
    //tipo[] nomeVariavel = new tipo[tamanho]
    // obs o tamnho começa no 0, então digite o número que vc precisa + 1
    public static void main(String[] args) {
    String[] nomes = new String[] {
        "Naruto", "Sasuke", "Kakashi", "Sakura", "Sai"
    };

    /*
    nomes[0] = "Naruto";
    nomes[1] = "Sasuke";
    nomes[2] = "Kakashi";
    nomes[3] = "Sakura";
    nomes[4] = "Sai";
    outra forma de colocar valores dentro do array, porém seria preciso definir o tamanho em new String[x]
    */

    int posicaoVetor;
    for(posicaoVetor = 0; posicaoVetor < 5; posicaoVetor++) {
        System.out.println(nomes[posicaoVetor]);
    }

    int[] numeros = new int[100]; // fazendo um novo arrey, chamado numeros, de  valores inteiros com 100 vetores
    int contador = 0; // crianddo variavel contador e defininndo seu valor como 0
    Arrays.fill(numeros, contador += 1); // usando função .fill de Arrays para preencher o array numeros com o valor de contador += 1

    System.out.println(Arrays.toString(numeros)); // usando .toString para converter os valores de números para String e imprimilos com sysout
    System.out.println(numeros.length); // usando .length para descobrir quantos vetores existem em numeros
    }
}
