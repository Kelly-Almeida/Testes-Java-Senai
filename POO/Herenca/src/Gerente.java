public class Gerente extends Funcionario {
    //Exclusivo do gerente
    private String departamento;

    //Classe filha
    public Gerente (String nome, double salario, String departamento){
        //Referência a classe mãe
        super(nome, salario);
        this.departamento = departamento;
    }

    //Metodo especifico de gerente
    public void aprovarVerba(){
        System.out.println("O gerente " + this.nome + " do departamemto " + this.departamento + " aprovou a verba!!");
    }
}
