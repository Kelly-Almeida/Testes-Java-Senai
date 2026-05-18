import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class LojaOnline {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Pedido meuPedido = new Pedido(101, 250.75);
        System.out.println("--- Bem-vindo à Voja Xpis ---");
        System.out.println("Seu pedido de R$" + meuPedido.getValotTotal() + " está pronto para pagamento.");
        System.out.println("\nEscolha a forma de pagamrnto:\n1 - Cartão\n2 - PIX\n3 - Boleto\n=> ");
        int escolha = scan.nextInt();

        ProcessadorPrograma processador = null;

        if (escolha == 1){
            System.out.println("Escolha o tipo do cartão: \n1 - Cartão\n2 - Débito\n=> ");
            int tipoCartao = scan.nextInt();

            if(tipoCartao == 1){
                processador = new PagamentoCartao(tipoCartao.CREDITO);
            }else{
                processador = new PagamentoCartao(tipoCartao.DEBITO);
            }
        }else if (escolha == 2){
            processador = new PagamentoPix();
        }else if (escolha == 3){
            processador = new PagamentoBoleto();
        }

        if(processador != null){
            System.out.println("\nIniciando processo de pagamento...");

            String transacaoId = processador.iniciarPagamento(meuPedido);

            System.out.println("\n--- Varificando Status da Transação ---");

            while (meuPedido.getStatus() == StatusPagamento.PENDENTE){
                System.out.println("Aguarde, consultando status...");
            }
        }
    }

}
