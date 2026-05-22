import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PlataformaDigital {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("--- PLATAFORMA DIGITAL ---");
        System.out.println("\tBem-vindo!!");
        System.out.println("Para começar digite o nome do usuário: ");
        String nomeUsuario = scan.nextLine();
        System.out.println("Digite seu e-mail: ");
        String emailUsuario = scan.nextLine();

        Usuario autor = new Usuario(nomeUsuario, emailUsuario);
        System.out.println("\nUsuário '" + autor.getNomeDeUsuario() + "' criado com sucesso!");

        List<ConteudoDigital> feed = new ArrayList<>();

        int escol = 0;
        do{
            System.out.println("\n--- MENU DE CRIAÇÃO ---");
            System.out.println("O que você deseja criar agora? ");
            System.out.println("1 - Criar um novo vídeo");
            System.out.println("2 - Criar um novo Artigo");
            System.out.println("3 - Ver o feed e sair");
            System.out.println("Sua opção: ");

            try{
                escol = scan.nextInt();
                scan.nextLine();

                switch (escol){
                    case 1:
                        System.out.println("Digite o título do vídeo: ");
                        String titulo = scan.nextLine();
                        System.out.println("Digite a duração em segundos: ");
                        int duracao = scan.nextInt();

                        ConteudoDigital novoVideo = new Video(titulo, autor, duracao);
                        feed.add(novoVideo);
                        System.out.println("Vídeo adcionado ao feed com sucesso!");
                        break;
                    case 2:
                        System.out.println("Digite o título do artigo: ");
                        String tituloArtigo = scan.nextLine();
                        System.out.println("Digite o número de palavras: ");
                        int palavras = scan.nextInt();

                        ConteudoDigital novoArtigo = new Artigo(tituloArtigo, autor, palavras);
                        feed.add(novoArtigo);
                        System.out.println("Artigo adicionado ao feed com sucesso!");
                        break;
                    case 3:
                        System.out.println("\n=================================");
                        System.out.println("\t--- FEED FINAL DA PLATAFORMA ---");
                        System.out.println("\n=================================");

                        for(ConteudoDigital conteudo : feed){
                            conteudo.exibir();
                            System.out.println("  " + conteudo.getInformacaoAutor() + "\n");
                        }
                        scan.close();
                        System.out.println("Programa finalizado.");
                        break;

                    default:
                        System.out.println("Opção inválida, tente novamente!");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Erro: Por favor, digite um número válido para a opção. ");
                scan.next();
            }
        }while(escol != 3);
    }
}
