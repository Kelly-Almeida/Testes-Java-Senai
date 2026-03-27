import java.util.Scanner;
import java.util.Locale;
class Aula5_1{
    public void main() {
        Scanner scan = new Scanner(System.in);
        String [] nomes = new String[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Digite o " + (i + 1) +"º nome: ");
            nomes[i] = scan.nextLine();
        }

        for(int i = 0; i < 5; i++){
            System.out.println("Demônio "+ (i + 1) + "°: " + nomes[i]);
        }
    }
}

