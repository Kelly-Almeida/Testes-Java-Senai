import java.security.PublicKey;
import java.util.Scanner;
class Funcionario{
    private String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getName(){return nome;}

    public double calcularSalario(){
        return salarioBase;
    }
}

class Gerente extends Funcionario{
    public Gerente (String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario(){
        return salarioBase + 2000.00;
    }
}

class Vendedor extends Funcionario{
    private double totalVendas, comissao;

    public Vendedor(String nome, double salarioBase, double totalVendas, double comissao){
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario(){
        return salarioBase + (totalVendas * (comissao/100));
    }
}

class Estoquista extends Funcionario{
    private double horasTrabalhadas;

    public Estoquista (String nome, double salarioBase, double horasTrabalhadas){
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario(){
        return salarioBase + (horasTrabalhadas * 20);
    }
}

class FolhaPagamento{
    public void imprimirContraCheque(Funcionario f){
        System.out.println("\n=========== CONTRACHEQUE ===========");
        System.out.println("Colaborador: " + f.getName());
        System.out.println("Cargo: " + f.getClass().getSimpleName());
        System.out.printf("Total a Receber: R$%.2f\n", f.calcularSalario());
        System.out.println("=======================================");
    }
}

public class SistemaRH {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        FolhaPagamento rh = new FolhaPagamento();

        System.out.println("===========================================");
        System.out.println("\tSISTEMA DE GESTÃO DE PESSOAS");
        System.out.println("===========================================");
        System.out.println("Nome do colaborador: ");
        String nome = scan.nextLine();

        System.out.println("Salário base: R$");
        double salario = scan.nextDouble();

        System.out.println("\nSelecione o cargo: ");
        System.out.println("1 - Gerente");
        System.out.println("2 - Vendedor");
        System.out.println("3 - Estoquista");

        int op = scan.nextInt();

        Funcionario colaborador = null;

        switch (op){
            case 1:
                colaborador = new Gerente(nome, salario);
                break;
            case 2:
                System.out.println("Informe o total das vendas: ");
                float totalVendas = scan.nextFloat();

                System.out.println("Comissão (%): ");
                float comissao = scan.nextFloat();

                colaborador = new Vendedor(nome, salario, totalVendas, comissao);
                break;
            case 3:
                System.out.println("Quantidade de horas extras trabalhadas: ");
                float horasTrabalhadas = scan.nextFloat();

                colaborador = new Estoquista(nome, salario, horasTrabalhadas);
                break;
        }

        if (colaborador != null){
            rh.imprimirContraCheque(colaborador);
        } else {
            System.out.println("ERRO: Cargo inválido.");
        }

        scan.close();
    }
}
