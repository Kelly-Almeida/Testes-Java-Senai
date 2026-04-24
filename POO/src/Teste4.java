import java.util.Scanner;

public class Teste4 {
    public void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int quantAlunos;
        int[] notas = new int[4];
        String nome;

        System.out.print("Digite a quantidade de alunos que serão cardastrados: ");
        quantAlunos = scan.nextInt();

        for(int i = 1; i <= quantAlunos; i++){
            System.out.printf("Digite o nome do %d°: ");
            nome = scan.nextLine();

            for(int l: notas){
                System.out.printf("Digite a %d° nota: ");
                notas[i] = scan.nextInt();
            }

            Aluno "aluno" + i = new Aluno(nome, notas);
            
            "aluno"+i.mostrarDados();
            "aluno"+i.media();
        }
        
        
    }
}