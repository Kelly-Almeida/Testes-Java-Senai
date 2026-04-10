//menu simples com 3 opções de programa de TV/Internet e exiba um comentário sobre cada um
import javax.swing.*;
import java.util.Scanner;

void main() {
     Scanner scan = new Scanner(System.in);
     boolean ligado = true;

    do{
        System.out.println("============================");
        System.out.println("\tA melhor Playlist");
        System.out.println("============================");
        System.out.println("O que você deseja ouvir? ");
        System.out.println("[1] - Forró");
        System.out.println("[2] - Funk");
        System.out.println("[3] - Pagodão");
        System.out.println("[4] - Piseiro");
        System.out.println("[5] - Desligar");
        int op = scan.nextInt();

        switch (op){
            case 1:
                System.out.println("*Acionado caixa de som*");
                System.out.println(
                        "Eu moro num paraíso, sou igual Adão e Eva\n" +
                        "Só que eu vivo sozinho, esperando a Gabriela\n" +
                        "O-o-o-oi, Gabriela, quanto mais às coisas sobe\n" +
                        "Mais amor eu tenho nela\n"
                );
                break;
            case 2:
                System.out.println("*Acionando caixa de som*");
                System.out.println("Vai, DJ, mais forte\n" +
                        "Cacare', cacare', cacare', cunty\n" +
                        "Cacare', cacare', cacare', cunty\n"
                );

                break;
            case 3:
                System.out.println("*Acionando caixa de som*");
                System.out.println("É papo de maluquice\n" +
                        "O baiano tem o molho\n" +
                        "O baiano te m o molho\n" +
                        "Nós já nasce com a pimenta na cabeça da chibata\n" +
                        "E o dendê que molha o corpo todo"
                );
                break;
            case 4:
                System.out.println("*Acionando caixa de som*");
                System.out.println("Cheguei no piseiro e vejo minha namorada\n" +
                        "Indo até o chão e a galera animada\n" +
                        "Já avistei de longe ela rebolando o bundão\n" +
                        "Sai daí novinha, deixa de provocação\n" +
                        "\n" +
                        "Eu cheguei no piseiro e vejo minha namorada\n" +
                        "Indo até o chão e a galera animada\n" +
                        "Já avistei de longe ela rebolando o bundão\n" +
                        "Sai daí menina, deixa de provocação\n" +
                        "\n" +
                        "Tô descendo sim\n" +
                        "Tô rebolando sim"
                );
                break;
            case 5:
                ligado = false;
                break;
            default:
                System.out.println("Opção inválida!!");
                break;
        }


    }while(ligado);
    System.out.println("*Cixa de som desliga!*");
}