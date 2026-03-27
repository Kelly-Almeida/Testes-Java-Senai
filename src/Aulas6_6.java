import java.util.Scanner;
void main() {
    Scanner scan = new Scanner(System.in);

    int m,n;

    System.out.print("Quantas linhas vai ter cada matriz? ");
    m = scan.nextInt();

    System.out.print("Quantas colunas vai ter cada matriz? ");
    n = scan.nextInt();

    int[][] a = new int[m][n];
    int[][] b = new int[m][n];
    int[][] c = new int[m][n];

    System.out.println("Digite os valores da matriz A: ");

    for(int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            System.out.printf("Elemento [%d,%d]: ", i,j);
            a[i][j] = scan.nextInt();
        }
    }

    System.out.println("Digite os valores da matriz B: ");

    for(int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            System.out.printf("Elemento [%d,%d]: ", i,j);
            b[i][j] = scan.nextInt();
        }
    }

    for (int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            c[i][j] = a[i][j] + b[i][j];
        }
    }

    System.out.printf("A soma dessas duas matrizes é: \n");
    for (int i = 0; i < m; i++){
        for (int j = 0;  j < n; j++){
            System.out.print(c[i][j] + "\t");
        }
        System.out.print("\n");
    }

}