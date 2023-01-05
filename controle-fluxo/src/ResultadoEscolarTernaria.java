public class ResultadoEscolarTernaria {
    //Condição ternária - abrevia o algorítimo condicional
    public static void main(String[] args) {
        int nota = 5;
        //expressão ternária simples
        String resultado = nota >= 7 ? "Aprovado!" : "Reprovado!"; 

        System.out.println("----ternária simples----");
        System.out.println(resultado);
        System.out.println("------------------------");

        //expressão ternária encadeada
        String resultadoE = nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "Recuperação!" : "Reprovado!"; 

        System.out.println("----ternária encadeada----");
        System.out.println(resultadoE);
        System.out.println("--------------------------");
    }
}