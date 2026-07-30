import java.util.Scanner;
void main() {
    Scanner scan = new Scanner(System.in);

    int m,n;
    System.out.print("Qual a quantidade de linhas da matriz? ");
    m = scan.nextInt();

    System.out.print("Qual a quantidade de colunas? ");
    n = scan.nextInt();

    int[][] matriz = new int[m][n];

    for (int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            System.out.printf("Elemento [%d,%d]: ", i, j);
            matriz[i][j] = scan.nextInt();
        }
    }

    System.out.println("Sua matriz final: ");
    for (int i = 0; i < m; i++){
        for (int j = 0; j< n; j++){
            System.out.print(matriz[i][j] + " ");
        }
        System.out.print("\n");
    }
}