/*Biblioteca*/
public class Biblioteca{
    private Usuario leitores;
    private Livro acervo;
    private Emprestimo emprestimos;

    public Biblioteca (Usuario leitores, Livro acervo, Emprestimo emprestimos){
        this.leitores = leitores;
        this.acervo = acervo;
        this.emprestimos = emprestimos;
    }
}