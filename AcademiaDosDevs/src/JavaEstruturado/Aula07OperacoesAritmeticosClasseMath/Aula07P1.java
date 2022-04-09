package JavaEstruturado.Aula07OperacoesAritmeticosClasseMath;

import javax.swing.JOptionPane;

public class Aula07P1 {
    public static void main(String[] args) {
        int numeroA = 5;
        int numeroB = 2;
        double divisao = (double) numeroA / numeroB;
            /*criando uma variavel que é a divisão das variaveis numeroA e numeroB,
            e colocando (double) para garantir que o java vai me retornar um valor double*/
        int contador = 0;

        JOptionPane.showMessageDialog(null, divisao, "divisão", JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, contador, "contador", JOptionPane.INFORMATION_MESSAGE);

        contador++; //mesma coisa que escrever: contador = contador + 1, obs tanbém é possivel fazer ++contador para fazer a conta antes
        JOptionPane.showMessageDialog(null, contador, "contador", JOptionPane.INFORMATION_MESSAGE);

        contador += 2; //mesma coisa que escrever: contador = contador + 2, obs o 2 poderia ser qualquer número
        JOptionPane.showMessageDialog(null, contador, "contador", JOptionPane.INFORMATION_MESSAGE);

        contador--; //mesma coisa que escrever: contador = contador - 1, obs tanbém é possivel fazer --contador para fazer a conta antes
        JOptionPane.showMessageDialog(null, contador, "contador", JOptionPane.INFORMATION_MESSAGE);

        contador -= 2; //mesma coisa que escrever: contador = contador - 2, obs o 2 poderia ser qualquer número
        JOptionPane.showMessageDialog(null, contador, "contador", JOptionPane.INFORMATION_MESSAGE);

    }
}

