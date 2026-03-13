import java.util.Scanner;
import java.util.Locale;

void main() {
    Scanner scan = new Scanner(System.in);
    scan.useLocale(Locale.US);
    int parar = -1;

    String emailCad, senhaCad, email, senha;
    do {
        int op;

        do{
            System.out.println("======================");
            System.out.println("====== Sistema 1 =====");
            System.out.println("======================");
            System.out.println("Digite sua escolha: ");
            System.out.println("[1] - Logar");
            System.out.println("[2] - Cadastrar");
            System.out.println("[0] - Fechar");
            op = scan.nextInt();
            switch (op){
                case 1:
                    //Comando de LOGIN
                    break;
                case 2:
                    //Comando de cadastro
                    break;
                case 0:
                    System.out.println("Tenha um bom dia");
                    parar = 0;
                    break;
                default:
                    System.out.println("OH demônio!");
                    break;
            }
        } while(op != 1 && op != 2 && op != 0);

    } while (parar != 0);

}

//Adicionar funções
