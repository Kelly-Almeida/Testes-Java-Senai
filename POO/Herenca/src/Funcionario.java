public class Funcionario {
    //atributos comuns entre classes
    protected String nome;
    protected double salario;

    //Inicialzação dos atributos da classe mãe
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void trabalhar(){
        System.out.println(this.nome + " está trabalhando");
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return  salario;
    }
}