import java.util.Scanner;
public class CaixaEletronico {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /* -- DADOS DE BANCO -- */
        // Agora criando instâncias das classes especificas
        Cliente cliente1 = new Cliente("Clark Kent", "111.222.333-44");
        Conta conta1 = new ContaCorrente(cliente1);
        conta1.depositar(1500.0);

        Cliente cliente2 = new Cliente("Bruce Wayne", "888.999.333-44");
        Conta conta2 = new ContaPoupanca(cliente2);
        conta2.depositar(100000.0);

        //Colocamos as contas em um array do tio da superclasse (Conta)
        //Isso é polimorfismo: o array pode qualquer objeto que seja uma conta
        Conta[] contasDoBanco = {conta1, conta2};
        Conta contaAtiva = contasDoBanco[0];

        int opcao = 0;
        while (opcao != 0) {
            System.out.println("\n-- Caixa Eletônico ZZ Baink --");
            System.out.println("Bem-vindo(a), " + contaAtiva.getNomeTitular() + " | Conta: " + contaAtiva.getClass().getSimpleName());
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Trocar de conta (Login)");

            if(contaAtiva instanceof ContaCorrente){
                System.out.println("6 - CobrarTaxa de Manutenção");
            }

            if(contaAtiva instanceof ContaPoupanca){
                System.out.println("7 - Fazwer Render Juros");
            }

            System.out.println("8 - Sair ");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scan.nextInt();
                switch (opcao) {
                    case 1:
                        contaAtiva.exibirDados();
                        break;
                    case 2:
                        System.out.print("Digite o valor para depositar: ");
                        contaAtiva.depositar(scan.nextDouble());
                        break;
                    case 3:
                        System.out.println("Digite o valor para sacar: ");
                        contaaAtiva.sacar(scan.nextDouble());
                        break;
                    case 4:
                        System.out.println("Digite o número da conta destino: ");
                        int numContaDestino = scan.nextInt();
                        Conta contaDestino = null;

                        for (Conta c : contasDoBanco) if (c.getNumero() == numContaDestino) contaDestino = c;

                        if (contaDestino != null && contaDestino != contaAtiva) {
                            System.out.print("Digite o valor para transferir: ");
                            contaAtiva.transferir(contaDestino, scan.nextDouble());
                        } else {
                            System.out.println("Conta destino inválida ou igual à origem");
                        }
                        break;
                    case 5:
                        System.out.println("\n--- CONTAS DISPONÍVEIS ---");
                        for (Conta c : contasDoBanco) {
                            System.out.println("N" + c.getNumero() + " - " + c.getClass().getSimpleName() + " - " + c.getNomeTitular());
                        }
                        System.out.println("Digite o número da conta desejada: ");
                        int numContaLogin = scan.nextInt();
                        boolean encontrada = false;

                        for (Conta c : contasDoBanco) {
                            if (c.getNumero() == numContaLogin) {
                                contaAtiva = c;
                                encontrada = true;
                                break;
                            }
                        }
                        if (encontrada) System.out.println("Login efetuao com sucesso!");
                        else System.out.println("Conta não encontrada...");
                        break;
                    case 6:
                        if (contaAtiva instanceof ContaCorrente) {
                            // É preciso fazer um "cast" para acessar o metodo específico
                            //Dizemos ao compilador: "Trate este com uma ContaCorrente"
                            ((ContaCorrente) contaAtiva).cobrarTaxa();
                        } else {
                            System.out.println("Opção válida apenas Conta Correntes.");
                        }
                        break;
                    case 7:
                        if(contaAtiva instanceof  ContaPoupanca){
                            c
                        }
                }
                int opcao = 0;

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}