public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero++){
            if(numero == 3)
                continue; //break para o laço e continue para somente a interação

                System.out.println("Passei pelo número " + numero);
        }
    }
}
