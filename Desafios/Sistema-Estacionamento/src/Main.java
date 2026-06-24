import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    // Apenas um único Scanner para toda a aplicação
    static Scanner scan = new Scanner(System.in);
    static List<Estacionamento> estacionamentos = new ArrayList<Estacionamento>();
    static List<Veiculo> veiculosCad = new ArrayList<Veiculo>();

    public static void main(String[] args) {
        String[] opcoes = new String[] {"Cadastrar estacionamento", "Cadastrar veículo", "Sair"};
        int escol;

        do {
            do {
                System.out.println("========================================");
                System.out.println("\tSistema de estacionamento");
                System.out.println("========================================");

                int indexOp = 1;
                for (String ops : opcoes) {
                    System.out.println(indexOp + " - " + ops);
                    indexOp++;
                }
                escol = scan.nextInt();
                scan.nextLine();

                if (escol < 1 || escol > opcoes.length) {
                    System.out.println("Opção inválida!!");
                }

            } while (escol < 1 || escol > opcoes.length);

            if (opcoes[(escol - 1)].equals("Cadastrar estacionamento")) {
                cadEstacionamento();
            } else if (opcoes[(escol - 1)].equals("Cadastrar veículo")) {
                cadVeiculo();
            }
        } while (escol != opcoes.length);
    }

    public static void cadEstacionamento() {
        String nome;
        char cod;

        System.out.println("========================================");
        System.out.println("\tCadastro de estacionamento");
        System.out.println("========================================");

        do {
            System.out.println("Digite o nome do estacionamento: ");
            nome = scan.nextLine().trim();

            if (nome.isEmpty()) {
                System.out.println("Digite um nome!!");
            }
        } while (nome.isEmpty());

        do {
            System.out.println("Digite seu código: ");
            cod = scan.next().charAt(0);
            scan.nextLine();
        } while (cod == ' ');

        Estacionamento newEstacionamento = new Estacionamento(nome, cod);
        estacionamentos.add(newEstacionamento);

        System.out.println("Cadastro do estacionamento " + newEstacionamento.getNome() + " bem sucedido!!");
    }

    public static void cadVeiculo() {
        String placa, modelo;
        char cod;
        int codVaga;
        boolean estacionamentoExiste = false;

        System.out.println("========================================");
        System.out.println("\tCadastro de veiculo");
        System.out.println("========================================");

        if (estacionamentos.isEmpty()) {
            System.out.println("Cadastre um estacionamento antes de adicionar veículos!");
            return;
        }

        do {
            System.out.println("Digite a placa: ");
            placa = scan.nextLine().trim();
            if (placa.isEmpty()) System.out.println("Digite uma placa!!");
        } while (placa.isEmpty());

        do {
            System.out.println("Digite o modelo: ");
            modelo = scan.nextLine().trim();
            if (modelo.isEmpty()) System.out.println("Digite um modelo!!");
        } while (modelo.isEmpty());

        do {
            System.out.println("Digite o código do estacionamento: ");
            cod = scan.next().charAt(0);
            scan.nextLine();


            if (verifiqueCod(cod)) {
                estacionamentoExiste = true;
            } else {
                System.out.println("O estacionamento não existe!!");
            }
        } while (!estacionamentoExiste);

        System.out.println("Digite o número da vaga: ");
        codVaga = scan.nextInt();
        scan.nextLine();

        Veiculo newVeiculo = new Veiculo(placa, modelo, cod, codVaga);
        veiculosCad.add(newVeiculo);

        int idEstacionamento = getIdEstacionamento(cod);
        estacionamentos.get(idEstacionamento).addVeiculo(newVeiculo);

        System.out.println("Cadastro do veículo bem sucedido!!");
        System.out.println(newVeiculo.getModelo() + " - " + newVeiculo.getLocalEstacionado());
    }

    public static boolean verifiqueCod(char cod) {
        for (Estacionamento estac : estacionamentos) {
            if (estac.getCodEstacionamento() == cod) {
                return true;
            }
        }
        return false;
    }

    public static int getIdEstacionamento(char cod) {
        int i = 0;
        for (Estacionamento estac : estacionamentos) {
            if (estac.getCodEstacionamento() == cod) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
