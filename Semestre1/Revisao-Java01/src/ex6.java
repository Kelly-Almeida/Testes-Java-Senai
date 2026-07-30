//Tabuada
import java.util.Scanner;

void main() {
    Scanner scan = new Scanner(System.in);
    int cont = 1, resul;

    System.out.println("Escolha um número: ");
    int num = scan.nextInt();

    while(cont <= 10){
        resul = cont * num;
        System.out.printf("%d x %d = %d\n", num, cont, resul);
        cont++;
    }
}