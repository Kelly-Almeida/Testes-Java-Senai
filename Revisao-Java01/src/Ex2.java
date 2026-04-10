//Programa de solitação de nome do usuário

import java.util.Scanner;
void main() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Digite seu nome: ");
    String nome = scan.nextLine();

    System.out.printf("Olá %s", nome);
}