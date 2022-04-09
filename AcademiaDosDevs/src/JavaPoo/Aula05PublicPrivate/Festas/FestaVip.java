package JavaPoo.Aula05PublicPrivate.Festas;

/*
    Variaveis e metodos privados só podem ser usados e alterados dentro do pacote em que estão.
    Enquato publicos podem ser usados e alterar dentro de qualquer pacote.
    */

public class FestaVip {

    public int quantidadeRefri = 30;
    private int quantidadeSalgadinho = 50;
    
    private void tomarRefri() {
        if(quantidadeRefri == 0) {
        System.out.println("O refri acabou");
        } else {
            System.out.println("Tomou uma xicara de café");
            quantidadeRefri--;
        }
    }
    
    private void comerSalgadinho() {
        if(quantidadeSalgadinho == 0) {
            System.out.println("O salgadinho acabou");
            } else {
            System.out.println("Comeu 5 salgadinhos");
            quantidadeSalgadinho--;
        }
    }
    
    public void entrar() { // criado um metodo publico para poder acessar metodos privados em outros pacotes
        tomarRefri();
        comerSalgadinho();        
    }
}
    