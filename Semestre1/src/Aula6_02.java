void main() {
    int[][] teclado = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    System.out.println("=== Acessando um valor específico ===");
    System.out.println("O valor no centro do teclado é: " + teclado[1][1]);
    System.out.println("\n=== Imprimindo a Matriz Completa ===");

    for(int l = 0; l < teclado.length; l++){
        for (int c = 0; c < teclado[l].length; c++){
            System.out.print(teclado[l][c] + " ");
        }
        System.out.println("");
    }
}