import java.time.LocalDate;
public class Emprestimo {
    private int idLivro,idLeitor;
    private LocalDate dataEmprestimo, dataDevolucao;
    private String status;

    public Emprestimo (int idLeitor, int idLivro, LocalDate dataEmprestimo, LocalDate dataDevolucao, String status){
        this.idLeitor = idLeitor;
        this.idLivro = idLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
    }

    /*Comandos de leitura*/

    /*Metodos*/

}
