import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Main2 extends JFrame {
    private JTextField txtFilme, txtGenero, txtValor;
    private JRadioButton rbTxt, rbCsv;
    private JTextArea areaExibicao;

    public  Main2() {
        //Configuração básico de Janela
        setTitle("Mini Locadora - Cdastro de Filme");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        //Painel superior: Formulário de preenchimento
        JPanel painelFormulario = new JPanel(new GridLayout(4, 2, 5, 5));
        painelFormulario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        painelFormulario.add(new JLabel("Nome do Filme"));
        txtFilme = new JTextField();
        painelFormulario.add(txtFilme);

        painelFormulario.add(new JLabel("Gênero"));
        txtGenero = new JTextField();
        painelFormulario.add(txtGenero);

        painelFormulario.add(new JLabel("Valor da Locação (R$): "));
        txtValor = new JTextField();
        painelFormulario.add(txtValor);

        //Painel de opção do formato do formulário
        painelFormulario.add(new JLabel("Salvar com: "));
        JPanel painelRadios = new JPanel(new FlowLayout(FlowLayout.LEFT));

        rbTxt = new JRadioButton(".TXT (texto)");
        rbCsv = new JRadioButton(".CSV (texto plus");
        rbTxt.setSelected(true);

        //Agrupa os botões para que apenas um seja selecionado por vez
        ButtonGroup groupoArquivo = new ButtonGroup();
        groupoArquivo.add(rbTxt);
        groupoArquivo.add(rbCsv);

        painelRadios.add(rbTxt);
        painelRadios.add(rbCsv);
        painelFormulario.add(painelRadios);

        add(painelFormulario, BorderLayout.NORTH);

        //Área central onde será exibido os dados
        areaExibicao = new JTextArea();
        areaExibicao.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaExibicao);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Registro Salvos: "));
        add(scrollPane, BorderLayout.CENTER);

        //Painel inferior, botões de ação
        JPanel painelBotoes = new JPanel();
        JButton btnSalvar = new JButton("Salvar Filme");
        JButton btnLer = new JButton("Ler Arquivo");

        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnLer);
        add(painelBotoes, BorderLayout.SOUTH);

        //Ação do botão Salvar

        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {salvarDados();}
        });

        btnLer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {lerDados();}
        });
    }

    // Metodo que contém a lógica de escrita no arquivo
    private void salvarDados(){
        String filme = txtFilme.getText();
        String genero = txtGenero.getText();
        String valor = txtValor.getText();

        if(filme.isEmpty() || genero.isEmpty() || valor.isEmpty()){
            JOptionPane.showMessageDialog(this,  "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean isText = rbTxt.isSelected();
        String nomeArquivo = isText ? "locadora.txt" : "locadora.csv";
        String linhaParaSalvar = "";

        //Formata a string dependendo da escolha do usuário
        if (isText){
            linhaParaSalvar = String.format("Filme: %s | Gênero: %s | Valor: R$ %s\n", filme, genero, valor);
        } else{
            linhaParaSalvar = String.format("%s;%s;%s\n", filme, genero, valor);
        }

        //true no fileWriter faz o "append" (adiciona no final sem apagar o que já tem)
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeArquivo, true))){

            //Se for CSV e o arquivo estiver vazio, podemos adicionar o cabeçalho
            File arquivo = new File(nomeArquivo);
            if(!isText && arquivo.length() == 0){escritor.write("Filme;Genero;Valor\n");}

            escritor.write(linhaParaSalvar);
            JOptionPane.showMessageDialog(this, "Filme salvo com sucesso em " + nomeArquivo);

            //Limpa os campos após salvar
            txtFilme.setText("");
            txtGenero.setText("");
            txtValor.setText("");
            txtFilme.requestFocus();
        } catch(IOException e){
            JOptionPane.showMessageDialog(this, "Erro ao Salvar" + e.getMessage());
        }
    }

    //Metodo que contém a lógica de leitur do arquivo
    private void lerDados(){
        boolean isTxt = rbTxt.isSelected();
        String nomeArquivo = isTxt ? "locadora.txt" : "locadora.csv";

        File arquivo = new File(nomeArquivo);
        if(!arquivo.exists()){
            JOptionPane.showMessageDialog(this, "O arquivo " + nomeArquivo + " ainda não ");
            return;
        }

        //Limpa a tela antes de mostrar os novos dados
        areaExibicao.setText("");

        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))){
            String linha;
            while((linha = leitor.readLine()) != null){
                areaExibicao.append(linha + "\n"); //Joga a linha na tela
            }
        }catch (IOException ex){
            JOptionPane.showMessageDialog(this, "Erro ao ler o arquivo: " + ex.getMessage());
        }
    }

    //Metodo principal para rodar a tela
    public static void main(String[] args){ new Main2().setVisible(true);}
}
