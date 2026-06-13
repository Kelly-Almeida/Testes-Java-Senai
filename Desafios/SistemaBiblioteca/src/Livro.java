/*Livro*/
public class Livro {
    private int id;
    private String titulo, autor, status, descricao, genero;
    
    public Livro (int id, String titulo, String autor, String status, String deecricao, String genero){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.status =  status;
        this.descricao = deecricao;
        this.genero =  genero;
    }

    //Métodos de leitura
    public String getTitulo (){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public String getStatus(){
        return this.status;
    }

    public String getGenero(){
        return this.genero;
    }

    public int getId (){
        return this.id;
    }


    //Metódos de Status
    public void alugar(){
        this.status = "Alugado";
    }

    public void devolver(){
        this.status = "Disponível";
    }

}
