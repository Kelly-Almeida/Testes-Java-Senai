import java.util.Scanner;

public class Zoologicointerativo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Animal [] jaulas = {new Leao("Simba"), new Macaco("Abu"), new Piguim("Capitão"), new Saguim("Papu")};
        Animal animalSelecionado = null;

        int op = 0;
        while (op != jaulas.length + 1){
            System.out.println("\n--- BEM-VINDO AO ZOLÓGICO ZUBUMAFU ---");
            System.out.println("Escolha um animal para visitar: ");
            for (int i = 0; i < jaulas.length; i++){
                System.out.println((i + 1) + " - " + jaulas[i].getNome() + "(" + jaulas[i].getClass().getSimpleName() + ")");
            }
            System.out.println((jaulas.length + 1) + " - Sair do Zoológico");
            System.out.println("Sua escolha: ");

            op = scan.nextInt();

            if (op > 0 && op <= jaulas.length){
                animalSelecionado = jaulas[op - 1];
                interagirComAnimal(animalSelecionado, scan);
            }else if(op != jaulas.length){
                System.out.println("Opção inváida!!");
            }
        }
        System.out.println("Obrigado pela sua visita!");
        scan.close();
    }

    public static void interagirComAnimal(Animal animal, Scanner scan){
        int op= 0;
        while(acao != 3){
            System.out.println("\nVocê está visitando " + animal.getNome() + ". O que deseja fazer? ");
            System.out.println("1 - Ouvir o barulho\n2 - Alimentar o animal\n3 - Voltar  para a entrada do Zoo\nSua escolha: ");
            acao = scan.nextInt();

            switch (acao){

            }
        }
    }
}
