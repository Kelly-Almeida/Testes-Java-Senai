import java.util.Scanner;

public abstract class ItemAcervo {
    Scanner scan = new Scanner(System.in);

    private String titulo;
    private String autor;
    private int ano;
    private int numPaginas;
    private boolean disponivel = true;

    public ItemAcervo(String titulo, String autor, int ano, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
    }


    //Metodos sets
    public String getTitulo(){
        return this.titulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public int getAno(){
        return this.ano;
    }
    public int getNumPaginas(){
        return this.numPaginas;
    }
    public String getDisponivel(){
        if(this.disponivel){
            return "disponível";
        }else{
            return "em emprestimo";
        }
    }

    //Metodo de modificação
    public void modfTitulo(){
        String newTitulo;
        do{
            System.out.printf("Digite o novo título: ");
            newTitulo = scan.nextLine();

            if (newTitulo.isEmpty()){
                System.out.println("Digite um título!!");
            }

        }while(newTitulo.isEmpty());
        this.titulo = newTitulo;
        System.out.println("Título atualizado!!");
    }
    public void modfAutor(){
        String newAutor;
        do{
            System.out.printf("Digite o novo nome do autor: ");
            newAutor = scan.nextLine();

            if (newAutor.isEmpty()){
                System.out.println("Digite um autor!!");
            }

        }while(newAutor.isEmpty());
        this.autor = newAutor;
        System.out.println("Autor atualizado!!");
    }
    public void modfAno(){
        int newAno;
        do{
            System.out.printf("Digite o novo ano: ");
            newAno = scan.nextInt();

            if (newAno <= 0){
                System.out.println("Digite um ano válido!!");
            }

        }while(newAno <= 0);
        this.ano = newAno;
        System.out.println("Ano atualizado!!");
    }
    public void modfNumPaginas(){
        int newNumPaginas;
        do{
            System.out.printf("Digite o novo número de páginas: ");
            newNumPaginas = scan.nextInt();

            if (newNumPaginas <= 0){
                System.out.println("Digite um número de páginas válido!!");
            }

        }while(newNumPaginas <= 0);
        this.numPaginas = newNumPaginas;
        System.out.println("Número de páginas atualizado!!");
    }

    //Metodos de emprestimo
    protected void emprestado(){
        this.disponivel = false;
        System.out.println(getTitulo()+ " em emprestimo");
    }
    protected void disponibilizar(){
        this.disponivel = true;
        System.out.println(getTitulo() + " disponível");
    }


    public abstract String mostrarFichaCatalogo();

}
