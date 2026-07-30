import java.util.Scanner;

void main() {
    Scanner scan = new Scanner(System.in);
    String[][] pessoas = new String[3][2];

    System.out.println("=== Cadastro de pessoas ===");
    for (int l = 0; l < 3; l++){
        System.out.print("Digite o " + (l + 1) + " nome: ");
        pessoas[l][0] = scan.nextLine();

        System.out.print("Digite a idade de " + pessoas[l][0] + ": ");
        pessoas[l][1] = scan.nextLine();
    }
    System.out.println("-----------------");
    System.out.println("    Tabela final");
    for (int i = 0; i < 3; i++){
        for (int j = 0; j < 2; j++){
            System.out.print(pessoas[i][j] + "\t\t");
        }
        System.out.println(" ");
    }
}
