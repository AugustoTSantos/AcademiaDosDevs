package JavaPoo.Aula05PublicPrivate;

import JavaPoo.Aula05PublicPrivate.Festas.FestaVip;

public class Aula05 {
    public static void main(String[] args) {

        FestaVip festa = new FestaVip();
        festa.quantidadeRefri = 40; // é possivel acessar pois é publico
       // festa.quantidadeSalgadinho = 40; // não é possivel acessar pois é privado
        festa.entrar(); /*chamando o metodo publico entrar para usar os metodos privados
        comerSalgadinho e tomarRefri e nas variaveis quantidadeRefri e quantidadeSalgadinho*/
    }
}
