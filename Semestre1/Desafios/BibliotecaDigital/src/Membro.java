import java.util.Scanner;

public class Membro {
    Scanner scan = new Scanner(System. in);
    private String nome;
    private String telefone;
    private final int id;

    public Membro(String nome, int id, String telefone){
        this.nome = nome;
        this.id = id;
        this.telefone = telefone;
    }

    public String getNome(){return this.nome;}
    public int getId(){return this.id;}
    public String getTelefone(){return this.telefone;}

    public void mofiNome(){
        String newNome;
        do{
            System.out.printf("Digite o novo nome: ");
            newNome = scan.nextLine();

            if (nome.isEmpty()){
                System.out.println("Nome inválido!!");
            }
        }while(newNome.isEmpty());

        System.out.println("Nome alterado!");
        this.nome = newNome;
    }
    public void modfTelefone(){
        String newTelefone;
        boolean isNumero;
        do{
            System.out.printf("Digite o novo telefone: ");
            newTelefone = scan.nextLine();

            isNumero = newTelefone.matches("[0-9]+");

            if (telefone.isEmpty() || telefone.length() != 9 || !isNumero){
                System.out.println("Telefone inválido!!");
            }
        }while(nome.isEmpty() || telefone.length() != 9 || !isNumero);

        System.out.println("Telefone alterado!");
        this.telefone = newTelefone;
    }


}
