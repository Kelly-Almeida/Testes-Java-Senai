import java.io.*;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args){
        String caminhoarquivo = "outro.txt";
        Scanner scan = new Scanner(System.in);
        int op;

        do{
            System.out.println("\n------ MENU ------");
            System.out.println("1 - Escrever arquivo");
            System.out.println("2 - ler arquivo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            op = scan.nextInt();

            scan.nextLine();

            switch (op){
                case 1:
                    System.out.println("Digite o texto para adicionar ao arquivo ");
                    String texto = scan.nextLine();
                    escreverNoArquivo(caminhoarquivo, texto);
                    break;
                case 2:
                    lerArquivo(caminhoarquivo);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
                    break;
            }
        }while(op != 0);



    }

    public static void escreverNoArquivo(String caminho, String texto){
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho, true))){
         escritor.write(texto);
         escritor.newLine();
         System.out.println("Texto gravado com sucesso!!");

        }catch(IOException e){
            System.out.println("Erro ao escrever " + e.getMessage());
        }
    }

    public static void lerArquivo (String caminho){
        try(BufferedReader leitor = new BufferedReader(new FileReader(caminho))){
            String linha;
            System.out.println("\n --- Conteúdo do arquivo ---");

            while((linha = leitor.readLine()) != null){
                System.out.println(linha);
            }
            System.out.println("----------------------");
        }catch (IOException e){
            System.out.println("Erro na leitura " + e.getMessage());
        }
    }
}