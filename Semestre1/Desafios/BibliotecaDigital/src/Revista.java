public class Revista extends ItemAcervo{
    private String titulo, autor, edicao;
    private int ano, numPagina;

    public Revista(String titulo, String autor, int ano, int numPagina, String edicao){
        super(titulo, autor, ano, numPagina);
        this.edicao = edicao;
    }

    public String getEdicao(){return this.edicao;}

    public void modfEdicao(){
        String newEdicao;
        do{
            System.out.printf("Digite o nome da edição: ");
            newEdicao = scan.nextLine();

            if (newEdicao.isEmpty()){
                System.out.println("Digite uma edição!!");
            }

        }while(newEdicao.isEmpty());
        this.edicao = newEdicao;
        System.out.println("Edição atualizado!!");
    }

    @Override
    public String mostrarFichaCatalogo() {
        return "Título: " + getTitulo() + " | Edição: " + getEdicao() + " | Autor: " + getAutor() + " | Ano: " + getAno() + " | Número de páginas: " + getNumPaginas();
    }
}
