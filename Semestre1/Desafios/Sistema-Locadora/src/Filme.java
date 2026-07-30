public class Filme {
    private String titulo, genero;
    private int anoLancamento, tempoDuracao;

    public Filme(String titulo, String genero, int anoLancamento, int tempoDuracao){
        this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.tempoDuracao = tempoDuracao;
    }

    public String getTitulo(){return this.titulo;}
    public String getGenero(){return this.genero;}
    public int getAnoLancamento(){return this.anoLancamento;}
    public int getTempoDuracao(){return this.tempoDuracao;}
}
