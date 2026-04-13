import java.awt.image.BufferStrategy;
import java.io.*;
import javax.swing.*;

public class main4 {
    static public void main(String[] args){
        String caminho = "exemplo.txt";
        String[] opcoes = {"Escrever", "Ler", "Sair"};
        int escolha;

        do{
            escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção",
                    "Menu de Arquivo",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            switch (escolha){
                case 0 -> escreverNoArquivo(caminho);
                case 1 -> lerArquivo(caminho);
                default -> JOptionPane.showMessageDialog(null, "Encerrando o programa");
            }

        }while (escolha == 0 || escolha == 1);
    }

    static public void escreverNoArquivo(String caminho){
        String texto = JOptionPane.showInputDialog("Digite o texto para salvar: ");

        if(texto != null && !texto.isBlank()){
            try(BufferedWriter escritor = new BufferedWriter(new FileWriter(caminho, true))){
                escritor.write(texto);
                escritor.newLine();
                JOptionPane.showMessageDialog(null, "Texto salvo com sucesso!");
            }catch (IOException e){
                JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());
            }
        }
    }

    static public void lerArquivo(String caminho){
        StringBuilder conteudo = new StringBuilder();

        try(BufferedReader leitor = new BufferedReader(new FileReader(caminho))){
            String linha;
            while((linha = leitor.readLine()) != null){
                conteudo.append(linha).append("\n");
            }
            JOptionPane.showMessageDialog(null, conteudo.length() > 0 ? conteudo.toString() : "Arquivo vazio");
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Erro " + e.getMessage());
        }
    }
}