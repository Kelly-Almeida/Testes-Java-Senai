import java.awt.desktop.SystemEventListener;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        Carro carrinho = null;
        Moto motinha = null;
        Caminhao caminhaozinho = null;
        Garagem garaginha = null;

        do {
            System.out.println("=== Sistema de veiculo ===");
            System.out.println("Digite...");
            System.out.println("1. Cadastrar");
            System.out.println("2. Exibir informações");
            System.out.println("0. Sair");
            int op = scan.nextInt();

            switch (op) {
                case 0:
                    System.out.println("Fechando sistema...");
                    continuar = false;
                    break;
                case 1:
                    int escol;
                    String nome, modelo;
                    do {
                        System.out.println("==== Cadastros ====");
                        System.out.println("Digite para cadastrar...");
                        System.out.println("1.Carro");
                        System.out.println("2.Moto");
                        System.out.println("3.Caminhão");
                        System.out.println("4.Garagem");
                        System.out.println("5.Adicionar veiculo a garagem");
                        System.out.println("0. Voltar");
                        escol = scan.nextInt();

                        switch (escol) {
                            case 0:
                                break;
                            case 1:
                                if (carrinho == null) {
                                    System.out.println("Digite o modelo do carro: ");
                                    modelo = scan.nextLine();
                                    System.out.println("Digite o apelido do carro: ");
                                    nome = scan.nextLine();
                                    carrinho = new Carro(modelo, nome);
                                } else {
                                    System.out.println("Você já tem um carro, caso queira mais uma desce o pix");
                                }
                                break;
                            case 2:
                                if (motinha == null) {
                                    System.out.println("Digite o modelo da moto: ");
                                    modelo = scan.nextLine();
                                    System.out.println("Digite o apelido do carro: ");
                                    nome = scan.nextLine();
                                    motinha = new Moto(modelo, nome);
                                } else {
                                    System.out.println("Você já tem um moto, caso queira mais uma deça o pix");
                                }
                                break;
                            case 3:
                                if (caminhaozinho == null) {
                                    System.out.println("Digite o modelo da moto: ");
                                    modelo = scan.nextLine();
                                    System.out.println("Digite o apelido do carro: ");
                                    nome = scan.nextLine();
                                    caminhaozinho = new Caminhao(modelo, nome);
                                } else {
                                    System.out.println("Você já tem um caminhão, caso queira mais uma manda o pix");
                                }
                                break;
                            case 4:
                                if (garaginha == null) {
                                    System.out.println("Digite o nome da garagem: ");
                                    nome = scan.nextLine();
                                    garaginha = new Garagem(nome);
                                } else {
                                    System.out.println("Você já tem um garagem, caso queira mais uma solta o pix");
                                }
                                break;
                            case 5:
                                if(garaginha != null){
                                    System.out.println("Escolha um veiculo para adicionar: ");
                                    System.out.println("Digite...");
                                    if(carrinho != null){
                                        System.out.println("1. " + carrinho.getModelo() + " - Vulgo: " + carrinho.getApelido());

                                    }
                                    if(motinha != null){
                                        System.out.println("2. " + motinha.getModelo() + " - Vulgo: " + motinha.getApelido());

                                    }
                                    if(caminhaozinho != null){
                                        System.out.println("3. " + caminhaozinho.getModelo() + " - Vulgo: " + caminhaozinho.getApelido());

                                    }

                                    int op1 = scan.nextInt();

                                    switch (op1){
                                        case 1:
                                            garaginha.addVeiculo(carrinho);
                                            System.out.println(carrinho.getApelido() + " adicionado com sucesso!");
                                            break;
                                        case 2:
                                            garaginha.addVeiculo(motinha);
                                            System.out.println(motinha.getApelido() + " adicionada com sucesso!");
                                            break;
                                        case 3:
                                            garaginha.addVeiculo(caminhaozinho);
                                            System.out.println(caminhaozinho.getApelido() + " adicionado com sucesso!");
                                            break;
                                        default:
                                            System.out.println("OH DEMÔNIO!! Digite um valor válido!!");
                                            break;
                                    }
                                }
                                break;
                            default:
                                System.out.println("Demônio, digite um número válido!!!");
                                break;
                        }
                    } while (escol != 0);
                    break;

                case 2:
                    int escol2;
                    do{
                        System.out.println("==== Exibição ====");
                        System.out.println("Digite para exibir informações...");
                        System.out.println("1.Carro");
                        System.out.println("2.Moto");
                        System.out.println("3.Caminhão");
                        System.out.println("4.Garagem");
                        System.out.println("0. Voltar");
                        escol2 = scan.nextInt();

                        switch (escol2){
                            case 0:
                                break;
                            case 1:
                                if (carrinho != null){

                                }else {
                                    System.out.println("Não nenhum carro!!");
                                }
                        }
                    }while (escol2 != 0);

                    break;
                default:

            }

        } while (continuar);
    }
}



