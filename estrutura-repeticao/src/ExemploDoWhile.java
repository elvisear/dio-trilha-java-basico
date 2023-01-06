import java.util.Random;

public class ExemploDoWhile {
    /*
     * estrutura do controle de fluxo do while
     * 
     * do
     * {
     *  comando que será executado até que a 
     *  expressão de validação torne-se fala.
     * }
     * while (expressão booleana de validação);
     */
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            //executando repetidas vezes até alguém atender
            System.out.println("Telefone tocando");
        } while (tocando());

        System.out.println("Alô !!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de contiuar tocando
        return ! atendeu;
    }
}
