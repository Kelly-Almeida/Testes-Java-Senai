import java.util.List;

public class Turma{
    private int serie;
    private char idetif;
    private List <Aluno> alunos;

    public Turma(int serie, char idetif){
        this.serie = serie;
        this.idetif = idetif;
    }

    public String getTurma(){
        return this.serie + "° " + this.idetif;
    }

    public void addAluno(Aluno novoAluno){
        this.alunos.add(novoAluno);

    }
}
