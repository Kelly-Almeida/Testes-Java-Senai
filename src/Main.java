import java.util.Scanner;
import java.util.Locale;
void main() {
    Scanner scan = new Scanner(System.in);
    scan.useLocale(Locale.US);
    Boolean calc = true;
    //Calculadora simples
    do{
        Boolean fimEsc = false;
        int op = 0;
        float resul;

        System.out.println("\n======= Calcular ======");
        System.out.println("=======================");

        //Escolha de primeiro número
        System.out.print("Digite o primeiro número: ");
        float n1 = scan.nextFloat();

        //Escolha da operação
        do{
            System.out.println("Escolha a operação: ");
            System.out.println("[1] - Adição");
            System.out.println("[2] - Subtração");
            System.out.println("[3] - Multiplicação");
            System.out.println("[4] - Divisão");
            System.out.println("[5] - Módulo");

            op = scan.nextInt();

            //Verificação de operação
            if ((op > 0) && (op < 6)){
                fimEsc = true;
            } else{
                System.out.println("Escolha uma operação válida!!!");
            }

        }while(!fimEsc);

        fimEsc = false;
        //Escolha do segundo número
        float n2;
        do{
            System.out.print("Digite o segundo número: ");
            n2 = scan.nextFloat();

            //Teste de equação válida
            if ((n2 == 0) && ((op == 5) || (op == 4))){
                System.out.println("A equação é inválida!!!");
            }else {
                fimEsc = true;
            }
        }while(!fimEsc);

        //Saída dos calculos
        switch (op){
            case 1:
                resul = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + resul);
                break;
            case 2:
                resul = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + resul);
                break;
            case 3:
                resul = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + resul);
                break;
            case 4:
                resul = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + resul);
                break;
            case 5:
                resul = n1 % n2;
                System.out.println(n1 + " % " + n2 + " = " + resul);
                break;
        }

        //Escolha se vai desligar a calculadora
        int seguir;
        do{
            System.out.println("Deseja continuar? \n[1] - Sim\n[2] - Não");
            seguir = scan.nextInt();
            if (seguir == 2){
                calc = false;
            } else if ((seguir != 1) && (seguir != 2)) {
                System.out.println("Digite uma opção válida!!");
            }
        }while((seguir != 2) && (seguir != 1));
    }while (calc);
}
