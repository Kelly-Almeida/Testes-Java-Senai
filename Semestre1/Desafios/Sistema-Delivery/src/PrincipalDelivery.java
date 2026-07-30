import java.util.Scanner;
import java.util.StringTokenizer;

public class PrincipalDelivery {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int op, idPedido = 0;
        Pedido ped = new Pedido(idPedido);
        String bancoCaipirinhas[] = new String[]{"Morango", "Limão", "Maracujá"};
        String bancoPizzas[] = new String[]{"Marguerita", "Calabresa", "Portuguesa", "Personalizada"};
        String bancoCervejas[] = new String[]{"Brahma", "Itaipava", "Skol", "Heineken", "Outras"};
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
                        System.out.println("9 - Finalizar pedido");
                        System.out.println("0 - Sair");
                        resp1 = scan.nextInt();

                        scan.nextLine();

                        Produto prod = null;
                        switch (resp1){
                            case 1:
                                int j1 = 1, escol1;
                                String saborEscol = "";

                                do{
                                    System.out.println("Escolha um sabor: ");
                                    for (String sabor : bancoPizzas){
                                        System.out.println(j1 +" - " + sabor);
                                        j1++;
                                    }
                                    System.out.print("Digite um número: ");
                                    escol1 = scan.nextInt();

                                    if (escol1 < 0 || escol1 > bancoPizzas.length) {
                                        System.out.println("Escolha um opção válida!!");
                                        j1 = 1;
                                    }
                                    else saborEscol = bancoPizzas[escol1 - 1];

                                }while(bancoPizzas.length < escol1 || escol1 < 1);

                                j1 = 1;
                                escol1 = 0;
                                char tamanhoEscol = ' ';

                                do{
                                    System.out.println("Digite um dos números abaixo para selecionar o sabor da pizza: ");
                                    for(char tamanho: bancoTamanhos){
                                        System.out.println(j1 + " - " + tamanho);
                                        j1++;
                                    }
                                    escol1 = scan.nextInt();

                                    if(escol1 < 1 || escol1 > bancoTamanhos.length){
                                        System.out.println("Escolha uma opção válida!!");
                                        j1 = 1;
                                    }
                                    else tamanhoEscol = bancoTamanhos[escol1 - 1];

                                }while(bancoTamanhos.length < escol1 || escol1 < 1);


                                prod = new Pizza(saborEscol, tamanhoEscol);


                                ped.addItem(prod);
                                System.out.println("Pizza adicionada!!");

                                break;
                            case 2:
                                int j2 = 1, escol2;
                                String saborEscol2 = " ";

                                do{
                                    System.out.println("Escolha um sabor: ");
                                    for (String sabor : bancoCaipirinhas){
                                        System.out.println(j2 +" - " + sabor);
                                        j2++;
                                    }
                                    escol2 = scan.nextInt();

                                    if (escol2 < 1 || escol2 > bancoCaipirinhas.length){
                                        System.out.println("Digite um valor válido!!");
                                        j2 = 1;
                                    }
                                    else saborEscol2 = bancoCaipirinhas[escol2];
                                }while(escol2 < 1 || escol2 > bancoCaipirinhas.length);

                                prod = new Caipirinha(saborEscol2);
                                ped.addItem(prod);
                                System.out.println("Caipirinha adicionada!!");
                                break;

                            case 3:
                                int j3 = 1, escol3;
                                String marca = "";

                                do{
                                    System.out.println("Escolha a marca: ");
                                    for (String sabor : bancoCervejas){
                                        System.out.println(j3 +" - " + sabor);
                                        j3++;
                                    }
                                    escol3 = scan.nextInt();

                                    if (escol3 < 1 || escol3 > bancoCervejas.length) {
                                        System.out.println("Digite um valor válido!!");
                                        j3 = 1;
                                    } else marca = bancoCervejas[escol3 - 1];
                                }while(escol3 < 1 || escol3 > bancoCervejas.length);

                                prod = new Cerveja(marca);
                                ped.addItem(prod);
                                break;
                            case 4:
                                int j4 = 1, escol4;
                                char tam = ' ';

                                do{
                                    System.out.println("Escolha o tamanho: ");
                                    for (char t : bancoTamanhos){
                                        System.out.println(j4 + " - " + t);
                                        j4++;
                                    }
                                    escol4 = scan.nextInt();

                                    if (escol4 < 1 || escol4 > bancoTamanhos.length) {
                                        System.out.println("Digite um valor válido!!");
                                        j4 = 1;
                                    }
                                    else tam = bancoTamanhos[escol4 - 1];

                                }while(escol4 < 1 || escol4 > bancoTamanhos.length);
                                prod = new Uisque(tam);
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
