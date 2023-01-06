/*
 * Estrutura do try e catch
 * 
 * try {
 *      bloco de código conforme esperado
 * }
 * catch(Exception e) {
 *      precisamos saber qual exceção
 *      bloco de código que captura as exceções que podem acontecer
 *      em casa de um fluxo não previsto
 * }
 */
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            
            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuário
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ", tenho " + idade + " anos e minha altura é " + altura + " m.");
            scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos!");
        }
    }
}
