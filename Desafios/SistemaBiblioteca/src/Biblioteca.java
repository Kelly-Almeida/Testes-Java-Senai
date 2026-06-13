/*Biblioteca*/
import java.util.List;
import java.util.ArrayList;import java.util.Scanner;


public class Biblioteca{
    private String nome;
    private String senha;
    private List <Usuario> leitores;
    private List <Livro> acervo;
    private List <Emprestimo> emprestimos;

    public Biblioteca (String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome(){return this.nome;}

    private Boolean veriSenha(String senhaInput){return senhaInput.equals(this.senha);}

    public void addLivro(Livro newLivro){
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.println("Digite a senha do administrador: ");
            String senha = scan.nextLine();
            if(veriSenha(senha)){
                if (newLivro != null){
                    acervo.add(newLivro);
                    System.out.println("Livro adicionado com sucesso!!");
                }else{
                    System.out.println("Erro ao adicionar!! Tente novamente");
                }
                break;
            }else{
                System.out.println("Senha incorreta!!");
                if(i == 2){
                    System.out.println("Operação bloqueada!! Limite de tentativas atingido!");
                }
            }


        }

    }

    public void addUser(Livro newLivro){
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.println("Digite a senha do administrador: ");
            String senha = scan.nextLine();
            if(veriSenha(senha)){
                if (newLivro != null){
                    acervo.add(newLivro);
                    System.out.println("Livro adicionado com sucesso!!");
                }else{
                    System.out.println("Erro ao adicionar!! Tente novamente");
                }
                break;
            }else{
                System.out.println("Senha incorreta!!");
                if(i == 2){
                    System.out.println("Operação bloqueada!! Limite de tentativas atingido!");
                }
            }


        }

    }
}