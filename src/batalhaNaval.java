import java.util.Scanner;
import java.util.Random;

Random random = new Random();
Scanner scan = new Scanner(System.in);
boolean jogar = true;


void main() {
    do{
        boolean fimpartida = false;

        //Sorteio navios
        //Navio 1
        int [] nav1 = sorteio();

        //Navio 2
        int [] nav2;
        do{
            nav2 = sorteio();
        }while(nav1[0] == nav2 [0] && nav1[1] == nav2[1]);

        //Sorteio bombas

        //Bomba 1
        int [] bomb1;
        do{
            bomb1 = sorteio();
        }while((nav1[0] == bomb1[0] && nav1[1] == bomb1[1]) || (nav2[0] == bomb1[0] && nav2[1] == bomb1[1]));

        //bomba 2
        int [] bomb2;
        do{
            bomb2 = sorteio();
        }while((nav1[0] == bomb2[0] && nav1[1] == bomb2[1]) || (nav2[0] == bomb2[0] && nav2[1] == bomb2[1]) || (bomb1[0] == bomb2[0] && bomb1[1] == bomb2[1]));

        //bomba 2
        int [] bomb3;
        do{
            bomb3 = sorteio();
        }while((nav1[0] == bomb3[0] && nav1[1] == bomb3[1]) || (nav2[0] == bomb3[0] && nav2[1] == bomb3[1]) || (bomb1[0] == bomb3[0] && bomb1[1] == bomb3[1]) || (bomb2[0] == bomb3[0] && bomb2[1] == bomb3[1]));


        //Inicialização/reinicialização de tabela mar
        String [][] mar = {
                {" 1", " 2", " 3", " 4"},
                {" 5", " 6", " 7", " 8"},
                {" 9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        do{
            System.out.println("-+-+-+-+-+ Batalha Naval +-+-+-+-+");
            //Mostrar tela
            telaMar(mar);

            //Escolha jogada
            jogada(mar);

            //Verificação de navio
            fimpartida = radar(mar, nav1, nav2);

            if (!fimpartida){
                //Verificação de bombas
                fimpartida = explosao(mar, bomb1, bomb2, bomb3);
            }

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

        if (resp.contains("não") || resp.contains("Não") || resp.contains("NÃO")){
            System.out.println("Tenha uma boa noite!");
            jogar = false;
        } else if ((resp.contains("sim")) || (resp.contains("Sim")) || (resp.contains("SIM"))){
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


    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

    for (int i = 0; i < 4; i++){
        for (int j = 0; j < 4; j++){
            System.out.print(mar[i][j] + " | ");
        }
        System.out.println(" ");
    }
    System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
}

int []  sorteio (){
    int [] nav = {random.nextInt(0,4), random.nextInt(1,4)};
    return nav ;
}

void jogada(String[][] mar){
    boolean jogando = true;
    String escolha;

    do{
        System.out.println("Escolha uma posição: ");
        escolha = scan.nextLine();
        switch (escolha){
            case "1":
                jogando = verificacao(mar, 0, 0);
                break;

            case "2":
                jogando = verificacao(mar, 0, 1);
                break;

            case "3":
                jogando = verificacao(mar, 0, 2);
                break;

            case "4":
                jogando = verificacao(mar, 0, 3);
                break;

            case "5":
                jogando = verificacao(mar, 1, 0);
                break;
            case "6":
                jogando = verificacao(mar, 1, 1);
                break;

            case "7":
                jogando = verificacao(mar, 1, 2);
                break;

            case "8":
                jogando = verificacao(mar, 1, 3);
                break;

            case "9":
                jogando = verificacao(mar, 2, 0);
                break;

            case "10":
                jogando = verificacao(mar, 2, 1);
                break;

            case "11":
                jogando = verificacao(mar, 2, 2);
                break;

            case "12":
                jogando = verificacao(mar, 2, 3);
                break;

            case "13":
                jogando = verificacao(mar, 3, 0);
                break;

            case "14":
                jogando = verificacao(mar, 3, 1);
                break;

            case "15":
                jogando = verificacao(mar, 3, 2);
                break;

            case "16":
                jogando = verificacao(mar, 3, 3);
                break;

            default:
                System.out.println("Oh demônio!!");
                break;
        }

    }while(jogando);
}

boolean verificacao(String [][] mar, int i, int l){
    boolean resp;
    if (mar[i][l].equals("-")){
        System.out.println("Jogada inválida");
        resp = true;
    }else{
        mar [i][l] = "-";
        resp = false;
    }
    return resp;
}

boolean radar (String [][] mar, int [] n1, int [] n2){
    boolean resp = false;
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            if ((mar[i][j].equals("-") && n1[0] == i && n1[1] == j) || (mar[i][j].equals("-") && n2[0] == i && n2[1] == j)){
                mar[i][j] = ",";
                System.out.println("Inimigo abatido!!");
                telaMar(mar);
                System.out.println("--- FIM DE JOGO ---");
                resp = true;
            }
        }
    }
    return resp;
}

boolean explosao (String [][] mar, int [] b1, int [] b2, int [] b3){
    boolean resp = false;
    for(int i = 0; i < 4; i++){
        for(int j = 0; j < 4; j++){
            if ((mar[i][j].equals("-") && b1[0] == i && b1[1] == j) || (mar[i][j].equals("-") && b2[0] == i && b2[1] == j) || (mar[i][j].equals("-") && b3[0] == i && b3[1] == j)){
                mar[i][j] = "*";
                System.out.println("BUMMMMMMMMMMM!!!!!!!");
                telaMar(mar);
                System.out.println("--- FIM DE JOGO ---");
                resp = true;
            }
        }
    }
    return resp;
}


