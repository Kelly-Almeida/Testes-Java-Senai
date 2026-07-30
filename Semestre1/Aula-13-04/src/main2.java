import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Objects;


public class main2{
    void main (String[] args){
        String caminhoArquivo = "escrita.txt";

        try (BufferedReader leitor = new BufferedReader((new BufferedReader(new FileReader(caminhoArquivo))))){

            String linha;

            while((linha = leitor.readLine()) != null){ //imprime cada linha do arquivo
                System.out.println(linha);
            }
        } catch (IOException e){
            System.out.println("Erro ao ler arquivo " + e.getMessage());
        }
    }
}