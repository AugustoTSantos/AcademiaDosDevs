package JavaEstruturado.Aula09ExpressoesBooleanas;

import java.util.Scanner;

public class Aula09 {
     /*
   > maior
   < menor
   >= maior ou igual
   <= menor ou igual
   == igual
   != diferente
   Operadores Lógicos:
   && and (e)
   || or (ou)
   ! no (não)
   */
    public static void main(String[] args) {
    String usuario = "Augusto";
    String senha = "123";

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o usuario: ");
            String loginU = sc.nextLine();

            System.out.print("Digite a senha: ");
            String loginS = sc.nextLine();

            boolean acesso = (usuario == loginU && senha == loginS);

            System.out.println(acesso);
        }
    } 
}
