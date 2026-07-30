import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class MaquinaDeBebida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int op;
        boolean ligada = false;

        do{
            System.out.println("Deseja ligar a máquina de café?\n1 - Sim\n2 - Não\n==> ");
            op = scan.nextInt();

            if (op != 1 && op != 2){
                System.out.println("Opção inválida!!");
            }else if (op == 1){
                ligada = true;
            }

        }while(op != 1 && op != 2);

        List <Object> bebidas = new ArrayList<>();
        do{
            Bebida bebidinha = null;
            System.out.println("Escolha a bebida:\n1 - Café\n2 - Chá\n==> ");
            int escolha = scan.nextInt();

            if (escolha == 1){
                bebidinha = new cafe();
            }else if (escolha == 2){
                bebidinha = new Cha();
            } else{
                System.out.println("Opção inváida!");
            }

            if (bebidinha != null){
                bebidas.add(bebidinha);
                bebidinha.preparar();
            }

            System.out.println("Deseja desligar a máquina?\n1 - Sim\n2 - Não");
            int escol = scan.nextInt();

            if (escol == 2){
                ligada = false;
            }
        }while (ligada);

        System.out.println("BOM DIA!!");

    }
}