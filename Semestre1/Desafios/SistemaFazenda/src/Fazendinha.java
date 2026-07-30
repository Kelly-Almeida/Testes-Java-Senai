import java.util.Scanner;


public class Fazendinha {
    public static void main(String[] argsS){
        Scanner scan = new Scanner(System.in);
        int cao = 0, gato = 0, vaca = 0, burro = 0;
        boolean continuar = true;
        Cachorro caozinho = null;
        Gato gatinho = null;
        Vaca vaca1 = null;
        Burrinho burrinho = null;

        do{
            System.out.println("======== Fazendinha ========");
            System.out.println("Vamos intergir com  nosso animais...");
            System.out.println("Digite:");
            System.out.println("1 - Cachorro");
            System.out.println("2 - Gato");
            System.out.println("3 - Vaca");
            System.out.println("4 - Burrinho");
            System.out.println("0 - Terminar de cadastrar");
            int op = scan.nextInt();
            scan.nextLine();

            String nome;
            switch (op) {
                case 0:
                    System.out.println("Encerrando programa...");
                    continuar = false;
                    break;
                case 1:

                    if (cao == 0) {
                        System.out.println("Você não tem um cãozino :( ");
                        System.out.println("Digite o nome do nosso cachorrinho: ");
                        nome = scan.nextLine();
                        caozinho = new Cachorro(nome);
                        cao++;
                    } else {
                        System.out.println("Vamos ver o que " + caozinho.setNome() + " está fazendo: ");
                        System.out.println("1 - Ver agora");
                        System.out.println("2 - Ver mais tarde");
                        int escol = scan.nextInt();

                        switch (escol){
                            case 1:
                                caozinho.som();
                                break;
                            case 2:
                                caozinho.mostrarNipe();
                                break;
                            default:
                                System.out.println("Ok vamos deixa-lo em paz");
                                break;
                        }
                    }

                    break;
                case 2:

                    if (gato == 0) {
                        System.out.println("Você não tem um gatinho :( ");
                        System.out.println("Digite o nome do nosso cachorrinho: ");
                        nome = scan.nextLine();
                        gatinho = new Gato(nome);
                        gato++;
                    } else {
                        System.out.println("Vamos ver o que " + gatinho.setNome() + " está fazendo: ");
                        System.out.println("1 - Ver agora");
                        System.out.println("2 - Ver mais tarde");
                        int escol = scan.nextInt();

                        switch (escol){
                            case 1:
                                gatinho.som();
                                break;
                            case 2:
                                gatinho.mostrarNipe();
                                break;
                            default:
                                System.out.println("Ok vamos deixa-lo em paz");
                                break;
                        }
                    }
                    break;
                case 3:

                    if (vaca == 0) {
                        System.out.println("Você não tem um vaquinha :( ");
                        System.out.println("Digite o nome do nosso cachorrinho: ");
                        nome = scan.nextLine();
                        vaca1 = new Vaca(nome);
                        cao++;
                    } else {
                        System.out.println("Vamos ver o que " + vaca1.setNome() + " está fazendo: ");
                        System.out.println("1 - Ver agora");
                        System.out.println("2 - Ver mais tarde");
                        int escol = scan.nextInt();

                        switch (escol){
                            case 1:
                                vaca1.som();
                                break;
                            case 2:
                                vaca1.mostrarNipe();
                                break;
                            default:
                                System.out.println("Ok vamos deixa-lo em paz");
                                break;
                        }
                    }
                    break;
                case 4:

                    if (burro == 0) {
                        System.out.println("Você não tem um burrinho :( ");
                        System.out.println("Digite o nome do nosso cachorrinho: ");
                        nome = scan.nextLine();
                        burrinho = new Burrinho(nome);
                        burro++;
                    } else {
                        System.out.println("Vamos ver o que " + burrinho.setNome() + " está fazendo: ");
                        System.out.println("1 - Ver agora");
                        System.out.println("2 - Ver mais tarde");
                        int escol = scan.nextInt();

                        switch (escol){
                            case 1:
                                burrinho.som();
                                break;
                            case 2:
                                burrinho.mostrarNipe();
                                break;
                            default:
                                System.out.println("Ok vamos deixa-lo em paz");
                                break;
                        }
                    }
                    break;
                default:
                    System.out.println("Oh demônio, tá cedo ou tá com o teclado da Xuxa? Digite novamente");
                    break;
            }
        }while(continuar);

    }
}
