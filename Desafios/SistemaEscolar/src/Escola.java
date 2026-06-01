import java.util.List;
import java.util.ArrayList;

public class Escola {
    private List <Aluno> alunos;
    private String nome;

    public Escola(String nome){
        this.nome = nome.toUpperCase();
        this.alunos = new ArrayList<>();
    }

    public void addAluno(Aluno novoAluno){
        this.alunos.add(novoAluno);

    }

    public void showAlunos(){
        int i = 1;
        int tam = this.alunos.size();
        if (tam == 0){
            System.out.println("Não ha alunos cadastrados\n");
        }else{
            for (Aluno aluno : this.alunos){
                System.out.println(i +" - "+ aluno.getNome());
                i++;
            }
        }

    }
    public List <Aluno> getAlunos(){
        return this.alunos;
    }

    public void showNotas(){
        int i = 1;

        for (Aluno aluno : this.alunos){
            System.out.println("==== Alunos ===");
            System.out.println(i +" - "+ aluno.getMedia());
            i++;
        }
    }


    public String getNome (){
        return this.nome;
    }
}
