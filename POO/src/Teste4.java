import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.ArrayList;

public class Teste4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        boolean rodar = true;
        int escol;

        ArrayList <Aluno> alunos = new ArrayList<>();


        //alunos.get(i).mostrarDados();
        //alunos.get(i).mostrarNotas();

        
        do{
            System.out.println("=======================");
            System.out.println("\tCOLÉGIO X");
            System.out.println("=======================");

            System.out.println("Escolha um número para realizar um dos processos: ");
            System.out.println("[1] - Cadastrar Aluno");
            System.out.println("[2] - Buscar Aluno");
            System.out.println("[3] - Lista de alunos");
            System.out.print("==> ");

            escol = scan.nextInt();

            switch (escol){
                case  1:
                    cadastrarAluno(alunos);
                    break;
                case 2:
                    buscarAluno(alunos);
                    break;
                case 3:
                    //listarAlunos();
                    break;
                default:
                    System.out.println("Valor inválido!! Tente novamente!");
                    break;
            }

        }while(rodar);
    }

    public static void cadastrarAluno(ArrayList <Aluno> alunos){
        Scanner scan = new Scanner(System.in);
        float[] notas = new float[4];
        int id;
        String nome;

        System.out.print("\nDigite o ID do aluno: ");
        id = scan.nextInt();

        scan.nextLine();

        System.out.print("Digite o nome do aluno: ");
        nome = scan.nextLine();

        System.out.println("Digite as notas abaixo: ");
        for(int l = 0; l < 4; l++){
            notas[l] = scan.nextFloat();
        }
        alunos.add(new Aluno(id,nome, notas));
    }

    public static void buscarAluno(ArrayList <Aluno> alunos){
        System.out.println("===================");
        System.out.println("\tBanco de alunos");
        System.out.println("===================");


        //System.out.println("Quantidade de alunos: " + alunos.size());
    }

    public static void listarAlunos(){

    }
}