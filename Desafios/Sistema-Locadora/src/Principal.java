import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String [] ops = new String[] {"Cadastrar", "Ver filmes cadastrados", "Sair"};
        boolean round = true;

        int opcao;
        do{
            System.out.println("===================================");
            System.out.println("\tSistema de Locadora");
            System.out.println("===================================");
            System.out.println("Digite...");
            System.out.println("1 - Cadastrar locadora");
            System.out.println("2 - sair");
            opcao = scan.nextInt();

        }while(opcao < 0 || opcao > 2);

        scan.nextLine();

        String nome;
        do{
            System.out.print("Digite o nome da locadora: ");
            nome = scan.nextLine();

        }while(nome == null);

        Locadora locadora = new Locadora(nome);

        if (opcao == 1){

            do{


                int escol;
                do{
                    System.out.println("===================================");
                    System.out.println("\tLocadora " + locadora.getNome());
                    System.out.println("===================================");
                    System.out.println("Digite...");
                    for(int i = 1; i <= ops.length; i++){
                        System.out.println(i + " - " + ops[i -1]);
                    }
                    escol = scan.nextInt();

                    if (escol < 0 || escol > ops.length){
                        System.out.println("Insira um valor válido!");
                    }
                }while(escol < 0 || escol > ops.length);

                String resp = ops[escol - 1];

                scan.nextLine();

                switch (resp){
                    case "Cadastrar":
                        System.out.println("===========================");
                        System.out.println("\tCadatrar Filme");
                        System.out.println("===========================");
                        System.out.println("Digite o título:");
                        String titulo = scan.nextLine();
                        System.out.println("Insira o gênero: ");
                        String genero = scan.nextLine();
                        System.out.println("Digite o ano de lançamento");
                        int ano = scan.nextInt();
                        System.out.println("Digite o tempo de duração em minutos: ");
                        int temp = scan.nextInt();

                        scan.nextLine();

                        Filme filme = new Filme(titulo, genero, ano, temp);
                        locadora.addFilme(filme);
                        break;

                    case "Ver filmes cadastrados":
                        locadora.getFilmes();
                        break;
                    case "Sair":
                        round = false;
                        break;
                }


            }while(round);

        }

        System.out.println("Tenha um bom dia!!");

    }
}
