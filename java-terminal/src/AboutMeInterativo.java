import java.util.Locale;
import java.util.Scanner;

public class AboutMeInterativo {
    public static void main(String[] args) {
        try (//criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            //entrada de dados pelo teclado
            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura:");
            double altura = scanner.nextDouble();


            //imprimindo os dados obtidos pelo usuário
            System.out.println("=====================================");
            System.out.println("Olá, me chamo " + nome + " " + sobrenome + ".");
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("Minha altura é " + altura + "m.");
        }
        
        System.out.println("=====================================");
    }
}
