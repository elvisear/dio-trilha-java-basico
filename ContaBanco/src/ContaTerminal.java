import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            //entrada de dados
            System.out.println("Por favor, digite seu nome!");
            String nomeCliente = scanner.next();

            System.out.println("Por favor, digite o sobrenome!");
            String sobrenomeCliente = scanner.next();

            System.out.println("Por favor, digite o número da Agência!");
            String agencia = scanner.next();
            
            System.out.println("Por favor, digite o número da conta bancária!");
            int numeroConta = scanner.nextInt();

            System.out.println("Por favor, digite o saldo atual dessa conta bancária");
            double saldo = scanner.nextDouble();

            //saída de dados
            System.out.printf("Olá %s %s, obrigado por criar uma conta em nosso banco, sua agência é %s, o número da sua conta bancária é %d e seu saldo R$ %.2f já está disponível para saque.", nomeCliente, sobrenomeCliente, agencia, numeroConta, saldo);
        }
    }
}