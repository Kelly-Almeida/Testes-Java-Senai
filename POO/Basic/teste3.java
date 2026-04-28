import java.util.Scanner;

public class teste3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Digite sue nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        //Criação de objeto
        Pessoa pessoa = new Pessoa(nome, idade);
        //Uso dos métodos
        System.out.println("\nInformações da pessoa: ");
        pessoa.exibirInformacoes();

        if(pessoa.isMaiorDeIdade()){
            System.out.println("Você é maior de idade!!");
        }else{
            System.out.println("Você é menor de idade!!");
        }


    }

}