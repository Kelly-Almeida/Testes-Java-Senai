import java.util.Scanner;

public class Teste4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int quantAlunos;
        int[] notas = new int[4];
        String nome;

        System.out.print("Quantidade de alunos para cadastrar: ");
        quantAlunos = scan.nextInt();

        Aluno[] alunos = new Aluno[quantAlunos];
        int[] id = new int[quantAlunos];

        for(int i = 0; i < quantAlunos; i++){
            System.out.print("Digite o ID do aluno: ");
            id[i] = scan.nextInt();

            scan.nextLine();

            System.out.print("Digite o nome do aluno: ");
            nome = scan.nextLine();

            System.out.println("Digite as notas abaixo: ");
            for(int l: notas){
                notas[l] = scan.nextInt();
            }

             alunos[i] = new Aluno(id[i], nome, notas);
            
            alunos[i].mostrarDados();
            alunos[i].mostrarNotas();
        }
        
        
    }
}