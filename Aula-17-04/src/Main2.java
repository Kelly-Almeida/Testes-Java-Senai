import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Main2 extends JFrame {
    private JTextField txtFilme, txtGenero, txtValor;
    private JRadioButton rbTxt, rbCsv;
    private JTextArea areaexibicao;

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


    }
}
