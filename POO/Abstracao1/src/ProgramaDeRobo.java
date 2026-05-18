import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaDeRobo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        List<Acao> programa = new ArrayList<>();

        int op = 0;

        while (op != 4){
            System.out.println("\n--- Programa de Robô ---");
            System.out.println("1 - Adicionar Ação: Andar ");
            System.out.println("2 - Adicionar Ação: Girar ");
            System.out.println("3 - Ver programa");
            System.out.println("4 - Executar programa e sair");
            op = scan.nextInt();

            if (op == 1) programa.add(new Andar(10));
            if (op == 2)programa.add(new Girar("direita"));
            if (op == 3) System.out.println("Programa tem " + programa.size() + " ações.");

        }
        System.out.println("\n--- Executando programa do Robô");

        for(Acao acao : programa){
            acao.executar();
        }

        System.out.println("---- Fim da execução ----");
        scan.close();
    }

}
