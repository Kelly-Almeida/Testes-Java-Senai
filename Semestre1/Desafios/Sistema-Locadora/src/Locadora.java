import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private String nome;
    private List<Filme> filmes;

    public Locadora(String nome){
        this.nome = nome;
        this.filmes = new ArrayList<>();
    }

    public String getNome(){return this.nome;}
    public void getFilmes(){
        if (this.filmes.isEmpty()){
            System.out.println("Não há filmes cadastrados!");
        }else{
            for(int i = 1; i <= filmes.size(); i++){
                System.out.println(i +" - Título: " +  filmes.get(i - 1).getTitulo() + ", Ano: " + filmes.get(i - 1).getAnoLancamento() + ", Minutos: " + filmes.get(i -1).getTempoDuracao() + " minutos");
            }
        }
    }
    public void addFilme(Filme filme){
        this.filmes.add(filme);
        System.out.println("Filme adicionado!!");
    }

}
