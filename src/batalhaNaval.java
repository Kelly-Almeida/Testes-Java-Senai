import java.util.Scanner;
import java.util.Random;
Random random = new Random();
Scanner scan = new Scanner(System.in);
boolean jogar = true;


void main() {
    do{
        boolean fimpartida = false;
        do{
            //Sorteio navios
            //Navio 1
            int [] nav1 = sorteioNav();

            //Navio 2
            int [] nav2;
            do{
                nav2 = sorteioNav();
            }while(nav1[0] == nav2 [0] && nav1[1] == nav2[1]);

            //Navio 3
            int [] nav3;
            do{
                nav3 = sorteioNav();
            }while((nav1[0] == nav3[0] && nav1[1] == nav3[1]) || (nav2[0] == nav3[0] && nav2[1] == nav3[1]));

            //Sorteio bombas

            //Inicialização/reinicialização de tabela mar
            String [][] mar = {
                    {" 1", " 2", " 3", " 4"},
                    {" 5", " 6", " 7", " 8"},
                    {" 9", "10", "11", "12"},
                    {"13", "14", "15", "16"}
            };
            telaMar(mar);

            //Escolha jogada

            //Verificação da jogada

            //Verificação do fim da partida
        }while(!fimpartida);

        telaContinuidade();

    }while(jogar);
}


boolean telaContinuidade( ){
    boolean fimFuncao = true;
    do{
        String resp;
        System.out.println("---------------------");
        System.out.println("Deseja continuar?");
        resp = scan.nextLine();

        if (resp.contains("não") || resp.contains("Não")){
            System.out.println("Tenha uma boa noite!");
            jogar = false;
        } else if ((resp.contains("sim")) || (resp.contains("Sim"))){
            jogar = true;
        } else{
            System.out.println("Resposta não compreendida!!");
            continue;
        }
        fimFuncao = false;
    }while(fimFuncao);
    return jogar;
}

void telaMar(String [][] mar){

    System.out.println("-+-+-+-+-+ Batalha Naval +-+-+-+-+");
    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

    for (int i = 0; i < 4; i++){
        for (int j = 0; j < 4; j++){
            System.out.print(mar[i][j] + " | ");
        }
        System.out.println(" ");
    }
    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
}

 int []  sorteioNav (){
    int [] nav = {random.nextInt(0,4), random.nextInt(1,4)};
    return nav ;
}