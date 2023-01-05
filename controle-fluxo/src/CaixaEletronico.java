public class CaixaEletronico {
    public static void main(String[] args) {
        //estrutura condicional simples
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println("Saldo atual: " + saldo);
    }
}