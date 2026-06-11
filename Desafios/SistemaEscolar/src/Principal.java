import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Escola novaescola = null;
        boolean keeepSys = true;

        do{
             keeepSys =  telaZero();
             if(keeepSys){
                novaescola = cadEscola();

                keeepSys = sysEscola(novaescola);
             }else{
                 System.out.println("Tenha um bom dia!!");
             }
        }while(keeepSys);
    }

    public static boolean telaZero(){
        Scanner scan = new Scanner(System.in);
        int resp;

        do{
            System.out.println("========== Sistema nacional escolar =========");
            System.out.println("Digte...\n1 - Cadastrar escola\n0 - Sair");
            resp = scan.nextInt();

            if (resp ==  0){
                return false;
            } else if (resp == 1) {
                return true;
            }
        }while(true);

    }

    public static Escola cadEscola(){
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("===== Cadastro escolar =====");
            System.out.println("Digiteo o nome da escola: ");
            String nome = scan.nextLine();

            if (nome == null){
                System.out.println("Digite um número!!");
            }else{
                return new Escola(nome);
            }
        }while(true);
    }

    public static  boolean sysEscola(Escola escola){
        Scanner scan = new Scanner(System.in);
        String processos [] = {
                "Cadastrar aluno", "Listar alunos", "Ver aluno", "Ver notas da turma"
        };
        do {
            System.out.println("====== Bem-vindo à Escola " + escola.getNome() + " ======");
            System.out.println("Digite...");
            int i = 1;
            for (String op : processos){
                System.out.println(i + " - " + op);
                i++;
            }
            System.out.println("0 - Sair");

            int escol = scan.nextInt();

            switch (escol){
                case 0:
                    return false;
                case 1:
                    cadAluno(escola);
                    break;
                case 2:
                    escola.showAlunos();
                    break;
                case 3:
                    System.out.println("Digite o id do aluno: ");
                    int id = scan.nextInt();
                    infoAluno(id - 1, escola);
                    break;
                case 4:
                    escola.showNotas();
                    break;
                default:
                    System.out.println("Digite um vlaor válido!!");
                    break;
            }
        }while (true);
    }

    public static void cadAluno(Escola escola){
        Scanner scan = new Scanner(System.in);

        System.out.println("\n====== Cadastro de Aluno ======");

        System.out.print("Digite o nome do aluno:");
        String nome = scan.nextLine();

        System.out.print("Digite a serie: ");
        int serie = scan.nextInt();

        System.out.print("Digite a turma: ");
        char turma = scan.next().charAt(0);


        System.out.println("Digite as notas do aluno");
        List <Float> notas = new ArrayList<>();
        for  (int i = 0; i < 4; i++){
            System.out.print("Digite a " + (i+ 1) + "° nota: ");
            float n = scan.nextInt();

            if (n < 0){
                notas.add((float) 0);
            }else{
                notas.add((float) n);
            }
        }

        System.out.print("Digite a frequencia do aluno (%): ");
        int freq = scan.nextInt();

        Aluno novoAluno = new Aluno (nome,serie, turma, notas, freq);
        escola.addAluno(novoAluno);


    }

    public static void infoAluno(int id, Escola escola){
        List <Aluno> alunos = escola.getAlunos();

        if (alunos.size() < id){
            System.out.println("Aluno não encontrado!!");
            return;
        }else{
            System.out.println("Aluno: " + alunos.get(id).getNome());
            System.out.println("Turma: " + alunos.get(id).getTurma());
            System.out.println("Notas: ");
            alunos.get(id).showNotas();
            System.out.println("Frequência: " + alunos.get(id).getFreq()+ "%");
            System.out.println("Status: " + alunos.get(id).getResultado());
        }
    }
}


