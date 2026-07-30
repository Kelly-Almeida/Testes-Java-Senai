package src;

import MainScreen.CheckS;
import MainScreen.Header;
import MainScreen.SwitchOps;

import java.util.Scanner;

public class Main{
    static void main() {
        Scanner scan = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        Header t1 = new Header("E-commerce", 3);
        Header t2 = new Header("Produtos", 3);
        Header carrinhoT = new Header("Carrinho", 3);

        String []escolInit = new String[] {"Compra", "Ver compras", "Sair"};
        String [] prods = new String[] {"Produto digital", "Produto físico", "Voltar"};

        Boolean round = true;

        do{
            t1.Header();

            System.out.println("Digite para...");

            int escol1 = SwitchOps.escolhaArray(escolInit);

            String escol1S = escolInit[escol1];

            switch (escol1S){
                case "Compra":
                    t2.Header();
                    System.out.println("Digite para...");
                    int escol2 = SwitchOps.escolhaArray(prods);
                    String escol2S = prods[escol2];

                    String name;
                    float valor;
                    switch (escol2S){
                        case "Produto digital":
                            System.out.println("Digite o nome do produto:  ");
                            do{
                                name = scan.nextLine();
                            }while(name.isBlank());

                            System.out.println("Digite o valor do produto: ");
                            do{
                                valor = scan.nextFloat();
                            }while (valor <= 0);

                            System.out.println("Digite o canal de envio: ");
                            String canal;
                            do{
                                canal = scan.nextLine();
                            }while (canal.isBlank());

                            prodDigital prodDigital = new prodDigital(name, valor, canal);

                            carrinho.addItem(prodDigital);

                            break;
                        case "Produto físico":
                            System.out.println("Digite o nome do produto:  ");
                            do{
                                name = scan.nextLine();
                            }while(name.isBlank());

                            System.out.println("Digite o valor do produto: ");
                            do{
                                valor = scan.nextFloat();
                            }while (valor <= 0);

                            System.out.println("Digite o valor do frete: ");
                            float frete;
                            do{
                                frete = scan.nextFloat();
                            }while (frete <0);

                            prodFisico prodFisico = new prodFisico(name, valor, frete);

                            carrinho.addItem(prodFisico);
                            break;
                        case "Voltar":
                            break;
                    }
                    break;
                case "Ver compras":
                    carrinhoT.Header();
                    if (carrinho.carrinhoSize() == 0){
                        System.out.println("Carrinho Vazio!!");
                    }else{
                        carrinho.itensCarrinho();
                        System.out.println("-------------------");
                        System.out.printf("Valor total: R$ %.2f\n" , carrinho.valorCarrinho());
                    }
                    break;
                case "Sair":
                    round = false;
                    System.out.println("Tenha um bom dia!");
                    break;
            }


        }while (round);
    }
}