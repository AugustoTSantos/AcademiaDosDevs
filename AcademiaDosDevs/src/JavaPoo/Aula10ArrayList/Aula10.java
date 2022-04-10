package JavaPoo.Aula10ArrayList;

import java.util.ArrayList;

public class Aula10 {
    public static void main(String[] args) {
        //Criando Array nomes
        String[] arreyStatico = new String[5]; // array statico precisa de uma quantidade de espaços.
        arreyStatico[0] = "Naruto";
        arreyStatico[1] = "Sasuke";
        arreyStatico[2] = "Kakashi";
        arreyStatico[3] = "Sakura";
        arreyStatico[4] = "Sai";

        //ArreyList<Tipo> nome = new ArreyList<Tipo>();
        ArrayList<String> arreyDinamico = new ArrayList<String>();
        // arrays dinamicos geram espaços comforme itens são adicionados.
        arreyDinamico.add("Augusto"); // indice 0, arreyDinamico[0]
        arreyDinamico.add("Pedro"); // arreDinamico[1]
        arreyDinamico.add("João"); // arreDinamico[2]

        System.out.println("Imprimindo o array statico");
        for(int indice = 0; indice < arreyStatico.length; indice++) {
            System.out.println(arreyStatico[indice]);
        }

        System.out.println("\nImprimindo o array dinamico");
        for(int indice = 0; indice < arreyDinamico.size(); indice++) { //para ArrayList é preciso usar o .size()
            System.out.println(arreyDinamico.get(indice)); //para ArrayList é preciso usar .get()
        }

        arreyDinamico.remove(2); //Removendo indice 2 do meu array dinamico
        System.out.println("\nImprimindo o array dinamico");
        for(int indice = 0; indice < arreyDinamico.size(); indice++) { //para ArrayList é preciso usar o .size()
            System.out.println(arreyDinamico.get(indice)); //para ArrayList é preciso usar .get()
        }

        arreyDinamico.clear(); //Removendo todos os indices do meu array dinamico
        System.out.println("\nImprimindo o array dinamico");
        for(int indice = 0; indice < arreyDinamico.size(); indice++) { //para ArrayList é preciso usar o .size()
            System.out.println(arreyDinamico.get(indice)); //para ArrayList é preciso usar .get()
        }

        /*
        Para se fazer ArreyList de tipos primitivos é preciso usar uma Wrapper Class:
        int -> Integer
        float -> Float
        double -> Double
        char -> Character
        obs: Wrapper Classes são modos de representar tipos primitivos como um objeto.
        */
    }
}
