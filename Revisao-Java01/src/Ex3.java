import java.util.Scanner;

void main() {
    Scanner scan = new Scanner(System.in);

    System.out.printf("Digite seu nome: ");
    String nome = scan.nextLine();

    System.out.printf("Digite sua idade: ");
    int idade = scan.nextInt();

    System.out.printf("Olá, %s é bom conversar com uma pessoa de %d anos", nome, idade);
}