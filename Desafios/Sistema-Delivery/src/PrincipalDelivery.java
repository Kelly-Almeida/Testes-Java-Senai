import java.util.Scanner;
import java.util.StringTokenizer;

public class PrincipalDelivery {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int op, idPedido = 0;
        Pedido ped = new Pedido(idPedido);
        String bancoCaipirinhas[] = new String[]{"Morango", "Limão", "Maracujá"};
        String bancoPizzas[] = new String[]{"Marguerita", "Calabresa", "Portuguesa", "Personalizada"};
        char[] bancoTamanhos = new char[] {'P', 'M', 'G'};

        do{
            System.out.println("========== Sistema Delivery  =========");
            System.out.println("Digite...");
            System.out.println("1 - Fazer pedido");
            System.out.println("0 - Sair");
            op = scan.nextInt();

            scan.nextLine();

            switch (op){
                case 0:
                    int resp;
                    System.out.println("Tem certeza que quer sair?");
                    System.out.println("1 - Sim\n2 - Não");
                    resp = scan.nextInt();
                    if (resp == 1){
                        System.out.println("Tenha um ótimo dia!!");
                    }
                    break;
                case 1:
                    int resp1;
                    do{
                        System.out.println("========== Sistema Delivery  =========");
                        System.out.println("Cardápio: ");
                        System.out.println("1 - Pizza");
                        System.out.println("2 - Caipirinha");
                        System.out.println("3 - Cerveja");
                        System.out.println("4 - Uísque");
                        System.out.println("5 - Amendoim");
                        System.out.println("9 - Finalizar pedido");
                        System.out.println("0 - Sair");
                        resp1 = scan.nextInt();

                        scan.nextLine();

                        Produto prod = null;
                        switch (resp1){
                            case 1:
                                int j1 = 1;
                                System.out.println("Escolha um sabor: ");
                                for (String sabor : bancoPizzas){
                                    System.out.printf(j1 +" " + sabor);
                                }
                                String saborEscol = scan.nextLine();

                                System.out.println("Digite um dos números abaixo para selecionar o sabor da pizza: ");
                                for(char tamanho: bancoTamanhos){
                                    System.out.println(j1 + " " + tamanho);
                                }
                                char tamanhoEscol = scan.next().charAt(0);

                                prod = new Pizza(saborEscol, tamanhoEscol);

                                ped.addItem(prod);
                                System.out.println("Pizza adicionada!!");

                                break;
                            case 2:
                                int j2 = 1;
                                System.out.println("Escolha um sabor: ");
                                for (String sabor : bancoCaipirinhas){
                                    System.out.printf(j2 +" " + sabor);
                                }

                                String saborEscol2 = scan.nextLine();
                                prod = new Caipirinha(saborEscol2);
                                ped.addItem(prod);
                                System.out.println("Caipirinha adicionada!!");
                                break;

                            case 3:
                                System.out.println("Cerveja adicionada!!");
                                prod = new Produto("Cerveja", 15);
                                ped.addItem(prod);
                                break;
                            case 4:
                                System.out.println("Uísque adicionada!!");
                                prod = new Produto("Uísque", 125);
                                ped.addItem(prod);
                                break;

                            case 5:
                                System.out.println("Amendoim adicionada!!");
                                prod = new Produto("Amendoim", 5);
                                ped.addItem(prod);
                                break;

                            case 9:
                                int resp9;
                                do{
                                    System.out.println("=== Pedido "+ ped.getIdPedido() +"===");
                                    System.out.println("Produtos: ");
                                    ped.getItens();
                                    System.out.println("Total: " + ped.total());
                                    System.out.println("\nDeseja finalizar o pedido?\n1- Sim\n2 - Não");
                                    resp9 = scan.nextInt();

                                    if(resp9 == 1){
                                        System.out.println("Pedido finalizado!!");
                                        op = 0;
                                    }else if (resp9 != 2){
                                        System.out.println("Digite um valor válido!!");
                                    }
                                }while(resp9 != 1 && resp9 != 2);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção inválida no cardápio!!");
                                break;
                        }

                    }while(resp1 != 0 && resp1 != 9);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }while(op != 0);
        scan.close();
    }
}
