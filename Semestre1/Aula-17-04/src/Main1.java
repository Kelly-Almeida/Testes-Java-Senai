import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;

public class Main1 {

    public static void main(String[] args){
        //Caminho dos arquivos
        String arquivosEntrada = "C:\\Users\\Aluno\\IdeaProjects\\Testes-Java-Senai\\Aula-17-04\\src\\vendas.csv";
        String arquivoSaida = "relatorio_final.txt";

        double totalGeral = 0.0;

        //Usando try-with-resources (fecha os arquivos sozinho)
        try(BufferedReader leitor = new BufferedReader(new FileReader(arquivosEntrada));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(arquivoSaida))){

            //Lendo a primeira linha e ignorando (pois é só o cabeçalho)
            String linha = leitor.readLine();

            escritor.write("================= RELATÓRIO DE VENDAS =================\n\n");
            System.out.println("Processamento de arquivo...\n");

            //Laço para ler as principais linhas até o fim do arquivo (null)
            while((linha = leitor.readLine()) != null){
                //Quebra a linha no ponto e vírgula
                String[] colunas = linha.split(";");
                //Regex: sequência de caracteres que define um padrão de busca de texto


                //Resgatando os dados pelo indice do Array
                String produto = colunas[0];
                int quantidade = Integer.parseInt(colunas[1]);
                double preco = Double.parseDouble(colunas[2]);
                //parse: conersão de tipos

                double totalProduto = quantidade * preco;
                totalGeral += totalProduto;

                //Mantando a linha que será escrita no txt
                String registro = String.format("Produto : %s | Qtd: %d | Total: R$ %.2f\n", produto, quantidade, totalProduto);

                //Escreva no arquivo e mostra no console
                escritor.write(registro);
                System.out.println(registro);

                //Fechamento do relatório
                String rodape = "\n ----------------------------------\n";
                rodape += String.format("TOTAL GERAL ARRECADADO: R$ %.2f\n", totalGeral);
                rodape += "=========================================\n";

                escritor.write(rodape);
                System.out.println(rodape);

                System.out.println("\nSucesso! Arquivo 'relatorio_final.txt' gerado com sucesso.");
            }

        }catch(IOException e){
            System.out.println("Erro ao tentar ler ou escrever arquivo: " + e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Erro nos dados! O CSV contem letras onde deveriam ter números: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro na estrutura! o CSV está faltando colunas em alguma linha.");
        }
    }
}
