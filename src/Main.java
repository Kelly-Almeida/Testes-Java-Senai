import java.util.Scanner;
void main() {
    Scanner scan = new Scanner(System.in);
    Boolean calc = true;
    //Calculadora simples
    while (calc == true){
        int op = 0;

        System.out.println("======= Calcular ======");

        //Escolha de primeiro número
        System.out.println("Digite o primeiro número: ");
        int n1 = scan.nextInt();

        Boolean fimEsc = false;
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

        }while(fimEsc == false);
    };
}
