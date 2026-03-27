import java.awt.desktop.SystemEventListener;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

void main() {
    int[][] cartela = new int[5][5];
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    for (int l = 0; l < cartela.length; l++){
        for (int c = 0; c < cartela[l].length; c++){
            cartela[l][c] = rand.nextInt(75) + 1;
        }
    }

    System.out.println("=======================");
    System.out.println("  B   I   N   G   O");
    System.out.println("=======================");

    try {
        // Pausa a execução por 1 segundo (1000 milissegundos)
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        // Tratamento caso a thread seja interrompida
        Thread.currentThread().interrupt();
    }

    System.out.println("Sua cartela: ");
    for (int l = 0; l < cartela.length; l++){
        for(int c = 0; c < cartela[l].length; c++){
            System.out.print(cartela[l][c] + "\t");

            try{
                Thread.sleep(250);
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("\n");
    }

    boolean respondendo = true;
    boolean jogar = false;

    do{
        String resp;
        System.out.print("Vamos jogar? ");
        resp = scan.nextLine();
        if (resp.contains("Sim") || resp.contains("sim")){
            jogar = true;
            respondendo = false;
        } else if(resp.contains("Não") || resp.contains("não")){
            respondendo = false;
        }

    }while(respondendo);

    try{
        Thread.sleep(500);
    }catch(InterruptedException e){
        Thread.currentThread().interrupt();
    }

    if (jogar){
        System.out.print("Parte em desenvolvimento....");
    } else {
        System.out.print("Tenha uma boa noite!!!");
    }
}
