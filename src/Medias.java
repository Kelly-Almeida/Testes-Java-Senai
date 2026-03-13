import java.util.Scanner;
import java.util.Locale;
void main() {
    Scanner scan = new Scanner(System.in);
    scan.useLocale(Locale.US);
    int parar = 1;
    do {
        double soma = 0, media, frequencia, quantAulas, aulasPre;
        double notas[] = new double[4];
        int i;

        System.out.flush();
        System.out.println("----------------------------");
        System.out.println("----- Calculo de notas -----");
        System.out.println("----------------------------");

        for ( i = 0; i< 4; i++){
            System.out.println("Digite sua "+ (i +1) +" nota: ");
            notas[i] = scan.nextFloat();

            if (notas[i] < 0){
                System.out.println("Oh demônio! você é burro assim?");
                break;
            }else{
                soma += notas[i];
            }
        }

        System.out.println("Digite a quantidade de aulas: ");
        quantAulas = scan.nextInt();

        System.out.println("Digite a quantidade de aulas presentes: ");
        aulasPre = scan.nextInt();


        media = soma/4;
        frequencia = aulasPre/quantAulas;
        System.out.println("Sua média é "+ media);
        System.out.println("Sua frequência é " + (frequencia * 100) +"%");


        if (frequencia >=0.75 && media >= 6){
            System.out.println("Você foi aprovado!");

        } else if ((media < 6 && media >= 2 ) && frequencia > 0.75){
            System.out.println("Você está de recuperação!");

        } else if (frequencia < 0.75 && media < 0){
            System.out.println("Tava dormindo na aula!");
        } else {
            System.out.println("Reprovado!!");
        }

        System.out.println("Digite 0 para terminar o calculo: ");
        parar = scan.nextInt();

    }while(parar != 0);
}
