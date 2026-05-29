
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
            System.out.println("\n=== Sistema de veiculo ===");
            System.out.println("Digite...");
            System.out.println("1. Cadastrar");
            System.out.println("2. Exibir informações");
            System.out.println("0. Sair");
            int op = scan.nextInt();
            scan.nextLine();

            switch (op) {
                case 0:
                    System.out.println("Fechando sistema...");
                    continuar = false;
                    break;
                case 1:
                    int escol;
                    String nome, modelo;
                    do {
                        System.out.println("\n==== Cadastros ====");
                        System.out.println("Digite para cadastrar...");
                        System.out.println("1. Carro");
                        System.out.println("2. Moto");
                        System.out.println("3. Caminhão");
                        System.out.println("4. Garagem");
                        System.out.println("5. Adicionar veiculo a garagem");
                        System.out.println("0. Voltar");
                        escol = scan.nextInt();
                        scan.nextLine(); // LIMPA O BUFFER AQUI, logo após ler o número da escolha!

                        switch (escol) {
                            case 0:
                                break;
                            case 1:
                                if (carrinho == null) {
                                    System.out.print("Digite o modelo do carro: ");
                                    modelo = scan.nextLine();
                                    System.out.print("Digite o apelido do carro: ");
                                    nome = scan.nextLine();
                                    carrinho = new Carro(modelo, nome);
                                } else {
                                    System.out.println("Você já tem um carro, caso queira mais um manda o pix!");
                                }
                                break;
                            case 2:
                                if (motinha == null) {
                                    System.out.print("Digite o modelo da moto: ");
                                    modelo = scan.nextLine();
                                    System.out.print("Digite o apelido da moto: "); // Corrigido o texto
                                    nome = scan.nextLine();
                                    motinha = new Moto(modelo, nome);
                                } else {
                                    System.out.println("Você já tem uma moto, caso queira mais uma manda o pix!");
                                }
                                break;
                            case 3:
                                if (caminhaozinho == null) {
                                    System.out.print("Digite o modelo do caminhão: "); // Corrigido o texto
                                    modelo = scan.nextLine();
                                    System.out.print("Digite o apelido do caminhão: "); // Corrigido o texto
                                    nome = scan.nextLine();
                                    caminhaozinho = new Caminhao(modelo, nome);
                                } else {
                                    System.out.println("Você já tem um caminhão, caso queira mais um manda o pix!");
                                }
                                break;
                            case 4:
                                if (garaginha == null) {
                                    System.out.print("Digite o nome da garagem: ");
                                    nome = scan.nextLine();
                                    garaginha = new Garagem(nome);
                                } else {
                                    System.out.println("Você já tem uma garagem, caso queira mais uma solta o pix!");
                                }
                                break;
                            case 5:
                                if (garaginha != null) {
                                    System.out.println("=== Escolha um veiculo para adicionar ===");
                                    if (carrinho != null) System.out.println("1. " + carrinho.getModelo() + " - Vulgo: " + carrinho.getApelido());
                                    if (motinha != null) System.out.println("2. " + motinha.getModelo() + " - Vulgo: " + motinha.getApelido());
                                    if (caminhaozinho != null) System.out.println("3. " + caminhaozinho.getModelo() + " - Vulgo: " + caminhaozinho.getApelido());

                                    int op1 = scan.nextInt();
                                    scan.nextLine(); // Limpa o buffer

                                    switch (op1) {
                                        case 1:
                                            if (carrinho != null) {
                                                garaginha.addVeiculo(carrinho);
                                                System.out.println(carrinho.getApelido() + " adicionado com sucesso!");
                                            } else { System.out.println("Carro não cadastrado!"); }
                                            break;
                                        case 2:
                                            if (motinha != null) {
                                                garaginha.addVeiculo(motinha);
                                                System.out.println(motinha.getApelido() + " adicionada com sucesso!");
                                            } else { System.out.println("Moto não cadastrada!"); }
                                            break;
                                        case 3:
                                            if (caminhaozinho != null) {
                                                garaginha.addVeiculo(caminhaozinho);
                                                System.out.println(caminhaozinho.getApelido() + " adicionado com sucesso!");
                                            } else { System.out.println("Caminhão não cadastrado!"); }
                                            break;
                                        default:
                                            System.out.println("Digite um valor válido!!");
                                            break;
                                    }
                                } else {
                                    System.out.println("Cadastre uma garagem primeiro!");
                                }
                                break;
                            default:
                                System.out.println("Digite um número válido!!!");
                                break;
                        }
                    } while (escol != 0);
                    break;

                case 2:
                    int escol2;
                    do {
                        System.out.println("\n==== Exibição ====");
                        System.out.println("Digite para exibir informações...");
                        System.out.println("1. Carro");
                        System.out.println("2. Moto");
                        System.out.println("3. Caminhão");
                        System.out.println("4. Garagem");
                        System.out.println("0. Voltar");
                        escol2 = scan.nextInt();
                        scan.nextLine();

                        switch (escol2) {
                            case 0:
                                break;
                            case 1:
                                if (carrinho != null) {
                                    System.out.println("Carro: " + carrinho.getModelo() + " | Apelido: " + carrinho.getApelido());
                                } else {
                                    System.out.println("Não há nenhum carro cadastrado!!");
                                }
                                break;
                            case 2:
                                if (motinha != null) {
                                    System.out.println("Moto: " + motinha.getModelo() + " | Apelido: " + motinha.getApelido());
                                } else {
                                    System.out.println("Não há nenhuma moto cadastrada!!");
                                }
                                break;
                            case 3:
                                if (caminhaozinho != null) {
                                    System.out.println("Caminhão: " + caminhaozinho.getModelo() + " | Apelido: " + caminhaozinho.getApelido());
                                } else {
                                    System.out.println("Não há nenhum caminhão cadastrado!!");
                                }
                                break;
                            case 4:
                                if (garaginha != null) {
                                    System.out.println("Garagem: " + garaginha.getNome());

                                } else {
                                    System.out.println("Não há nenhuma garagem cadastrada!!");
                                }
                                break;
                        }
                    } while (escol2 != 0);
                    break;
                default:
                    System.out.println("Opção inválida no menu principal.");
            }
        } while (continuar);

        scan.close();
    }
}
