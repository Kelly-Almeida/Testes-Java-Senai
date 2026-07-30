import java.util.Scanner;
void main() {
    //Declarações
    Scanner scan = new Scanner(System.in);
    String [] nomes = new String [5];
    float [][] notas = new float [5][4];
    float [] medias = new float[5];

    //Prenchimento com dados
    for (int i = 0; i < 5; i++){

        System.out.print("Digite o nome do aluno(a)  número " + (i + 1) + " de 5: ");
        if(i != 0){
            scan.nextLine();
        }

        nomes[i] = scan.nextLine();

        for (int j = 0; j < 4; j++){
            System.out.print("Digite a nota " + (j + 1) + " do aluno(a) "+ nomes[i] + ": ");
            notas[i][j] = scan.nextInt();
        }

        medias[i] = (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3])/ 4;
    }

    //Apresenatação de resultados
    for (int i = 0; i < 5; i++){
        if (medias[i] >= 6){
            System.out.println("O aluno(a) " + nomes[i] + " foi aprovado com média: " + medias[i]);
        } else{
            System.out.println("O aluno(a) " + nomes[i] + " foi reprovado com média: " + medias[i]);
        }
    }
}