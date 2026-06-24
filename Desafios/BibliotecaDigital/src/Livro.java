public class Livro extends ItemAcervo{
    private String titulo;
    private String autor;
    private int ano;
    private int numPaginas;
    private String genero;


    public Livro(String titulo, String autor, int ano, int numPaginas,String genero){
        super(titulo, autor, ano, numPaginas);
        this.genero = genero;
    }

    public String getGenero(){return this.genero;}
    public void modfGenero(){
        String newGenero;
        do{
            System.out.printf("Digite o gênero: ");
            newGenero = scan.nextLine();

            if (newGenero.isEmpty()){
                System.out.println("Digite um gênero!!");
            }

        }while(newGenero.isEmpty());
        this.genero = newGenero;
        System.out.println("Gênero atualizado!!");
    }

    @Override
    public String mostrarFichaCatalogo() {
        return "Título: " + getTitulo() + " | Autor: " + getAutor() + " | Ano: " + getAno() + "| Número de páginas: " + getNumPaginas();
    }
}
