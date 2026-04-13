import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class main1 {
    void main(String[] args) {
        String caminhoArquivo = "escrit a.txt"; //cria um novo arquivo (se não existir)

        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo))){
            //BufferedWriter: grava os dados em bloco
            //fileWriter: abre ou cria o arquivo
            escritor.write("Primeira linha do arquivo!");
            escritor.newLine();//pula para a próxima liha o arquivo
            escritor.write("VAI FLAMENGO");

        }catch (IOException e){
            //IOException mostra os erros do usuário
            System.out.println("Erro ao escrever no arquivo!!" + e.getMessage());
            //getMessagem: exiba mensagem de erro
        }
    }
}