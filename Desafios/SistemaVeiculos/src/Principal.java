import java.util.Scanner;


public class Principal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        Carro carrinho = null;

        do{
            System.out.println("=== Sistema de veiculo ===");
            System.out.println("Digite...");
            System.out.println("1. Cadastrar");
            System.out.println("2. Exibir informações");
            System.out.println("0. Sair");
            int op = scan.nextInt();

            switch (op){
                case 0:
                    System.out.println("Fechando sistema...");
                    continuar = false;
                    break;
                case 1:
                    int escol;
                    String nome, modelo;
                    do{
                        System.out.println("==== Cadastros ====");
                        System.out.println("Digite para cadastrar...");
                        System.out.println("1.Carro");
                        System.out.println("2.Moto");
                        System.out.println("3.Caminhão");
                        System.out.println("4.Garagem");
                        System.out.println("0. Voltar");
                        escol = scan.nextInt();

                        switch (escol){
                            case 0:
                                break;
                            case 1:
                                if (carrinho == null){
                                    System.out.println("Digite o modelo: ");
                                    modelo = scan.nextLine();
                                    System.out.println("Digite o apelido do carro: ");
                                    nome = scan.nextLine();
                                    carrinho = new Carro(modelo, nome);
                                }else{
                                    System.out.println("Você já tem um carro, quer mais seja rico");
                                }



                        }
                    }while (escol != 0);
                    break;
                case 2:

                    break;
                default:

            }

        }while(continuar);
    }



