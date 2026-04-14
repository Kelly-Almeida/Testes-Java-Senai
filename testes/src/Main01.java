import javax.swing.*;

public class Main01{
    static void main() {
        JOptionPane.showMessageDialog(null, "Karalho"); //Mensagem na tela
        String nome = JOptionPane.showInputDialog("Qual é seu nome? "); //Entrada de dados
        int op = JOptionPane.showConfirmDialog(null,  "Aceita tomar uma pinguinha?");


        if (op == 0){
            JOptionPane.showMessageDialog(null, "Então boraaaa");
        }else if(op == 1){
            JOptionPane.showMessageDialog(null,"Sem graça");
        }else{
            JOptionPane.showMessageDialog(null, "Grosso");
        }

        String[] btns = {"BTN 1", "BTN 2", "BTN 3"};

        int escolha = JOptionPane.showOptionDialog(
                null,
                "Menssagem",
                "Título",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                btns,
                btns[1]
        );
    }
}

