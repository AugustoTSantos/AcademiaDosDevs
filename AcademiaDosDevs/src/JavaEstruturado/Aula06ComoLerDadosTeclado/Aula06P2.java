package JavaEstruturado.Aula06ComoLerDadosTeclado;

import javax.swing.JOptionPane;

public class Aula06P2 {
    public static void main(String[] args) {
        String filme = JOptionPane.showInputDialog(null, "Qual seu filme preferido?", "Filme", JOptionPane.QUESTION_MESSAGE);
        /* usando JOptionPane para criar uma interface para meu programa, e definindo dentro do showInputDialog o
        componente relacionado, a mensagem do app, o titulo do app, e qual tipo de mensagem é o app está fazendo */

        String numero = JOptionPane.showInputDialog(null, "Digite um número", "número", JOptionPane.DEFAULT_OPTION);
        Integer.parseInt(numero); //convertando o input do usuario no app de String para int

        System.out.println("Seu filme favorito é " + filme); // pegando oq o usuario digitou no app e escrevendo no conselo com uma string
        System.out.println("O número digitado * 50 é igual a " + Integer.parseInt(numero) * 50);
    }
}