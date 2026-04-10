//Sistema de notas melhorado
import java.util.Scanner;

void main() {
    Scanner scan = new Scanner(System.in);

    //Solitação de nome
    System.out.print("Digite seu nome: ");
    String nome = scan.nextLine();

    //Solitação de notas
    int[] notas = new int[4];
    int soma = 0, freq;

    //Solitação de frequencia
    System.out.println("Digite sua frequência em %: ");
    freq = scan.nextInt();

    for (int i = 0; i < 4; i++){
        System.out.printf("Digite sua %d nota: ", i + 1);
        notas[i] = scan.nextInt();

        soma += notas[i];
    }

    float media = soma/4;

    //Teste de média
    if (media >= 6 && freq >= 75){
        System.out.printf("%s, vocâ passou com média %.2f e frequência %d%%", nome, media, freq);
    }else if(freq < 75){
        System.out.printf("%s, você está reprovado devido a sua frequência de %d%%", nome, freq);
    } else if (media < 6) {
        System.out.printf("%s, você está de recuperação devido a sua média de %.2f", nome, media);
    } else{
        System.out.printf("%s, você foi reprovado devido a sua média %.2f", nome, media);
    }
}