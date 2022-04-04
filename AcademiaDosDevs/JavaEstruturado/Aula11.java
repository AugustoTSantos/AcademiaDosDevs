package JavaEstruturado;

public class Aula11 {
    public static void main(String[] args) {
        boolean estaChovendo = true;
        boolean temGuardaChuva = false;
    
        if(estaChovendo == true && temGuardaChuva == true) {
            System.out.println("então não vai se molhar");
       } else if (estaChovendo == false || temGuardaChuva == true) {
           System.out.println("então você não vai se molhar");
       } else {
           System.out.println("então vai se molhar");
       }
    }
}
